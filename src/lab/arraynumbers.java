package lab;

public class arraynumbers {
    public static void main(String[] args) {
        int[] numbers = new int[10];


        for (int i = 0; i < 10; i++) {
            numbers[i] = 9 - i;
        }

        for (int i =0; i < 10; i++) {
            System.out.println(numbers[i]);
        }
    }

}
