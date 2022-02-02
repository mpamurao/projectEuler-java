import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestPalindromeProduct {
    public static void main(String[] args) {
//        largest palindrome from product of 2x 3-digit numbers
        int no1 = 999;
        int no2 = 999;
        int product = 0;
        boolean isLargestPalindrome = false;
        boolean sameNo = true;

        while (!isLargestPalindrome || no2 >= 100) {
            product = no1 * no2;
            isLargestPalindrome = isPalindrome(product);
            no1 = no2;

            if (sameNo) {
                no2 = no2 - 1;
                sameNo = false;
            }
            else {
                sameNo = true;
            }
        }
        System.out.println(product);
    }

    private static boolean isPalindrome(int product) {
        List<Integer> numbers = new ArrayList<>();
        Integer currDigit = 0;
        while (product > 1) {
            currDigit = product % 10;
            product = product / 10;
            numbers.add(currDigit);
        }
        List<Integer> reverse = new ArrayList<>(numbers);
        Collections.reverse(numbers);
        return numbers == reverse;
    }
}
