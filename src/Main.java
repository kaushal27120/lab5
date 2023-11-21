import lab7.Blowfish;
import lab7.Dog;
import lab7.Pigeon;
import lab7.Animal;

public class Main {
    public static void main(String[] args) {
                Animal[] animals = new Animal[3];

                animals[0] = new Dog("Buddy", 3, 12.5, "lebra");
                animals[1] = new Blowfish("Bubbles", 1, 0.5, "gold");
                animals[2] = new Pigeon("Feather", 2, 0.8, "Gray", "Rock Pigeon");



                for (Animal animal : animals) {
                    System.out.println(animal.toString());
                    animal.eat();
                    System.out.println("Voice: " + animal.getVoice());



                }
            }
        }
