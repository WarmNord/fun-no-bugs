package practice_06.task01;

import java.util.LinkedHashSet;

public class Cache {
   // Реализуйте кэш последних 5 уникальных страниц, которые посетил пользователь.

    private LinkedHashSet<String> cache;
    private final int SIZE = 5;

    Cache() {
        this.cache = new LinkedHashSet<>(SIZE);
    }

    public void visitPage(String page) {
        if (cache.size() >= SIZE) {
            cache.removeFirst();
            cache.add(page);
        } else {
            cache.add(page);
        }
    }

    public void printCahe() {
        cache.forEach(System.out::println);
        System.out.println();
    }

    public static void main(String[] args) {
        Cache cache1 = new Cache();
        cache1.visitPage("Страница 1");
        cache1.visitPage("Страница 2");
        cache1.visitPage("Страница 3");
        cache1.visitPage("Страница 4");
        cache1.visitPage("Страница 5");
        cache1.printCahe();
        cache1.visitPage("Страница 6");
        cache1.printCahe();


    }



}
