package studentdatabaseapp;

import java.util.Scanner;

/**
 * Created by Stefcio on 16.03.2018.
 */
public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private int studentID;
    private String courses = null;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int ID = 1000;


    // Constructor: prompt user to enter student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("Enter student class level: ");
        this.firstName = in.nextLine();

        setStudentID();
    }
    // Generate ID
    private void setStudentID(){
        ID++;
        this.studentID = ID;
    }
    // Enroll in courses
    public void enroll(){
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")){
                courses = courses + "\n" + course;
                tuitionBalance += costOfCourse;
            }
            else {
                break;
            }
        }
        while (1 != 0);
        System.out.println("Enrolled in: " + courses);
        System.out.println("Tuition balance: " + tuitionBalance);
    }
    // View balance

    // Pay tuition

}
