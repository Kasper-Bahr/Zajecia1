package creatures;

public class Animal {
    private static final Double DEFAULT_DOG_WEIGHT = 12.3;
    private static final Double DEFAULT_CAT_WEIGHT = 3.2;
    private static final Double DEFAULT_BEAR_WEIGHT = 480.0;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    String specie;
    String name;
    Boolean isAlive;
    Double weight;


    public Animal(String specie, String name, Boolean isAlive, Double weight) {
        this.specie = specie;
        this.name = name;
        this.isAlive = isAlive;
        this.weight = weight;
    }

    public void feed() {
        if (this.isAlive) {
            this.weight += 1;
            System.out.println("thx bro for food");
        } else {
            System.out.println("too late bro");
        }
    }

    void takeForAWalk() {
        if (isAlive == true) {
            this.weight -= 1;
            System.out.println("idziemy na spacer");
        } else {
            System.out.println("trupa wyprowadzasz?");
        }
    }

    Animal(String specie) {
        switch (specie) {
            case "canis" -> this.weight = DEFAULT_DOG_WEIGHT;
            case "felis" -> this.weight = DEFAULT_CAT_WEIGHT;
            case "ursus" -> this.weight = DEFAULT_BEAR_WEIGHT;
            default -> this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }
    public String toString () {
        return "rodzaj" + this.specie + " " + "imie" + this.name + "czy żyje?" + " " + this.isAlive + "waga" + "" + this.weight;
    }

   /* @Override
    public void beEaten() throws Exception{
        if(this instanceof Human){
            throw new Exception("halo Policja");
        }else {
            this.isAlive = false;
            this.weight = 0.0;
            System.out.println("Mam nadzieje, że smakowało morderco jebaniutki");
        }
    }

    @Override
    public boolean isPoisoned() {
        if(this.specie.equals("snake")){
            return true;
        }else {
            return false;
        }
    }*/
}
