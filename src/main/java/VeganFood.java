public class VeganFood extends Food {

    private boolean lactoza;
    private boolean gluten;

    VeganFood(boolean lactoza, boolean gluten, String nameFood) {
        super(nameFood);
        this.lactoza = lactoza;
        this.gluten = gluten;
    }

    boolean isLactoza() {
        return this.lactoza;
    }

    boolean isGluten() {
        return this.gluten;
    }

    @Override
    void printInfo() {
        if (isLactoza()) {
            System.out.println(getNameFood() + " содержит глютен");
        } else if (isGluten()) {
            System.out.println(getNameFood() + " содержит лактозу");
        } else if (isLactoza() && isGluten()) {
            System.out.println(getNameFood() + " содержит лактозу и глютен");
        } else {
            System.out.println(getNameFood() + " не содержит лактозу и глютен");
        }
    }
}
