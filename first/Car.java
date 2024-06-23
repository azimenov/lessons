package first;

public class Car {
    private double volume;
    private int power;
    private String name;
    private String surname;

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, int power, double volume) {
        this(name);
        this.volume = volume;
        this.power = power;
    }
}
