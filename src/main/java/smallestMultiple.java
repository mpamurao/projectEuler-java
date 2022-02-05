public class smallestMultiple {
    public static void main(String[] args) {
//        2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//        What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
        int number = 10;
        int maxNbr = 20;
        boolean allDivisible = false;

        while (!allDivisible) {
            for (int i = 1; i <= maxNbr; i++) {
               if (number % i != 0) {
                   break;
               }
               if (i == maxNbr) {
                   System.out.println(number);
                   allDivisible = true;
               }
            }
        number +=10;
        }
    }
}
