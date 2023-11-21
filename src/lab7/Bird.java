package lab7;


public class Bird extends Animal {
    String featherColor;

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public String getVoice() {
        return "Chirp! Chirp!";
    }

}
