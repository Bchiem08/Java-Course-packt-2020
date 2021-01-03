package JavaSampleProject1.src.Unit5;

public class GarbageCollector {

    
    public static void main(String[] args) {

        String str1 = "ASFEGHESDXGESAM";

        for (int i = 0; i <= str1.length()-1; i++) {
            String temp = "ch"+i+":"+str1.charAt(i);
        }

    }
    
}
