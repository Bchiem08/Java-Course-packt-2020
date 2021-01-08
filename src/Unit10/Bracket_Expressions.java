package JavaSampleProject1.src.Unit10;

public class Bracket_Expressions {

    public static void main(String[] args) {
		
		/*
		 * 1. Adding literals in brackets [aeiou]
		 * 2. Adding ranges in brackets [A-Z0-9]
		 * 3. Usage of '^' in brackets [^a-z]
		 */

        String patt = "[A-Za-z0-9_](3)at"; //[afg]

        String str1 = "A8tat";

        System.out.println(str1.matches(patt));

    }
    
}
