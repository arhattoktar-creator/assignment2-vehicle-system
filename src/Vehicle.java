public abstract class Vehicle {

    protected String brand;
    protected int year;
    protected Driver driver;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void assignDriver(Driver driver) {
        this.driver = driver;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void showInfo() {
        System.out.println("Vehicle brand: " + brand);
        System.out.println("Production year: " + year);
        if (driver != null) {
            driver.displayDriverInfo();
        } else {
            System.out.println("Driver not assigned");
        }
    }
}
