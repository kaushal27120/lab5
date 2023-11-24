package lab7;

public class Fish extends Animal implements AnimalBehavior, AnimalMove, AnimalName{
    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public String toString() {
        return "Fish - " + super.toString();
    }


    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }

    @Override
    public String getVoice() {
        return "Silent in water";
    }

    public void sleep() {
        System.out.println("Fish is sleeping");
    }

    @Override
    public void move() {
        System.out.println("fish sweams in water");
    }
}

