public abstract class Food {
    private String nameFood;

    Food(String  nameFood) {
        this.nameFood = nameFood;
    }

    void setNameFood(String food) {
        this.nameFood = food;
    }

    String getNameFood() {
        return this.nameFood;
    }

    abstract void printInfo();

}
