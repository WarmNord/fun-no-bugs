package practice_06.task02;

import java.util.HashMap;

public class Task10 {

    /*
    * 10. Структура телефонной книги
Требуется хранить имена и номера телефонов, чтобы быстро находить номер по имени.

    * */

    static private HashMap<String, Integer> phoneBook = new HashMap<>();

    static void addContact(String name, Integer phoneNumber) {
        phoneBook.put(name, phoneNumber);
        System.out.println("Добавлен контакт " + name + " " + phoneNumber);
    }

    static void findPhoneNumber(String name) {
        if (phoneBook.containsKey(name)) {
            System.out.println("Контакт " + name + " " + phoneBook.get(name));
        } else {
            System.out.println("Контакт " + name +" отсутствует в телефонной книге");
        }
    }

    public static void main(String[] args) {
        Task10.addContact("m", 123);
        Task10.addContact("s", 32);
        Task10.addContact("a", 787);

        Task10.findPhoneNumber("m");
        Task10.findPhoneNumber("asdas");
    }
}
