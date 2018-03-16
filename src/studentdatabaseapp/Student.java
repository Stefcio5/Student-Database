package studentdatabaseapp;

import java.util.Scanner;

/**
 * Created by Stefcio on 16.03.2018.
 */
public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String courses = "";
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
        this.gradeYear = in.nextLine();

        setStudentID();
    }
    // Generate ID
    private void setStudentID(){
        ID++;
        this.studentID = gradeYear +""+ ID;
    }
    // Enroll in courses
    public void enroll(){
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")){
                courses = courses + "\n " + course;
                tuitionBalance += costOfCourse;
            }
            else {
                break;
            }
        }
        while (1 != 0);
    }
    // View balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // Pay tuition
    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // View info
    public String toString(){
        return "Student name: " + firstName + " " + lastName +
                            "\nStudent ID: " + studentID +
                            "\nCourse enrolled: " + courses +
                            "\nBalance: $" + tuitionBalance +
                            "\n";

    }

}
