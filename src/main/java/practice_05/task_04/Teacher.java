package practice_05.task_04;

public class Teacher extends Users implements Teach {
    String name;
    Users user;

    Teacher(String name){
        super(name);
    }

    @Override
    public void checkHomeWork(Student student) {
        System.out.println("Проверил работу студента " + student.getName());
    }

}
