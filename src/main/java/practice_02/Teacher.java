package practice_02;

public class Teacher {
/*    Поля:
    String name (имя учителя),
    String subject (предмет).
    Реализуйте:
    Конструктор для задания имени и предмета.
    Геттеры и сеттеры для обоих полей.
    Метод printInfo() для вывода:
            "Учитель: Анна Ивановна, Предмет: Математика".
    В методе main создайте объект учителя, измените предмет через сеттер и выведите информацию.*/

    String name;
    String subject;

    Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    String getName() {
        return this.name;
    }

    String getSubject() {
        return this.subject;
    }

    void setName(String name){
        this.name = name;
    }

    void setSubject(String subject) {
        this.subject = subject;
    }

    void printInfo() {
        System.out.println("Учитель: " + getName() + ", Предмет: "+ getSubject());
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Anna", "English");
        teacher.setSubject("null");
        teacher.printInfo();
    }
}
