package JavaSampleProject1.src.Unit3;

public class RoadToll {

    String type;
    int tiresCount;

    public void calculateToll() {    
        if(tiresCount == 2) {
            System.out.println("Your toll is 0");
        } else if (tiresCount == 4) {
            System.out.println("Your toll is 10");
        } else if (tiresCount > 4) {
            System.out.println("Your toll is 20");
        } else {
            System.out.println("Incorrect tire count");
        }
    }

    public RoadToll() {
        System.out.println("Constructor is executed");
    }

    public RoadToll(String type, int tiresCount) {
        this.type = type;
        this.tiresCount = tiresCount;
    }
    
}
