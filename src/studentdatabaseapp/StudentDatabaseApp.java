package studentdatabaseapp;

import java.util.Scanner;

/**
 * Created by Stefcio on 16.03.2018.
 */
public class StudentDatabaseApp {
    public static void main(String[] args) {

        // Ask how many new students to add
        System.out.println("Enter number of new students: ");
        Scanner in = new Scanner(System.in);
        int numberOfStudents = in.nextInt();
        Student[] students = new Student[numberOfStudents];

        // Create n number of new students
        for (int i =0; i < numberOfStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }

        for (int j = 0; j<numberOfStudents; j++){
            System.out.println(students[j].toString());
        }
    }
}
