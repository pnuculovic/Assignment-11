package personnel;

import services.Operable;

public class Driver extends Person implements Operable {
    private String licenseNumber;

    public Driver() {
        super();
        this.licenseNumber = "Unknown";
    }

    public Driver(String name, int age, String licenseNumber) {
        super(name, age);
        this.licenseNumber = licenseNumber;
    }

    @Override
    public void performDuty() {
        System.out.println("Driving with license: " + licenseNumber);
    }

    public void performDuty(String vehicleType) {
        System.out.println("Driving a " + vehicleType);
    }

    @Override
    public void operate() {
        System.out.println("Driver is operating a vehicle.");
    }
}
