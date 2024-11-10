package personnel;

import services.Maintainable;

public class Mechanic extends Person implements Maintainable {
    private int experience;

    public Mechanic() {
        super();
        this.experience = 0;
    }

    public Mechanic(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    @Override
    public void performDuty() {
        System.out.println("Mechanic with " + experience + " years of experience.");
    }

    public void performDuty(String specialty) {
        System.out.println("Specializing in " + specialty);
    }

    @Override
    public void performMaintenance() {
        System.out.println("Mechanic is performing maintenance.");
    }
}
