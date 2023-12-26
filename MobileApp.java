public class MobileApp {
    public static void main(String[] args) {
        // Creating instances of the Android and Blackberry classes
        Android androidPhone = new Android("Samsung", "Android", "Galaxy S21", 999);
        Blackberry blackberryPhone = new Blackberry("Blackberry", "Blackberry OS", "Key2", 799);

        // Accessing and printing information using getter methods and overridden
        // getModel() methods
        System.out.println("Android Phone:");
        System.out.println("Manufacturer: " + androidPhone.getmanufacturer());
        System.out.println("Operating System: " + androidPhone.getoperatingSystem());
        System.out.println("Model: " + androidPhone.getModel());
        System.out.println("Cost: $" + androidPhone.getCost());

        System.out.println("\nBlackberry Phone:");
        System.out.println("Manufacturer: " + blackberryPhone.getmanufacturer());
        System.out.println("Operating System: " + blackberryPhone.getoperatingSystem());
        System.out.println("Model: " + blackberryPhone.getModel());
        System.out.println("Cost: $" + blackberryPhone.getCost());
    }
}
