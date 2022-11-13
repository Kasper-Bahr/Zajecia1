package devices;

public abstract class Device {


    final String producent;
    final String model;
   final Double yearOfProduction;


    public Device(String producent, String model, Double yearOfProduction) {
        this.producent = producent;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    abstract void  recharge(Integer percentage);
    public abstract boolean isOn();



    public String toString(){
        return "producent" + " " + this.producent + " " +  "model" + " " + this.model + " " + "yearOfProduction" + " " + this.yearOfProduction;

    }

}

