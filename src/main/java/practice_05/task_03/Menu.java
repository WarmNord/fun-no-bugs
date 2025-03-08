package practice_05.task_03;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    static private List<RestoraunFood> restoraunFoods = new ArrayList<>();

    void addFood(RestoraunFood food) {
        restoraunFoods.add(food);
    }

    void showInfo(RestoraunFood food) {
        restoraunFoods.get(restoraunFoods.indexOf(food)).showFood();
    }

}
