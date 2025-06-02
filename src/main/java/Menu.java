import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Food> foods = new ArrayList<>();

    void addFood(Food food) {
        foods.add(food);
    }

    void printMenu() {
        foods.forEach(s -> s.printInfo());
    }

    public static void main(String[] args) {
        Drinks coffe = new Drinks(10, "coffie");
        Drinks juice = new Drinks(0, "orange juice");
        VeganFood vf = new VeganFood(true, true, "milk");
        VeganFood vf1 = new VeganFood(false, false, "bad milk");
        VeganFood vf2 = new VeganFood(true, false, "not bad milk");
        VeganFood vf3 = new VeganFood(false, true, "so so milk");
        Menu menu = new Menu();
        menu.addFood(coffe);
        menu.addFood(juice);
        menu.addFood(vf);
        menu.addFood(vf1);
        menu.addFood(vf2);
        menu.addFood(vf3);
        menu.printMenu();

    }


}
