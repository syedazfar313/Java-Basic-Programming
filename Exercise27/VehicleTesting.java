package Exercise27;

public class VehicleTesting {
    public static void main(String[] args) {
        VehicleAbstract my2Wheeler = new TwoWheeler();
        VehicleAbstract my4Wheeler = new FourWheeler();
        my2Wheeler.start();
        my2Wheeler.stop();
        my4Wheeler.start();
        my4Wheeler.stop();
    }
}
