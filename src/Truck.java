public class Truck extends Vehicle {

    private double loadCapacity;
    private int axles;

    public Truck(String brand, int year, double loadCapacity, int axles) {
        super(brand, year);
        this.loadCapacity = loadCapacity;
        this.axles = axles;
    }

    @Override
    public void startEngine() {
        System.out.println("Truck engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Truck engine shut down.");
    }
}
