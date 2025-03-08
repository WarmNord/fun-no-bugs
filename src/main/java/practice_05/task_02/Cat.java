package practice_05.task_02;

public class Cat extends Pets {
    private static final  String TYPE_PET = "Кошка";

    Cat(){
        super(TYPE_PET);
    }

    @Override
    public void doActionWithPet() {
        System.out.println("Кошка играет и ест влажный корм");
    }
}
