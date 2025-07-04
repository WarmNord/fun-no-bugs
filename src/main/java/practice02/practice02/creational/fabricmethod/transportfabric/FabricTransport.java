package practice02.practice02.creational.fabricmethod.transportfabric;

public abstract class FabricTransport {

    abstract Transport createTransport();

    public void buildTransport() {
        Transport transport = createTransport();
        transport.create();
    }
}
