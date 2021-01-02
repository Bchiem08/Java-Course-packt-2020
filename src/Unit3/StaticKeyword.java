package JavaSampleProject1.src.Unit3;

public class StaticKeyword {

    /**
	 * Static Keyword
	 * Static Members Belong to Class (Type) and not to Object
	 */
	
    String name = "ABC";
    byte age = 6;
    String grade = "1st";

    public void displayDetails() {
        System.out.println("Student " + name + " is " + age + " years old and in " + grade + " grade.");
    }

}
