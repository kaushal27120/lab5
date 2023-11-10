package lab6;

import java.util.Arrays;

public class task1A {
    public static void main(String[] args) {
        int[] array = {10,9,8,7,6,5,4,3,2,1};

        int counter = 0;
        System.out.println("Before:");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        System.out.println("\nAfter: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
    }
}






