package practice_03;

public class Company {

   /* Поля:
    static String companyName — название компании (общее для всех сотрудников).
    final int employeeID — уникальный идентификатор сотрудника (задан при создании объекта).
    String employeeName — имя сотрудника.

    Реализуйте:
    Конструктор для инициализации полей employeeID и employeeName.
    Статический метод printCompanyName(), который выводит название компании.
    Геттеры и сеттеры для employeeName (поля employeeID менять нельзя).

    В main создайте несколько сотрудников и проверьте:
    Изменение companyName для всех объектов.
    Ошибку при попытке изменить employeeID.*/

    static String companyName;
    final int employeeID;
    String emloyeeName;

    Company(int employeeID, String emloyeeName) {
        this.employeeID = employeeID;
        this.emloyeeName = emloyeeName;
    }

    static void printCompanyName() {
        System.out.println("Название комании: " + companyName);
    }

    String getEmloyeeName() {
        return this.emloyeeName;
    }

    void setEmloyeeName(String emloyeeName) {
        this.emloyeeName = emloyeeName;
    }

    public static void main(String[] args) {
        Company.companyName = "IBM";

        Company em1 = new Company(01,"Petya");
        Company.printCompanyName();
        Company em2 = new Company(02, "Vlad");
        Company.printCompanyName();

        //Company.companyName = "IBM";

        Company em3 = new Company(03,"Vasilii");
        Company.printCompanyName();
    }
}
