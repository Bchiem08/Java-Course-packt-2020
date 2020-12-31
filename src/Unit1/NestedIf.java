package JavaSampleProject1.src.Unit1;

public class NestedIf {
    
    public static void main(String[] args) {

        // Nested If - Condition "6"

        // create a program to find the grade of the student
        // Marks >= 90 => A Grade
        // Marks >= 75 => B Grade
        // Marks >= 60 => C Grade
        // Marks >= 40 => D Grade
        // Marks < 40 => Fail

        int marks = 50;
        
        if (marks > 90) {
            System.out.println("A Grade");
        } else if (marks > 75) {
            System.out.println("B Grade");
        } else if (marks > 60) {
            System.out.println("C Grade");
        } else if (marks > 40) {
            System.out.println("D Grade");
        } else if (marks < 40) {
            System.out.println("Fail");
        }
        
        // ASSIGNMENT - "6"
        
        // Create a program that determines the largest of 3 numbers
        // int, n1, n2, n3
        // 100, 400, 300

        int n1 = 100;
        int n2 = 400;
        int n3 = 300;

        if (n1 > n2 && n1 > n3) {
            System.out.println("n1 is the largest");
        } else if (n2 > n3) {
            System.out.println("n2 is the largest");
        } else {
            System.out.println("n3 is the largest");
        }
    }
}

