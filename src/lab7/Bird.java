package lab7;


public class Bird extends Animal implements AnimalBehavior, AnimalMove, AnimalName{
    String featherColor;

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }
    @Override
    public String toString() {
        return "Bird - " + super.toString() + ", Feather Color: " + featherColor;
    }


    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public String getVoice() {
        return "Chirp! Chirp!";
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping");
    }

    @Override
    public void move() {
        System.out.println("Bird flies in the sky");
    }
}
