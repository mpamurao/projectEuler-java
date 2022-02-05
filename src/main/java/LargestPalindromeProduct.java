import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestPalindromeProduct {
    public static void main(String[] args) {
//        largest palindrome from product of 2x 3-digit numbers
        int largestProduct = 1;

        for (int nbr = 999; nbr >= 100; nbr--) {
            for (int i = nbr; i >= 100; i--) {
                int product = nbr * i;

                if (product % 10 == 0 || product < largestProduct) {
                    continue;
                }

                if (isPalindrome(product)) {
                    largestProduct = product;
                }
            }
        }
        System.out.println(largestProduct);
    }

    private static boolean isPalindrome(int product) {
        int reverse = 0;
        int x = product;

        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return product == reverse;
    }
}
