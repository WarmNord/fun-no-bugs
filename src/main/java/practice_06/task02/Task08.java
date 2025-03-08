package practice_06.task02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Task08 {

/*    8. Учет посещений страниц
    Система должна отслеживать уникальные посещения страниц на веб-сайте и вести подсчёт общего числа посещений.*/

    public static void main(String[] args) {
        Page main = new Page("Главная страница");
        Page faq = new Page("FAQ");
        Page contacts = new Page("Наши контакты");
        Page news = new Page("NEWS");

        Page.visitPage(main);
        Page.visitPage(main);
        Page.visitPage(news);
        Page.visitPage(faq);
        Page.visitPage(contacts);
        Page.visitPage(news);

        Page.printVisits();
    }

    public static class Page {

        static private HashSet<Page> uniqueVisits = new HashSet<>();
        static private int allVisits;


        String name;

        Page(String name) {
            this.name = name;
        }

        String getName() {
            return this.name;
        }

        static void visitPage(Page page) {
            allVisits++;
            uniqueVisits.add(page);
        }

        static void printVisits() {
            System.out.println("Уникальные посещения: " + uniqueVisits.size());
            uniqueVisits.forEach(
                    page -> {
                        System.out.println(page.name);
                    }
            );
            System.out.println("Все посещения: " + allVisits);
        }

    }
}
