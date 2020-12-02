
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Hashir Iqbal
 * @version 0.1
 */
public class StockApp
{
    // Use to get user input
    private InputReader input;

    private StockManager manager;

    private StockDemo demo;

    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager = new StockManager();
        demo = new StockDemo(manager);
    }

    /** This method runs the stockapp program
     * 
     */
    public void run()
    {
        boolean finished = false;
        while(!finished)
        {
            printHeading();
            printMenuChoices();

            String choice = input.getString();
            choice = choice.toUpperCase();
            if( choice.equals("QUIT"))
            {
                finished = true; 
            }
            else
            {
                executeMenuChoice(choice);
            }
        }
    }

    /**
     * This method executes whatever command user chooses to run.
     */
    private void executeMenuChoice(String choice)
    {
        if(choice.equals("ADD"))
        {
            addProduct();
        }
        else if(choice.equals("REMOVE"))
        {
            removeProduct();
        }
        else if(choice.equals("PRINTALL"))
        {
            printAllProducts();
        }
        else if(choice.equals("DELIVERY"))
        {
            deliverProducts();
        }
        else if(choice.equals("SELL"))
        {
            sellProduct();
        }
    }

    /**
     * This method removes a product.
     */
    public void removeProduct()
    {
       System.out.println("\nRemoving a product");
       System.out.println("Enter the product id to remove");

       String value = input.getString();
       
       int id = Integer.parseInt(value);

       manager.removeProduct(id);

    }
    
    /**
     * This method sells the product.
     */
    private void sellProduct()
    {   
        System.out.println("Enter a product ID");
 
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        System.out.println("Enter the quantity");
        value = input.getString();
        int quantity = Integer.parseInt(value);
        
        manager.sellProduct(id, quantity);
    }

    /**
     * This method adds a product.
     */
    public void addProduct()
    {
        System.out.println("\nAdding a new product");

        System.out.println("Enter the product name");
        String name = input.getString();
        while(name.equals(""))
        {
            System.out.println("\nName is null \nEnter valid name");
            name = input.getString();
        }

        System.out.println("Enter a product ID");
        String value = input.getString();

        int id = Integer.parseInt(value);

        while(manager.isDuplicate(id))
        {
            System.out.println("Duplicate id!!!!");
            System.out.println("Enter valid id");
            value = input.getString();
            id = Integer.parseInt(value);
        }

        Product product = new Product(id, name);
        System.out.println("New product added" + product + "\n");
        manager.addProduct(product);     
    }

    /**
     * This method prints all products.
     */
    public void printAllProducts()
    {
        manager.printAllProducts();
    }
    
    /**
     * Method for the delivery of products.
     */
    public void deliverProducts()
    {
        System.out.println("Enter a product ID");
 
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        System.out.println("Enter the quantity");
        value = input.getString();
        int amount = Integer.parseInt(value);
        
        manager.delivery(id, amount);
    }

    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Delivery:   Deliver the products");
        System.out.println("    Sell:       Sell the products");
        System.out.println("    Quit:       Quit the program");
        
        System.out.println();        
    }

    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println();
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Hashir Iqbal");
        System.out.println("******************************");
    }
}
