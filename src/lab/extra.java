package lab;

public class extra {
        public static void main(String[] args) {
                    int[] tab1 = {3, 2, -2, 5, -3};
                    findHighestAbsolutePair(tab1);

                    int[] tab2 = {1, 1, 2, -1, 2, -1};
                    findHighestAbsolutePair(tab2);

                    int[] tab3 = {1, 2, 3, -4};
                    findHighestAbsolutePair(tab3);

                    int[] tab4 = {1, 1};
                    findHighestAbsolutePair(tab4);
                }

    public static void findHighestAbsolutePair(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Information about the lack of pair");
            return;
        }

        int maxAbsPair = 0;
        int num1 = 0, num2 = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i]) == Math.abs(arr[j]) && arr[i] * arr[j] < 0) {
                    int currentAbsPair = Math.abs(arr[i]) + Math.abs(arr[j]);
                    if (currentAbsPair > maxAbsPair) {
                        maxAbsPair = currentAbsPair;
                        num1 = arr[i];
                        num2 = arr[j];
                    }
                }
            }
        }

        if (maxAbsPair == 0) {
            System.out.println("Information about the lack of pair");
            return;
        }

        System.out.println("The returned result is a pair of " + num1 + " and " + num2);
    }
}