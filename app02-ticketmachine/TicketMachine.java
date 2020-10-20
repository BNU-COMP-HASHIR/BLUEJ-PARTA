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
    public int cost;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    // The Aylesbury ticket. 
    public Ticket ticketToAylesbury; 
    // The High Wycombe ticket.
    public Ticket ticketToHighWycombe; 
    // The Amersham ticket.
    public Ticket ticketToAmersham; 

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
    public int getCost()
    {
        return cost;
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
     * Print a ticket to Aylesbury if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void buyTicketToAylesbury()
    {
        if(balance >= ticketToAylesbury.getCost()) 
        {
            // Simulate the printing of a ticket.
            System.out.println();
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket to Aylesbury");
            System.out.println("# " + ticketToAylesbury.getCost() + " pence.");
            System.out.println("Date Purchased: " + ticketToAylesbury.getDate());
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + ticketToAylesbury.getCost();
            // Reduce the balance by the price.
            balance = balance - ticketToAylesbury.getCost();
            // Returning the change. 
            System.out.println(" The amount to refund is: " + refundBalance());
        }
        else 
        {
            System.out.println("You must insert at least: " +
            (ticketToAylesbury.getCost() - balance) + " more cents.");
                    
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
    
    /**
     * method to add 10p into the ticket machine.
     * Also prints the current balance.
     */
    public void insert10Pence()
    {
        balance = balance + 10;
        System.out.println("The amount inserted is 10p");
        System.out.println("Current Balance is = " + balance + " Pence");
    }
    
    /**
     * method to add 20p into the Ticket Machine.
     * Also prints the current balance.
     */
    public void insert20Pence()
    {
        balance = balance + 20;
        System.out.println("The amount inserted is 20p");
        System.out.println("Current Balance is = " + balance + " Pence");
    }
    
    /**
     * Method to add £1 into the ticket machine.
     * Also prints the current balance.
     */
    public void insert1Pound()
    {
        balance = balance + 100;
        System.out.println("The amount inserted is £1");
        System.out.println("Current Balance is = " + balance + " Pence");    
    }
    
    /**
     * method to add £2 into the ticket machine.
     * Also prints the current balance.
     */
    public void insert2Pounds()
    {
        balance = balance + 200;
        System.out.println("The amount inserted is £2");
        System.out.println("Current Balance is = " + balance + " Pence");
    }
 
    /**Print a ticket to HighWycombe if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void buyTicketToHighWycombe()
    {
        if(balance >= ticketToHighWycombe.getCost()) 
        {
            // Simulate the printing of a ticket.
            System.out.println();
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket to High Wycombe");
            System.out.println("# " + ticketToHighWycombe.getCost() + " pence.");
            System.out.println("Date Purchased: " + ticketToHighWycombe.getDate());
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + ticketToHighWycombe.getCost();
            // Reduce the balance by the price.
            balance = balance - ticketToHighWycombe.getCost();
            // Returning the change. 
            System.out.println(" The amount to refund is: " + refundBalance());
        }
        else 
        {
            System.out.println("You must insert at least: " +
            (ticketToHighWycombe.getCost() - balance) + " more cents.");
           
        }
    }
    
    
    /**Print a ticket to Amersham if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void buyTicketToAmersham()
    {
        if(balance >= ticketToAmersham.getCost()) 
        {
            // Simulate the printing of a ticket.
            System.out.println();
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket to Amersham");
            System.out.println("# " + ticketToAmersham.getCost() + " pence.");
            System.out.println("Date Purchased: " + ticketToAmersham.getDate());
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + ticketToAmersham.getCost();
            // Reduce the balance by the price.
            balance = balance - ticketToAmersham.getCost();
            // Returning the change. 
            System.out.println(" The amount to refund is: " + refundBalance());
        }
        else 
        {
            System.out.println("You must insert at least: " +
            (ticketToAmersham.getCost() - balance) + " more cents.");
                    
        }
    }
    
}
