package Exercise26;

public class Laptop {
    public String manufacturer;
    public String operatingSystem;
    public String model;
    public int cost;

    public Laptop(String man, String os, String mod, int c) {
        this.manufacturer = man;
        this.operatingSystem = os;
        this.model = mod;
        this.cost = c;
    }

    public String getmanufacturer() {
        return this.manufacturer;
    }

    public String operatingSystem() {
        return this.operatingSystem;
    }

    public String getmodel() {
        return this.model;
    }

    public int getcost() {
        return this.cost;
    }
}
