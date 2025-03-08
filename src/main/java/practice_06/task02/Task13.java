package practice_06.task02;

import java.util.ArrayList;

public class Task13 {
    /*\
    * 13. Хранение объектов с частым доступом
Требуется хранить фиксированное количество элементов, которые часто изменяются, с быстрым доступом к любому из них.
    * */

    static private ArrayList<Integer> arrayList = new ArrayList<>(5);

    public static void main(String[] args) {
        arrayList.add(1);
        arrayList.add(345);
        arrayList.add(56);
        arrayList.add(89);
        arrayList.add(21);

        System.out.println(arrayList.get(3));

    }
}
