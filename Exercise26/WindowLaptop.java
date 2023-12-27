package Exercise26;

public class WindowLaptop extends Laptop {
    WindowLaptop(String man, String os, String mod, int c) {
        super(man, os, mod, c);
    }

    public String getmodel() {
        return "Window laptop : " + model;
    }

    public String getmanufacturer() {
        return "Window laptop : " + manufacturer;
    }

    public String getoperatingSystem() {
        return "Window laptop : " + operatingSystem;
    }

    public int getcost() {
        return cost;
    }
}
