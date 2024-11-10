public class Main {
    public static void main(String[] args) {
        vehicles.Car car = new vehicles.Car(100, "Red", 4);
        car.displayInfo();
        car.move();
        
        personnel.Driver driver = new personnel.Driver("John", 35, "D12345");
        driver.performDuty();
        
        services.ServiceStation station = new services.ServiceStation("City Station");
        station.openStation("9am - 6pm");
        station.performMaintenance();
    }
}
