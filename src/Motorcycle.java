public class Motorcycle extends Vehicle {

    private boolean sidecar;

    public Motorcycle(String brand, int year, boolean sidecar) {
        super(brand, year);
        this.sidecar = sidecar;
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine is running.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}
