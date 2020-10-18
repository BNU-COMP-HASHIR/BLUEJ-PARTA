import java.util.Date;
/**
 * This Class is made to hold multiple destinations' tickets as objects
 *
 * @author Hashir Iqbal
 * @version 18-Oct-2020
 
 */
public class Ticket
{

    private String destination; 
    
    // this is in pence.
    private int cost;
    
    private Date datePurchased;
    
    /**  
     * Constructor of the class Ticket
     * 
     * Add in the fare cost 
     * Add in the destination 
     * 
     */
    public Ticket(String destination, int cost)
    {
        this.cost = cost;
        this.destination = destination; 
        datePurchased= new Date(); 
    
    }

    /**
     * This method is to set the cost of the ticket according to the destination 
     * 
     */
    public void setcost( int cost) 
    {
        this.cost = cost; 
       
    }
    
    /**
     * Cost accessor method to show us the cost 
     */
    
        public int getCost()
    {
        return cost;
    }
    
    /** 
     * Destination accessor method to show us the destination
     */
    public String getDestination() 
    {
        return destination; 
    }
    
    /**
     * Print method to print the tickets
     */
    public void print() 
    {
        System.out.println("Final destination: " + destination);
        System.out.println("Ticket Price: " + cost);
        System.out.println("Date Purchased: " + datePurchased);
        
    }
   
}

