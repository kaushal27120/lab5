package lab6;

public class task1A {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = 10 - i;
        }
        System.out.print("Before: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
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