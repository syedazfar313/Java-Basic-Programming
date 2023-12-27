package Exercise26;

public class MacLaptop extends Laptop {
    MacLaptop(String man, String os, String mod, int c) {
        super(man, os, mod, c);
    }

    public String getModel() {
        return "Mac Laptop: " + model;
    }

    public String getManufacturer() {
        return "Mac Laptop: " + manufacturer;
    }

    public String getOperatingSystem() {
        return "Mac Laptop: " + operatingSystem;
    }

    public int getcost() {
        return cost;
    }
}
