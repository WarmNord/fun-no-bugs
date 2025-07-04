package practice02.practice02.structural.speed;
/*
Адаптер для конвертации миль в километры
Описание
В проекте есть система, которая работает с мильными единицами (например, старая система), но новая система должна использовать километры.
Нужно создать адаптер, который будет преобразовывать мили в километры, чтобы новая система могла работать с ними, не изменяя её логику.*/

public class Main {
    public static void main(String[] args) {
        KilometrSystem k = new KilometrSystem(15.0);
        MileSystem m = new MileSystem(5.0);

        System.out.println(AdapterSystem.kilometersToMile(k));
        System.out.println(AdapterSystem.mileToKilometers(m));
    }
}
