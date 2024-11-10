package vehicles;

public abstract class Vehicle {
    protected int speed;
    protected String color;

    public Vehicle() {
        this.speed = 0;
        this.color = "Unknown";
    }

    public Vehicle(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    public abstract void move();

    public void displayInfo() {
        System.out.println("Speed: " + speed + ", Color: " + color);
    }

    public void displayInfo(String message) {
        System.out.println(message + " - Speed: " + speed + ", Color: " + color);
    }
}
