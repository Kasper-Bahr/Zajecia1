import creatures.Animal;
import creatures.Human;
import devices.Car;
import devices.Phone;

public class Main {


    public static void main(String[] args) {

        Car audi = new Car();

        System.out.println(audi);

        Human human = new Human();
        System.out.println(human);

        Phone phone = new Phone();
        System.out.println(phone);


        Animal ursus = new Animal("ursus", "felix", true, 356.5);
        System.out.println(ursus);
        ursus.feed();
        audi.recharge(100);

    }
}