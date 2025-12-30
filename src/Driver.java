public class Driver {

    private String name;
    private String licenseId;

    public Driver(String name, String licenseId) {
        this.name = name;
        this.licenseId = licenseId;
    }

    public void displayDriverInfo() {
        System.out.println("Driver: " + name + ", License: " + licenseId);
    }
}
