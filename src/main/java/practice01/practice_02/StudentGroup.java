package practice01.practice_02;

public class StudentGroup {
/*    Поля:
    String groupName (название группы),
    int studentCount (количество студентов).
    Реализуйте:
    Конструктор для задания названия группы и количества студентов.
    Геттеры и сеттеры для обоих полей.
    Метод printInfo() для вывода информации о группе:
            "Группа: QA, Количество студентов: 25".
    В методе main измените количество студентов через сеттер и выведите обновлённую информацию.*/

    String groupName;
    int studentCount;

    StudentGroup(String groupName, int studentCount){
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    String getGroupName() {
        return this.groupName;
    }

    int getStudentCount() {
        return this.studentCount;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    void printInfo(){
        System.out.println("Группа: " + getGroupName() +", Количество студентов: " + getStudentCount());
    }

    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup("QA", 32);
        studentGroup.setStudentCount(15);
        studentGroup.printInfo();
    }

}
