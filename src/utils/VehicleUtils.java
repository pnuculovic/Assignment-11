package utils;

import vehicles.Vehicle;

public final class VehicleUtils {
    public static int maxSpeed = 180;

    public static void inspect(Vehicle vehicle) {
        System.out.println("Inspecting vehicle.");
        vehicle.displayInfo();
    }

    public static void calculateEfficiency() {
        System.out.println("Calculating vehicle efficiency.");
    }
}
