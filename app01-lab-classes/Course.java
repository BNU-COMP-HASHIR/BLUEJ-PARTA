
/**
 * The Course class defines the course title and codenumber for a particular student
 *
 * @author (Hashir Iqbal)
 * @version (4th Oct 2020)
 */
public class Course
 {
    private String title;
    private String codeNumber;
    
    /**
     * 
     */
    public Course(String title, String codeNumber)
    {
        this.title = title;
        this.codeNumber = codeNumber;
    }
    
    public String getTitle() 
    {
        return title;
    }
    
    public void setTitle(String title) 
    {
        this.title = title;
    }
    
    public String getCodeNumber() 
    {
        return codeNumber;
    }
    
    public void setCodeNumber(String codeNumber) 
    {
        this.codeNumber = codeNumber;
    }
    @Override
    public String toString() 
    {
        return "Course{" +
                "title='" + title +
                ", codeNumber='" + codeNumber +
                '}';
    }
}
