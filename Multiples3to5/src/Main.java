public class Main {

    public static void main(String[] args) {
	//multiples of 3 and 5 of real numbers below 10: 3, 5, 6, 9

        int end = 1000;
        int start = 2;
        long sum = 0;

        while (start < end){
            if (start % 3 == 0 || start % 5 == 0){
                sum = sum + start;
            }
            start = start + 1;
        }
        System.out.println(sum);
    }
}
