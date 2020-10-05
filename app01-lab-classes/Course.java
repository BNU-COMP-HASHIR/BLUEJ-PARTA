
/**
 * The Course class defines the course title and codenumber for a particular student
 *
 * @author (Hashir Iqbal)
 * @version (4th Oct 2020)
 */
public class Course
{
    // Course title 
    private String title;
    // Course's code number 
    private String codeNumber; 

    /**
     * Constructor for objects of class Course
     */
    public Course(String title, String codeNumber)
    {
        // initial values of the variables  
        this.title = title; 
        this.codeNumber = codeNumber; 
    }

    /**
     * An example of a method - replace this comment with your own

     */
    public String getTitle()
    {
        // returns the title
        return  title; 
    }
    
    public void setTitle(String title) 
    { 
        //sets the title value 
        this.title = title; 
    }
    
    public String getCodeNumber()
    { 
        // returns the value stored in codenumber 
        return codeNumber; 
    }
    
    public void setCodenumber(String codeNumber)
    {
        //used to set the code of the course
        
        this.codeNumber = codeNumber; 
    }
}
        

