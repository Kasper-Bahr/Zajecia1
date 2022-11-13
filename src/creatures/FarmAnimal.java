package creatures;

import creatures.Animal;

public class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String specie, String name, Boolean isAlive, Double weight) {
        super(specie, name, isAlive, weight);
    }

    FarmAnimal(String specie) {
        super(specie);
    }

    @Override
    public void beEaten() {

    }

    @Override
    public boolean isPoisoned() {
        return false;
    }
}

