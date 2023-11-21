package lab7;

public class Fish extends Animal {
    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }


    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }

    @Override
    public String getVoice() {
        return "Silent in water";
    }

    // Additional methods for Fish class
}

