package practice02.practice02.structural.facade.smarthouse;

public class Guard implements Off, On {

    @Override
    public void off() {
        System.out.println("Guard is off");
    }

    @Override
    public void on() {
        System.out.println("Guard is on");
    }
}
