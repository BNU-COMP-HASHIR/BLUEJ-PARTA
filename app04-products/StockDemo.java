
import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;
    
    private Random generator = new Random();
    
    private int amount = 0;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
        manager.addProduct(new Product(101,"Apple iPhone 12"));
        manager.addProduct(new Product(102,"Apple iPhone 12 Mini"));
        manager.addProduct(new Product(103,"Apple iPhone 12 Pro"));
        manager.addProduct(new Product(104,"Apple iPhone 12 Pro Max"));
        manager.addProduct(new Product(105,"Apple iPhone 11"));
        manager.addProduct(new Product(106,"Apple iPhone 11 Pro"));
        manager.addProduct(new Product(107,"Apple iPhone 11 Pro Max"));
        manager.addProduct(new Product(108,"Apple iPhone Xs"));
        manager.addProduct(new Product(109,"Apple iPhone Xs Max"));
        manager.addProduct(new Product(110,"Apple iPhone Xr"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. It recieves a delivery first and then that stock is sold. 
     */
    public void runDemo()
    {
        manager.printAllProducts();
        
        int noProducts = manager.numberProductsInStock();
        
        System.out.println("No. of products in stock = " + noProducts);
        
        demoDeliverProducts();
        demoSellProducts();
    }
    
    /**
     * This method simulates the sale of products.
     */
    private void demoSellProducts()
    {
        System.out.println("Sale of Products");
        for(int id = 101; id <= 110; id++)
        {
            amount = generator.nextInt(10);
            manager.sellProduct(id, amount);
        }
        
        manager.printAllProducts();         
    }
    
    /**
     * This method simulates the delivery of products.
     */
    private void demoDeliverProducts()
    {
        System.out.println("Delivery of Products");
        for(int id = 101; id <= 110; id++)
        {
            amount = generator.nextInt(10);
            manager.delivery(id, amount);
        }
        
        manager.printAllProducts();        
    }
 
}
