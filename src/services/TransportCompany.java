package services;

public class TransportCompany {
    private String companyName;
    private static int fleetSize = 0;

    public TransportCompany() {
        this.companyName = "Unnamed Company";
    }

    public TransportCompany(String companyName) {
        this.companyName = companyName;
    }

    public void manageFleet() {
        System.out.println("Managing fleet of size: " + fleetSize);
    }

    public void manageFleet(int newVehicles) {
        fleetSize += newVehicles;
        System.out.println("Fleet size updated to: " + fleetSize);
    }
}
