package practice02.practice02.creational.abstractfabric.furniture;

public class ClassicFabricFurniture implements MainFabricFurniture{
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }
}
