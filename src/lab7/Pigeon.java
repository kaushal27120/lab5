package lab7;


public class Pigeon extends Bird implements AnimalBehavior{
    String species;

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    @Override
    public String toString() {
        return "Pigeon - " + super.toString() + ", Species: " + species;
    }

    @Override
    public void eat() {
        System.out.println("Pigeon is eating");
    }

    @Override
    public String getVoice() {
        return "Coo! Coo!";
    }

    @Override
    public void sleep() {
        System.out.println("Pigeon is sleeping");
    }
}

