package JavaSampleProject1.src.Unit1;

public class NestedForAssign {
 
    public static void main(String[] args) {

        // Write a program to create pattern
        
        // *
        // **
        // ***
        // ****
        // *****

        for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
    }
}
