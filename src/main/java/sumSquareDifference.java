public class sumSquareDifference {
//    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
    public static void main(String[] args) {
        int sum = 0;
        int sumOfSquares = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            sumOfSquares += i*i;
        }

        int squareOfSum = sum * sum;
        System.out.println(squareOfSum - sumOfSquares);
    }
}
