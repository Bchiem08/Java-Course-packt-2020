package JavaSampleProject1.src.Unit2;

public class StringComparison {

    public static void main(String[] args) {

        // String Comparison Operations "2"

        // Equals
        // Compare To
        // Matches

        String str1 = "ABCDE";
        String str2 = "aBCDE";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        if (str1.equals(str2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));

        String patt = "[A-Z] {1,}";

        System.out.println(str1.matches(patt));

    }
}
