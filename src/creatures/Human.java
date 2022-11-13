package creatures;

import creatures.Animal;

import java.io.Serializable;

public class Human extends Animal {


    String name;
    int age;
    private Double salary;

    public Human() {
        super("homo spiens");
        salary = 0.0;
        System.out.println("wiataj człowieku");
    }

  /*  public void beEaten()throws Exception{
        throw new Exception("chyba cie pojebało");
    }*/



    public String toString() {
        return "imie: " + this.name + " " + "Wiek: " + age;


    }
}
