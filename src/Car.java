public class Car {



   final String producent;
    final String model;
    Double przebieg;
    String kolor;

    public Car(String producent, String model, double przebieg, String kolor) {
        this.producent = producent;
        this.model = model;
        this.przebieg = przebieg;
        this.kolor = kolor;
    }
public String toString(){
        return "producent: " + this.producent + " " +  "model: " + this.model;

}

}
