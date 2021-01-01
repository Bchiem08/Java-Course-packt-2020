package JavaSampleProject1.src.Unit3;

public class Temp {
    
    public static void main(String[] args) {

        Cars c1 = new Cars();
        
        c1.color = "Red";
        c1.make = "BMW";

        c1.displayDetails();

        Cars c2 = new Cars();
        
        c2.color = "Blue";
        c2.make = "Lexus";
        c2.type = "Sedan";

        c2.displayDetails();

    }

}
