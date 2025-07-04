package practice01.practice_05.task_04;

public class Teacher extends Users {
    String name;
    Users user;

    Teacher(String name){
        super(name);
    }

    public void checkHomeWork(Course course, HomeWork homeWork, Student student) {

        System.out.println("Проверил работу студента " + student.getName() + " Курс " + course.getNameCourse() + " задание " + homeWork.getTask());
    }

}
