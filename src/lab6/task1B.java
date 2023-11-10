package lab6;

import java.util.Arrays;

public class task1B {
    public static void main(String[] args) {
        int[] array = {10,9,8,7,6,5,4,3,2,1};

        int counter = 0;
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            counter++;
            for (int j = 0; j < array.length - i; j++) {
                counter++;
                if (array[j] > array[j + 1]) {
                    counter++;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
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
