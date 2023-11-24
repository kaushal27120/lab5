package lab7;

public class Mammal extends Animal {

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

}
