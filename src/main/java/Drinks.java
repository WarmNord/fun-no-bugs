public class Drinks extends Food {
    private int coffein;

    Drinks(int coffein, String name) {
        super(name);
        this.coffein = coffein;
    }

    int getCoffein() {
        return this.coffein;
    }

    @Override
    void printInfo() {
        if (coffein  > 0) {
            System.out.println(getNameFood() + " содержит кофеин: " + getCoffein());
        } else {
            System.out.println(getNameFood() + " не содержит кофеин");
        }
    }
}
