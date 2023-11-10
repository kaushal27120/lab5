package lab5;

public class extra {
        public static void main(String[] args) {
            int[] tab1 = {3, 2, -2, 5, -3};
            int[] tab2 = {1, 1, 2, -1, 2, -1};
            int[] tab3 = {1, 2, 3, -4};
            int[] tab4 = {1, 1};

            printMaxAbsolutePair(tab1);
            printMaxAbsolutePair(tab2);
            printMaxAbsolutePair(tab3);
            printMaxAbsolutePair(tab4);
        }

        static void printMaxAbsolutePair(int[] arr) {
            if (arr.length < 2) {
                System.out.println("Information about the lack of pair");
                return;
            }

            int maxAbsPairFirstIndex = 0;
            int maxAbsPairSecondIndex = 1;

            for (int i = 1; i < arr.length - 1; i++) {
                if (Math.abs(arr[i]) > Math.abs(arr[maxAbsPairFirstIndex])) {
                    maxAbsPairFirstIndex = i;
                    maxAbsPairSecondIndex = i + 1;
                }
            }

            System.out.println("The returned result is a pair of " +
                    arr[maxAbsPairFirstIndex] + " and |" + arr[maxAbsPairSecondIndex] + "|");
        }
    }



