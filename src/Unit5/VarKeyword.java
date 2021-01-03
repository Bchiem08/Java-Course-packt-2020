package JavaSampleProject1.src.Unit5;

import java.util.Scanner;

public class VarKeyword {

    
    public static void main(String[] args) {

        int num1 = 100;

        var num2 = 200;

        var str1 = "RESR";

        var num3 = 12.998;

        var s2 = new Scanner(System.in);

        int x = add(500,600);
 
        var y = add(500,600);


    }

    public static int add(int a, int b) {
        return a+b;
    }
}
