  import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (Hashir Iqbal) 
 * @version (9/11/20)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    
    /**
     * This method sells a specificed quantity of a product.
     */
    public void sellProduct(int id, int quantity)
    {
        Product product = findProduct(id);
        
        if(product!= null)
        {
            product.sell(quantity);
        }
        
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    { 
        Product product = findProduct(id);
        
        if(product != null) 
        {
            product.deliver(amount); 
        }
        else
        {
            System.out.println("\nCannot find product id " + id + "\n");
        }
   
    }
    
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        for(Product product : stock)
        {
            if(product.getID() == id)
            { 
                return product;
            }
            else
            {
                System.out.println("Cannot find product id " + id + "\n");
            }
        }
        return null;
    }
    
    /**
     * Show details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printDetails(int id)
    {
        Product product = findProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * This method shows the size of the inventory list.
     */
    public int numberProductsInStock()
    {
        return stock.size();
    }

    /**
     * Print details of all the products.
     */
    public void printAllProducts()
    {
        printHeading();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }
    }
    
    /**
     * This method prints out a heading for the stocklist.
     */
    public void printHeading()
    {
        System.out.println();
        System.out.println("=================");
        System.out.println("Hash's Stock List");
        System.out.println("=================");
        System.out.println();
        
    }
    

}
