package lab7;

public class Dog extends Mammal {
    String Breed;

    public Dog(String name, int age, double weight,String Breed) {
        super(name, age, weight);
        this.Breed = Breed;
    }

    @Override
    public String toString() {
        return "Dog - " + super.toString();
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public String getVoice() {
        return "Woof! Woof!";
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public void move() {
        System.out.println("Dog run");
    }
}

