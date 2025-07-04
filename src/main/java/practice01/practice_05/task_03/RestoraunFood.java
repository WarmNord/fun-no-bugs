package practice01.practice_05.task_03;

public abstract class RestoraunFood {

    private String nameFood;

    RestoraunFood(String food) {
        this.nameFood = food;
    }

    abstract void showFood();
}
