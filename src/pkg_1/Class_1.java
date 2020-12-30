package JavaSampleProject1.src.pkg_1;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Add;
import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Div;
import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Mul;

import jdk.internal.loader.AbstractClassLoaderValue.Sub;

public class Class_1 {
    public static void main(String[] args) {

        //Primitive Data Types in Java

        byte b1 = 123;

        short sh1 = 7681;

        int numb1 = 12312321;

        long l1 = 4356789;

        float f1 = 12.4567f;

        double d1 = 123.5342534d;

        char ch1 = 'A';

        String str1 = "ASDFDESDF@@3$^&";

        boolean b2 = true;

        // Arithmetic Operators in Java

        // + - Add
        // - - Sub
        // * - Mul
        // / - Div
        // % - Mod
        // ++ - Inc
        // -- - Dec

        numb1++;
        numb1 = numb1 + 1;
        numb1--;
        numb1 = numb1 - 1;
        numb1+=5;
        numb1 = numb1 + 5;
        numb1-=5;
        numb1 = numb1 - 5 ;
        numb1*=2;
        numb1 = numb1*2 ;
        numb1/=5;
        numb1 = numb1/5 ;

        // Logical and Bitwise Operators

        // Logical AND - &&
        // Logical OR - ||
        // Logical Not - !!
        // Bitwise and - &
        // Bitwise or - |
        // Bitwise Compliment _ ~

        int num1 = 60; //111100
        int num2 = 42; //101010
                       //101000 => 40
                       //111110 => 62

        System.out.println(num1 & num2);
    }
}
