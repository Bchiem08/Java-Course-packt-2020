package JavaSampleProject1.src.Unit4;

public class StringBuilderClass1 {

    public static void main(String[] args) {

        /*
		 * StringBuilder class is used to create mutable (modifiable) string
		 * Some useful methods:
		 * append, insert, replace, delete, reverse
		 */

        String str1 = "I";

        str1 = str1 + " Like";
        str1 = str1 + "Java";

        System.out.println(str1);

        // I Like / I like / java / I like Java

        StringBuilder sb1 = new StringBuilder("I");

        sb1.append(" Like");
        sb1.append(" Java");

        System.out.println(sb1);
		
    }
    
}
