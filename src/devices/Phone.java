package devices;

public class Phone extends Device{


    public Phone() {
        super("iphone", "Iphone 11", 2017.0);
    }

    @Override
    void recharge(Integer percentage) {
        System.out.println("");
    }

    @Override
    public boolean isOn() {
        return false;
    }
}
