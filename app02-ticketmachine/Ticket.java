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
}

