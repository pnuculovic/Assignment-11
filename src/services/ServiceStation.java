package services;

public class ServiceStation implements Maintainable, Operable {
    private String stationName;

    public ServiceStation() {
        this.stationName = "Unnamed Station";
    }

    public ServiceStation(String stationName) {
        this.stationName = stationName;
    }

    public void openStation() {
        System.out.println("Service station is open.");
    }

    public void openStation(String hours) {
        System.out.println("Service station is open for hours: " + hours);
    }

    @Override
    public void performMaintenance() {
        System.out.println("Service station maintenance.");
    }

    @Override
    public void operate() {
        System.out.println("Service station operations.");
    }
}
