package practice02.practice02.structural.facade.smarthouse;

public class Conditioner implements Off, On{

    @Override
    public void off() {
        System.out.println("Conditioner is off");
    }

    @Override
    public void on() {
        System.out.println("Conditioner is on");
    }
}
