public class Main {

    public static void main(String[] args) {
	// Fibinacci numbers even summed
        long previous = 0;
        long current = 1;
        long temp;
        long end = 4000000;
        long sum = 0;

        while (current < end){
            if (current % 2 == 0) {
                sum = sum + current;
            }
            temp = current;
            current = current + previous;
            previous = temp;
        }
        System.out.println(sum);
    }
}


