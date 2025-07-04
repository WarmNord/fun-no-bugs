package practice02.practice02.creational.abstractfabric.furniture;

public class ModernFabricFurniture implements MainFabricFurniture {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
