
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
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void runDemo()
    {
        manager.printAllProducts();
        
        int noProducts = manager.numberProductsInStock();
        int amount = 0;
        System.out.println("No. of products in stock = " + noProducts);
               
        for(int id = 101; id <= 110; id++)
        {
            amount = generator.nextInt(10);
            manager.delivery(id, amount);
        }
        
        manager.printAllProducts();
    }
    
    private void demoSellProducts()
    {
        for(int id = 101; id <= 110; id++)
        {
            amount = generator.nextInt(10);
            manager.delivery(id, amount);
        }
        
        manager.printAllProducts();         
    }
    
    private void demoDelivery()
    {
        for(int id = 101; id <= 110; id++)
        {
            amount = generator.nextInt(10);
            manager.delivery(id, amount);
        }
        
        manager.printAllProducts();        
    }
 
}
