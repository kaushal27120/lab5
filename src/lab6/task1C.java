package lab6;

import java.util.Arrays;

public class task1C {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int counter = 0;
        System.out.println(Arrays.toString(array));

        boolean tosort = true;

        for (int i = 1; i < array.length && tosort; i++) {
            tosort = false;
            counter++;
            for (int j = 0; j < array.length - i; j++) {
                counter++;
                if (array[j] > array[j + 1]) {
                    counter++;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    tosort = true;
                }
            }

        }

        System.out.println("\nAfter: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println("\nTotal Number of Actions: " + counter);
    }
}

