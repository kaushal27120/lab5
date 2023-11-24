package lab7;

public abstract class Animal {
    String name;
    int age;
    double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
        @Override
        public String toString() {
            return "Name: " + name + ", Age: " + age + ", Weight: " + weight;
        }


    public abstract void eat();

    public abstract String getVoice();

}
