package practice01.practice_07.task_02;

public class Pair<K, V> {
    /*
    * Использование нескольких параметров типа: Реализуйте обобщённый класс Pair<K, V>, который хранит пару значений разного типа.
    *
    * */

    private K valueK;

    private V valueV;

    Pair(K valueK, V valueV) {
        this.valueK = valueK;
        this.valueV = valueV;
    }

    K getK() {
        return this.valueK ;
    }

    V getV() {
        return this.valueV;
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Q", 1);
        System.out.println(pair.getK());
        System.out.println(pair.getV());

    }
}
