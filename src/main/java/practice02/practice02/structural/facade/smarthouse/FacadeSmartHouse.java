package practice02.practice02.structural.facade.smarthouse;

public class FacadeSmartHouse {
    private Conditioner conditioner;
    private Guard guard;
    private Ligth ligth;

    public FacadeSmartHouse(Conditioner conditioner, Guard guard, Ligth ligth) {
        this.conditioner = conditioner;
        this.guard = guard;
        this.ligth = ligth;
    }

    void switchLigth(boolean enable) {
        if (enable) {
            ligth.on();
        } else {
            ligth.off();
        }
    }

    void switchGuard(boolean enable) {
        if (enable) {
            guard.on();
        } else {
            guard.off();
        }
    }

    void switchConditioner(boolean enable) {
        if (enable) {
            conditioner.on();
        } else {
            conditioner.off();
        }
    }
}
