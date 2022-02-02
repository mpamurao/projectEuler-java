import java.util.Scanner;

public class LargestPrimeFactor {
    public static void main(String[] args) {
//        prime# has 2 factors - 1 and itself
//        divide by smallest prime#, divide quotient by smallest prime#, repeat until quotient = 1
        System.out.println("Enter a positive number to find its largest prime factor");
        Scanner sc;
        long nbr;

        while (true) {
            try {
               sc = new Scanner(System.in);
               nbr = sc.nextLong();
               if (nbr < 1) {
                   throw new Exception();
               }
               break;
            }
            catch (Exception ex){
               System.out.println("Please enter a positive number " + ex);
            }
        }
        sc.close();

        long largestPrime = 1;
        for (long i = 2; i < nbr / 2 + 1; i++) {
           if (nbr % i == 0) {
               nbr /= i;
               i--;
               largestPrime = nbr;
           }
        }

        System.out.println(largestPrime);
    }
}
