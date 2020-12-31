package JavaSampleProject1.src.Unit2;

import javax.swing.text.Style;

public class StringSearch {

    public static void main(String[] args) {

        // Contains 
        // Starts with
        // Ends with
        // Index of
        // Last index of

        String str1 = "I love Java and love Selenium";
        String str2 = "Java";

        System.out.println(str1.toLowerCase().contains(str2.toLowerCase()));

        System.out.println(str1.startsWith("I"));

        System.out.println(str1.endsWith("Selenium"));

        System.out.println(str1.indexOf("love"));

        System.out.println(str1.indexOf("love", 6));

        System.out.println(str1.lastIndexOf("love"));
   
    }
}
