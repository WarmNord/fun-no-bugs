package practice02.practice02.structural.facade.smarthouse;

public class Ligth implements Off, On {

    @Override
    public void off() {
        System.out.println("Ligth is off");
    }

    @Override
    public void on() {
        System.out.println("Ligth is on");
    }
}
