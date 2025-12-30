public class Car extends Vehicle {

    private int numberOfDoors;
    private String fuel;

    public Car(String brand, int year, int numberOfDoors, String fuel) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
        this.fuel = fuel;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting car engine...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine turned off.");
    }
}
