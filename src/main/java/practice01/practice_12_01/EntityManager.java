package practice01.practice_12_01;


/*Разработайте класс EntityManager<T>, который будет управлять коллекцией объектов произвольного типа T, обеспечивая потокобезопасное добавление, удаление и получение элементов. Класс также должен предоставлять специфические методы фильтрации данных, которые позволяют пользователю извлекать элементы по определённым критериям.

Функциональные требования:
Добавление элементов: Метод для добавления объекта в коллекцию. Должен быть потокобезопасным.
Удаление элементов: Метод для удаления объекта из коллекции. Возвращает true, если объект был удалён, и false, если объект не найден в коллекции. Должен быть потокобезопасным.
Получение всех элементов: Метод возвращает копию списка всех элементов, обеспечивая невозможность изменения исходной коллекции через возвращаемый список.
Специализированные методы фильтрации:
Фильтрация по возрасту: Возвращает список пользователей в заданном возрастном диапазоне.
Фильтрация по имени: Возвращает список пользователей, чьи имена соответствуют заданной строке.
Фильтрация по активности: Возвращает список пользователей с заданным статусом активности.*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EntityManager<T> {
    private final List<T> entities = new ArrayList<>();

    public synchronized void addEntity(T entity) {
        entities.add(entity);
    }

    public synchronized boolean remove(T entity) {
        return entities.remove(entity);
    }

    public synchronized List<T> getAllEntities() {
        return new ArrayList<>(entities);
    }

    public synchronized List<T> filterEntities(Predicate<T> predicate) {
        return entities.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    //Фильтрация по возрасту: Возвращает список пользователей в заданном возрастном диапазоне.
    public List<T> filterByAgeRange(int minAge, int maxAge) {
        return filterEntities(
                entity -> {
                    try {
                        int age = (int) entity.getClass().getMethod("getAge").invoke(entity);
                        return age >= minAge && age <= maxAge;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    return false;
                }
        );
    }

    //Фильтрация по имени: Возвращает список пользователей, чьи имена соответствуют заданной строке.
    public List<T> filterByName(String name) {
        return filterEntities(
                entity ->
                {
                    try {
                        String entityName = (String) entity.getClass().getMethod("getName").invoke(entity);
                        return entityName.equals(name);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    return false;
                }
        );
    }

    //Фильтрация по активности: Возвращает список пользователей с заданным статусом активности.
    public List<T> filterByActive(boolean isActive) {
        return filterEntities(
                entity ->
                {
                    try {
                        boolean entityActive = (boolean) entity.getClass().getMethod("isActive").invoke(entity);
                        return entityActive == isActive;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    return false;
                }
        );
    }
}

class User {
    private String name;
    private int age;
    private boolean active;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isActive() {
        return this.active;
    }

    public User(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    public static void main(String[] args) {
        EntityManager<User> eManager = new EntityManager<>();

        eManager.addEntity(new User("Will", 15, true));
        eManager.addEntity(new User("Bill", 34, true));
        eManager.addEntity(new User("Paul", 25, false));
        eManager.addEntity(new User("April", 10, true));

        List<User> filterAge = eManager.filterByAgeRange(5, 16);
        filterAge.forEach(
               user ->  System.out.println(user.getName())
        );
        List<User> filterName = eManager.filterByName("Bill");
        filterName.forEach(
                user ->  System.out.println(user.getName())
        );
        List<User> filterActive = eManager.filterByActive(false);
        filterActive.forEach(
                user ->  System.out.println(user.getName())
        );

    }
}
