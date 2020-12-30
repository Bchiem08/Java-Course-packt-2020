package JavaSampleProject1.src;
public class Class_1 {
    public static void main(String[] args) {

        // Primitive Data Types in Java "1"

        byte b1 = 123;
        short sh1 = 7681;
        int numb1 = 12312321;
        long l1 = 4356789;
        float f1 = 12.4567f;
        double d1 = 123.5342534d;
        char ch1 = 'A';
        String str1 = "ASDFDESDF@@3$^&";
        boolean b2 = true;



        // Logical and Bitwise Operators "3"

        // Logical AND - &&
        // Logical OR - ||
        // Logical Not - !!
        // Bitwise and - &
        // Bitwise or - |
        // Bitwise Compliment _ ~

        int num1 = 100; //111100
        int num2 = 200; //101010
                       //101000 => 40
                       //111110 => 62

        // Relational Operators in Java "4"

        // == (num1 == num2)
        // != (num1 != num2)
        // >  (num1 >= num2)
        // <  (num1 <= num2)

        // If - Condition "5"

        if (num1 < num2) {
            System.out.println("num1 is bigger");
        } else {
            System.out.println("num1 is not bigger");
        }
        
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
