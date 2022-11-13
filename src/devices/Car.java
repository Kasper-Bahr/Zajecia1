package devices;

public class Car extends Device{



  /*  String producent;
     String model;
    Double przebieg;
    String kolor;*/

    public Car() {
       super ("bmw", "m2", 2020.0);

    }


    @Override
    public void recharge(Integer percentage) {
        System.out.println("ładuje");
        System.out.println("ładuje");
        System.out.println("ładuje");
        System.out.println("naładowane");
    }

    @Override
    public boolean isOn() {
        return false;
    }
}
