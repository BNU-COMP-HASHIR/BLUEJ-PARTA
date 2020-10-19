/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Hashir Iqbal
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    // The Aylesbury ticket. 
    private Ticket ticketToAylesbury; 
    // The High Wycombe ticket.
    private Ticket ticketToHighWycombe; 
    // The Amersham ticket.
    private Ticket ticketToAmersham; 

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        balance = 0;
        total = 0;
       
    }
    /**
     * Function to create tickets in the ticket machine.
     */
    public void createTickets()
    {
        ticketToAylesbury = new Ticket("Aylesbury", 220);
        ticketToHighWycombe = new Ticket("High Wycombe", 330);
        ticketToAmersham = new Ticket("Amersham", 300);
        
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) 
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    
    /**
     * Function for printing all the tickets in the ticket machine.
     * 
     */
    public void printAllTickets()
    {
        System.out.println();
        System.out.println("The Blue J Line");
        System.out.println();
        ticketToAylesbury.print();
        System.out.println();
        ticketToHighWycombe.print();
        System.out.println();
        ticketToAmersham.print();
    }
    
    public void insert10Pence()
    {
        balance = balance + 100;
        System.out.println("Current Balance is = " + balance + " Pence");
    }
    
    public void insert20Pence()
    {
        balance = balance + 200;
        System.out.println("Current Balance is = " + balance + " Pence");
    }
    
    public void insert1Pound()
    {
        balance = balance + 1000;
        System.out.println("Current Balance is = " + balance + " Pence");    }
    
    public void insert2Pounds()
    {
        balance = balance + 2000;
        System.out.println("Current Balance is = " + balance + " Pence");
    }
}
