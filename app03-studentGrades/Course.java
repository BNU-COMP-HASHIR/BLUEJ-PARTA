
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
    
    // the 4 required modules.
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    private int finalMark;
    
    private Grades finalGrade;  
    
    /** Constructor for the objects in Course class.
     * 
     */
    public Course(String title, String codeNumber)
    {
        this.title = title;
        this.codeNumber = codeNumber;
        
        finalGrade = Grades.NULL;
        
        createModules();
    }
    
    /**
     * This method creates all the modules automatically. 
     */
    public void createModules()
    {
        module1 = new Module("Graphic Design", "CO1");
        module2 = new Module("Web Design" , "CO2");
        module3 = new Module("Programming" , "CO3");
        module4 = new Module("Networking" , "CO4");
    }
    
    /**
     * Method to calculate the final mark by adding 25% weightage of
     * all 4 modules.
     */
    public void calculateFinalMark()
    {
        finalMark = (module1.getMark() * 25 /100)+(module2.getMark() * 25 /100)
        + (module3.getMark() * 25 /100)+ (module4.getMark() * 25 /100);
        
        System.out.println("The Final mark is " + finalMark);
    }
    
    /**
     * This Method calculates the grade and prints it
     * according to the final marks.
     */
    public void calculateFinalGrade()
    { 
        if(finalMark < 40)
        {
            finalGrade = Grades.F;
        }
        else if((finalMark >= 40) && (finalMark < 50))
        {
            finalGrade = Grades.D;
        }
        else if((finalMark >= 50) && (finalMark < 60))
        {
            finalGrade = Grades.C;
        }
        else if((finalMark >= 60) && (finalMark < 70))
        {
            finalGrade = Grades.B;
        }
        else if((finalMark >= 70) && (finalMark < 100))
        {
            finalGrade = Grades.A;
        }
        
        System.out.println("The Final grade is: " + finalGrade);
    }
    
    
    /**
     * Method to set the marks on the modules.
     */
    public void setModuleMarks(int mark, int moduleNo )
    {
        if(moduleNo == 1)
        {
            module1.setMark(mark);
        }
        
        if(moduleNo == 2)
        {
            module2.setMark(mark);
        }
        
        if(moduleNo == 3)
        {
            module3.setMark(mark);
        }
        
        if(moduleNo == 4)
        {
            module4.setMark(mark);
        }
    }
    
    /**
     * Method to get the title.
     */
    public String getTitle() 
    {
        return title;
    }
    
    /**
     * Method to set a title.
     */
    public void setTitle(String title) 
    {
        this.title = title;
    }
    
    /**
     * Method to get the code number.
     */
    public String getCodeNumber() 
    {
        return codeNumber;
    }
    
    /**
     * Method to set a code number.
     */
    public void setCodeNumber(String codeNumber) 
    {
        this.codeNumber = codeNumber;
    }
    
    /**
     * Method to print the object as a string.
     */
    @Override
    public String toString() 
    {
        return "Course{" +
                "title='" + title +
                ", codeNumber='" + codeNumber +
                "}";
    }
    

    /** 
     * Method to print the course particulars.
     */
    public void print()
    {
        System.out.println( "Title='" + title + ", Code Number='" + codeNumber);
    }
    
    /**
     * Method to print module details
     */
    public void printModuleDetails()
    {
        module1.printDetails();
        module2.printDetails();
        module3.printDetails();
        module4.printDetails();
    }
    
    /**
     * Method to get the final grade.
     */
    public Grades getGrade()
    {
        return finalGrade;
    }
    
    /**
     * method to print all module marks.
     */
    public void printAllModuleMarks()
    {
        System.out.println("Marks of module 1 are: " + module1.getMark());
        System.out.println("Marks of module 2 are: " + module2.getMark());
        System.out.println("Marks of module 3 are: " + module3.getMark());
        System.out.println("Marks of module 4 are: " + module4.getMark());
       
    }
    
}
