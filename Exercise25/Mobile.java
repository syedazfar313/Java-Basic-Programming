package Exercise25;

public class Mobile {
    public String manufacturer;
    public String operatingSystem;
    public String model;
    public int cost;

    public Mobile(String man, String os, String mod, int c) {
        this.manufacturer = man;
        this.operatingSystem = os;
        this.model = mod;
        this.cost = c;
    }

    public String getmanufacturer() {
        return this.manufacturer;
    }

    public String getoperatingSystem() {
        return this.operatingSystem;
    }

    public String getModel() {
        return this.model;
    }

    public int getCost() {
        return this.cost;
    }

}
