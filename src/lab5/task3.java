package lab5;

public class task3 {
        public static void main(String[] args) {
            int[][] matrix = new int[10][10];

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (i == j) {
                        matrix[i][j] = i;
                    } else {
                        matrix[i][j] = 0;
                    }
                }
            }
            int diagonalSum = 0;
            for (int i = 0; i < 10; i++) {
                diagonalSum += matrix[i][i];
            }
            System.out.println("Matrix:");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(matrix[i][j] + " \n");
                }
            }
            System.out.println("Sum: " + diagonalSum);
        }
    }


