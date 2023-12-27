package Exercise26;

public class Exercise26 {
    public static void main(String[] args) {
        // Creating instances of the WindowsLaptop and MacLaptop classes
        WindowLaptop windowsLaptop = new WindowLaptop("Dell", "Windows", "Inspiron", 899);
        MacLaptop macLaptop = new MacLaptop("Apple", "macOS", "MacBook Pro", 1499);

        System.out.println("Windows Laptop:");
        System.out.println("Manufacturer: " + windowsLaptop.getmanufacturer());
        System.out.println("Operating System: " + windowsLaptop.getoperatingSystem());
        System.out.println("Model: " + windowsLaptop.getmodel());
        System.out.println("Cost: $" + windowsLaptop.getcost());

        System.out.println("\nMac Laptop:");
        System.out.println("Manufacturer: " + macLaptop.getManufacturer());
        System.out.println("Operating System: " + macLaptop.getOperatingSystem());
        System.out.println("Model: " + macLaptop.getModel());
        System.out.println("Cost: $" + macLaptop.getcost());
    }
}
