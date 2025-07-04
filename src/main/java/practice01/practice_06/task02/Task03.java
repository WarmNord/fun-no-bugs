package practice01.practice_06.task02;

import java.util.HashMap;

public class Task03 {

    /*
    * Хранение ключей и значений
Необходимо хранить настройки приложения, где каждый параметр имеет имя (ключ) и значение.
    *
    * */

    private static HashMap<String, String> settings = new HashMap<>();

    static void add(String nameSetting, String value) {
        System.out.println("Добавлена настройка " + nameSetting + ": " + value);
        settings.put(nameSetting, value);
    }

    public static void main(String[] args) {
        Task03.add("VPN", "Off");
        Task03.add("Geo", "On");
    }
}
