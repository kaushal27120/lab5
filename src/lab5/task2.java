package lab5;
import java.util.Random;

public class task2 {
        public static void main(String[] args) {
            int[] array = new int[10];

            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                array[i] = random.nextInt(100) + 1; // Random number between 1 and 100
            }

            int smallest = array[0];
            int largest = array[0];

            for (int i = 1; i < 10; i++) {
                if (array[i] < smallest) {
                    smallest = array[i];
                }
                if (array[i] > largest) {
                    largest = array[i];
                }
            }

            System.out.print("random array: ");
            for (int i = 0; i < 10; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();

            System.out.println("min: " + smallest);
            System.out.println("max: " + largest);
        }
    }


