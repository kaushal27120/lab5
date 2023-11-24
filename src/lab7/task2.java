package lab7;

public class task2 {
        public static void main(String[] args) {
            Animal[] animals = new Animal[6];


            animals[0] = new Dog("Black", 3, 12.5, "lebra");
            animals[1] = new Blowfish("Jackie", 1, 0.5, "gold");
            animals[2] = new Pigeon("Rock", 2, 0.8, "Gray", "Rock Pigeon");
            animals[3] = new Mammal("Mammal", 5, 20.0);
            animals[4] = new Bird("Peacock", 2, 0.5, "Blue");
            animals[5] = new Fish("Goldie", 1, 0.2);

            for (Animal animal : animals) {
                System.out.println(animal.toString());
                animal.eat();
                System.out.println("Voice: " + animal.getVoice());
                animal.sleep();
                animal.move();
                AnimalName.name(animal.getName());
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
            }

        }
    }


