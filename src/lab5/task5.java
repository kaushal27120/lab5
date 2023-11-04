package lab5;
import java.util.Scanner;
public class task5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("please enter a word: ");
            String input = scanner.nextLine().toLowerCase();

            if (isPalindrome(input)) {
                System.out.println("The word is a palindrome.");
            } else {
                System.out.println("The word is not a palindrome.");
            }
        }

        public static boolean isPalindrome(String word) {
            int left = 0;
            int right = word.length() - 1;

            while (left < right) {
                if (word.charAt(left) != word.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }
}


