
package codsoft_student_grade;

import java.util.Scanner;

public class CodSoft_Student_Grade {

    public static void main(String[] args) {
        // TODO code application logic here
          Scanner scanner = new Scanner(System.in);
         System.out.print("Welcome to the Student Grade Calculator !! \n");
          System.out.print("------------------------------------------ \n");
        // Get the number of subjects from the user
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Initialize variables for total marks and average percentage
        int totalMarks = 0;
        double average;

        // Get marks for each subject and calculate total marks
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        // Calculate average percentage
        average = (double) totalMarks / (numSubjects * 100) * 100;

        // Assign grades based on the average percentage
        String grade;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average>= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        // Display results
        System.out.println("-------------- Entered Informations ---------------");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
    
}
