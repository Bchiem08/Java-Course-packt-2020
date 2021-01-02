package JavaSampleProject1.src.Unit3;

public class RoadTollMain {

    public static void main(String[] args) {

        RoadToll rt1 = new RoadToll();

        rt1.type = "Sedan";
        rt1.tiresCount = 4;
        rt1.calculateToll();

        RoadToll rt2 = new RoadToll("Truck", 6);
        rt2.calculateToll();
    }
    
}
