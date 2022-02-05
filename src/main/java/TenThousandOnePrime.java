import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TenThousandOnePrime {
//    What is the 10 001st prime number?
//    first six prime numbers: 2, 3, 5, 7, 11, and 13
    public static void main(String[] args) {
//        2 is only even prime#
//        5 is only prime divisible by 5
        int primeCount = 6;
        int nbr = 15;
        List<Integer> primeInts = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13));

        while (primeCount != 10001) {
            for (int i = 0; i < primeInts.size(); i++) {
                if (nbr % primeInts.get(i) == 0) {
                    break;
                }
                if (i == primeInts.size() - 1) {
                    primeInts.add(nbr);
                    primeCount++;
                }
            }

            if (primeCount != 10001) {
                nbr += 2;
            }
        }
        System.out.println(nbr);
    }
}
