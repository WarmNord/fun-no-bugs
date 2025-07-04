package practice02.practice02.structural.facade.smarthouse;
/*
Фасад для системы "Умный дом"
Описание
В системе "Умный дом" есть несколько устройств, которые управляют:
Светом (включить/выключить).
Кондиционером (включить/выключить).
Системой безопасности (включить/выключить).
Клиенту нужно предоставить единый интерфейс для управления (включение/выключение) всеми этими устройствами,
скрыв детали реализации каждого из них.
Используем фасад, который объединит все эти операции в один интерфейс.*/
public class Main {
    public static void main(String[] args) {
        FacadeSmartHouse facadeSmartHouse = new FacadeSmartHouse(new Conditioner(), new Guard(), new Ligth());
        facadeSmartHouse.switchConditioner(true);
        facadeSmartHouse.switchLigth(true);
        facadeSmartHouse.switchGuard(true);
        facadeSmartHouse.switchConditioner(false);
        facadeSmartHouse.switchLigth(false);
        facadeSmartHouse.switchGuard(false);
    }
}
