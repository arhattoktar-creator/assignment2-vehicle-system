public class Main {

    public static void main(String[] args) {

        Driver d1 = new Driver("Arman", "KZ10293");
        Driver d2 = new Driver("Dias", "KZ88421");

        Vehicle v1 = new Car("Hyundai", 2021, 4, "Gasoline");
        Vehicle v2 = new Motorcycle("Honda", 2018, false);
        Vehicle v3 = new Truck("MAN", 2017, 20.0, 8);

        v1.assignDriver(d1);
        v2.assignDriver(d1);
        v3.assignDriver(d2);

        Vehicle[] vehicles = { v1, v2, v3 };

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.showInfo();
            v.stopEngine();
            System.out.println();
        }
    }
}

