public class Fibonacci {
    public static void main(String[] args) {
//        find sum of even #s in Fibonacci sequence
        int sum = 0;
        int firstNo = 1;
        int secondNo = 2;
        while (secondNo < 4000000) {
            int currNo = firstNo + secondNo;
            if (secondNo % 2 == 0) {
                sum += secondNo;
            }
            firstNo = secondNo;
            secondNo = currNo;
        }

        System.out.println(sum);
    }
}
