package JavaSampleProject1.src.Unit3;

public class StaticMain {

    public static void main(String[] args) {

        StaticKeyword sk1 = new StaticKeyword();

        StaticKeyword sk2 = new StaticKeyword();

        sk1.age = 7;
        sk1.grade = "2nd";
        sk1.name = "Rob";

        sk1.age = 8;
        sk1.grade = "3nd";
        sk1.name = "Shay";

        sk1.displayDetails();
        sk2.displayDetails();
    }
    
}
