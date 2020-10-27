 
/**
 * This class represents the modules which are required 
 *
 * @author (Hashir Iqbal)
 * @version (27-10-20)
 */
public class Module
{
    private String title;
    
    private String codeNum;
    
    private int mark;
    
    private boolean completed;
    


    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNum)
    {
        mark = 0;
        this.title = title;
        this.codeNum = codeNum;
        completed = false;
    }
    
    /**
     * Method to set or change a mark.
     */
    public void setMark(int mark)
    {
        if((mark >=0) && (mark <=100))
        {
            this.mark = mark;
            if(mark >=40)  completed = true;
        }
    }
    
    public boolean isCompleted()
    {
        return completed;
    }
    
    /**
     * Method to get the value stored in "mark". 
     */
    public int getMark()
    {
        return mark;
    }
    
    /**
     * Method to print out the title and code of a particular module.
     */
    public void print()
    {
         System.out.println("Title: " + title + "Code: " + codeNum);
    }

}   