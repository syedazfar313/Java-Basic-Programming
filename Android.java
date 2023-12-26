import Exercise25.Mobile;

public class Android extends Mobile {
    // Constructor to set properties/characteristics of object
    Android(String man, String os, String mod, int c) {
        super(man, os, mod, c);
    }

    // Method to get access Model property of Object
    public String getModel() {
        return "This is Android Mobile- " + model;
    }
}
