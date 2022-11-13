package creatures;

import creatures.Animal;

public class Pet extends Animal {

    public Pet(String specie, String name, Boolean isAlive, Double weight) {
        super(specie, name, isAlive, weight);
    }

    Pet(String specie) {
        super(specie);
    }
}
