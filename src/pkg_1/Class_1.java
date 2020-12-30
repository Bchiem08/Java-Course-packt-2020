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

        int num1 = 12312321;

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

        int numb1 = 100;
        int numb2 = 200;

        int numb3 = numb1 % numb2;

        numb1++;
        numb1 = numb1 + 1;

        numb1--;
        numb1 = numb1 - 1;
        
        numb1+=5;
        numb1 = numb1 + 5 ;

        numb1-=5;
        numb1 = numb1 - 5 ;

        numb1*=2;
        numb1 = numb1*2 ;

        numb1/=5;
        numb1 = numb1/5 ;

        System.out.println(numb3);
    }
}
