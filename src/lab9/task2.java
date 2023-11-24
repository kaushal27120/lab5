package lab9;

public class task2 {
    public static void main(String[] args) {
        try {
            processInput(5);
            processInput(0);
            processInput(5);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    private static void processInput(int value) {
        if (value == 0) {
            int result = 10 / value;
        } else if (value == -1) {
            int[] array = new int[5];
            int element = array[value];
        } else {
            System.out.println("No exception thrown for value: " + value);
        }
    }
}


