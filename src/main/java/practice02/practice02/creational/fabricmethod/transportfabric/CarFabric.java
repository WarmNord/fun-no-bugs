package practice02.practice02.creational.fabricmethod.transportfabric;

public class CarFabric extends FabricTransport {
    @Override
    public Transport createTransport() {
        return new Car();
    }
}
