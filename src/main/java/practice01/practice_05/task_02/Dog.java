package practice01.practice_05.task_02;

public class Dog extends Pets {
    private static final  String TYPE_PET = "Собака";

    Dog() {
        super(TYPE_PET);
    }

    @Override
    public void doActionWithPet(){
        System.out.println("Собака гуляет и ест сухой корм");
    }
}
