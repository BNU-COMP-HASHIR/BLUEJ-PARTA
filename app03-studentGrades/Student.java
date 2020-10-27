import java.util.*;

/**
 * This application is used to calculate final grades for students after they 
 * have completed all the required modules in their class.
 * Each module is worth 15 credits
 * 
 * @author Michael Kölling and David Barnes
 * @modified by Hashir Iqbal 
 * @version 27/10/20 
 */
public class Student
{
    // the student's full name
    private String name;
    // the student ID 
    private String id;
    // the amount of credits for study taken so far
    private int credits;
    
    private Course course; 
    /**
     * Create a new student with a given name and ID number.
     */
    public Student(String fullName, String studentID)
    {
        name = fullName;
        id = studentID;
        credits = 0;
    }
    
    /**
     * Method to enroll the student to course.
    */
    public void enrollStudent(Course course)
    {
        this.course = course; 
    }
    
    
    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set a new name for this student.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    /**
     * Return the student ID of this student.
     */
    public String getStudentID()
    {
        return id;
    }

    /**
     * Add some credit points to the student's accumulated credits.
     */
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints;
    }

    
    /**
     * Return the number of credit points this student has accumulated.
     */
    public int getCredits()
    {
        return credits;
    }

    /**
     * Return the login name of this student. The login name is a combination
     * of the first four characters of the student's name and the first three
     * characters of the student's ID number.
     */
    public String getLoginName()
    {
        return name.substring(0,4) + id.substring(0,3);
    }
    
    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(name + ", student ID: " + id + ", credits: " + credits);
        course.print();
    }
    
    /**
     * Method to enroll students.
     */
    public void enrollStudent()
    {
        
    }
}
