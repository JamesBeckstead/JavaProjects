public class Main {


    public static Boolean FindSmallestFactor(int n, int factor){
        if ( factor == 0){
            return true;
        }else if (n % factor == 0){
            return FindSmallestFactor(n, factor - 1);
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
	// smallest number evenly divisible by the numbers 1 to 20
        int i = 20;
        while (!FindSmallestFactor(i, 20)){
            i = i + 20;
        }
        System.out.println(i);
    }
}
