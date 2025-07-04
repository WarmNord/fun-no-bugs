package practice02.practice02.creational.fabricmethod.transportfabric;

public class BicycleFabric extends FabricTransport {

    @Override
    public Transport createTransport() {
        return new Bicycle();
    }
}
