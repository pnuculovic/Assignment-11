package vehicles;

public class Car extends Vehicle {
    private int doors;
    public final static String TYPE = "Car";

    public Car() {
        super();
        this.doors = 4;
    }

    public Car(int speed, String color, int doors) {
        super(speed, color);
        this.doors = doors;
    }

    @Override
    public void move() {
        System.out.println("The car is moving.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + doors);
    }
}
