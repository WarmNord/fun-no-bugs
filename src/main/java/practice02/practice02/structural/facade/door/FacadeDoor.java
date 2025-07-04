package practice02.practice02.structural.facade.door;

public class FacadeDoor {
    private Block block;
    private Close close;
    private Open open;

    public FacadeDoor(Block block, Close close, Open open) {
        this.block = block;
        this.close = close;
        this.open = open;
    }

    void openDoor() {
        this.open.openDoor();
    }

    void closeDoor() {
        this.close.closeDoor();
    }

    void blockDoor() {
        this.block.blockDoor();
    }
}
