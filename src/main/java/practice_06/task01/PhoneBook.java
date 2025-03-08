package practice_06.task01;

import java.util.LinkedHashMap;

public class PhoneBook {

    /*Реализуйте телефонную книгу с LinkedHashMap. Добавьте, найдите, удалите контакт.
     */

    private LinkedHashMap<String, Integer> phoneBook;

    PhoneBook(){
        this.phoneBook = new LinkedHashMap<>();
    }

    void addContact(String name, Integer phoneNumber) {
        phoneBook.put(name, phoneNumber);
        System.out.println("Добавлен контакт " + name + " " + phoneNumber);
    }

    void deleteContact(String name, Integer phoneNumber) {
        phoneBook.remove(name, phoneNumber);
        System.out.println("Удален контакт " + name + " " + phoneNumber);
    }

    void findContact(String name) {
        if (phoneBook.containsKey(name)) {
            System.out.println("Найден контакт " + name + " " + phoneBook.get(name));
        } else {
            System.out.println("Контакт не найден" + name);
        }

    }

    public static void main(String[] args) {
        PhoneBook phoneBook1 = new PhoneBook();
        phoneBook1.addContact("маша", 123);
        phoneBook1.addContact("коля", 11);
        phoneBook1.addContact("юля", 0);
        phoneBook1.addContact("гена", 03);

        phoneBook1.deleteContact("маша", 123);

        phoneBook1.findContact("юля");

    }

}
