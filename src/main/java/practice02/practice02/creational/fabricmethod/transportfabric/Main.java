package practice02.practice02.creational.fabricmethod.transportfabric;

public class Main {
    public static void main(String[] args) {
        FabricTransport fabricTransport = new CarFabric();
        fabricTransport.buildTransport();
        fabricTransport = new BicycleFabric();
        fabricTransport.buildTransport();
    }
}
