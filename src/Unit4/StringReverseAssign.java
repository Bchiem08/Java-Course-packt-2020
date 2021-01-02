package JavaSampleProject1.src.Unit4;

public class StringReverseAssign {

    public static void main(String[] args) {

        // Reverse a String assignment

        String str1 = "ABCDEFG";
        String str2 = "";

        for (int i = 0; i <= str1.length()-1; i++) {
            str2 = str1.charAt(i) + str2;
        }

        System.out.println("New String is " + str2);

    }
    
}
