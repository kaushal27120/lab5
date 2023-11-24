package lab7;

public class Mammal extends Animal implements AnimalBehavior, AnimalMove, AnimalName{

    public Mammal(String name, int age, double weight) {

        super(name, age, weight);
    }

    @Override
    public void eat() {
        System.out.println("Mammal is eating");
    }

    @Override
    public String getVoice() {
        return "Mammal sound";
    }

    @Override
    public void sleep() {
        System.out.println("Mammal is sleeping");
    }

    @Override
    public void move() {
        System.out.println("Mammal don't move");
    }

}
