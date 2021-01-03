package JavaSampleProject1.src.Unit6;

public class AnimalMain {

    public static void main(String[] args) {

        Animal a;
        
        a = new Dog();
        a.whoAmI();

        Dog d = new Dog();
        d.whoAmI();

        Cat c = new Cat();
        c.whoAmI();
    }
    
}
