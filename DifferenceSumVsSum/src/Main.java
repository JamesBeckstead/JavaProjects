public class Main {

    public static int SumOfSquare (int n){
        if (n == 0){
            return n * n;
        } else {
            return n * n + SumOfSquare( n - 1);
        }
    }

    public static int SquareOfSum ( int i) {
        if (i == 0) {
            return i + i;
        } else {
            return i + SquareOfSum(i - 1);
        }
    }

    public static void main(String[] args) {
	// find the difference between the sum of square and the square sum
        int sum1 = SumOfSquare(100);
        int sum2 = SquareOfSum(100);

        System.out.println("The answer is " + ((sum2 * sum2) - sum1));
    }
}
