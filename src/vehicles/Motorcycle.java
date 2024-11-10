package vehicles;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle() {
        super();
        this.hasSidecar = false;
    }

    public Motorcycle(int speed, String color, boolean hasSidecar) {
        super(speed, color);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void move() {
        System.out.println("The motorcycle is moving.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has sidecar: " + hasSidecar);
    }
}
