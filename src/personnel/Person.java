package personnel;

public abstract class Person {
    protected String name;
    protected int age;

    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void performDuty();
}
