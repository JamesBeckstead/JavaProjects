package academy.learnprogramming.algorithm.euclid;

/**
 * Euclid Algorithm<BR>
 *     it calculates the GCD(A, B) - Greatest Common Divisor between two numbers A and B
 */
public class Euclid {

    /**
     * Implementation using recusion <BR>
     *     22/6 = 3 remained 4
     *     6/4 = 1 remained 2
     *     4/2 = 2 remained 0
     * @param number
     * @param divisor
     * @return
     */
    public int gcd(int number, int divisor){
        int remaining = number % divisor;

        if(remaining != 0){
            return gcd(divisor, remaining);
        }else {
            return divisor;
        }
    }

    /**
     * Implementation without recursion
     *     22/6 = 3 remained 4
     *     6/4 = 1 remained 2
     *     4/2 = 2 remained 0
     *
     *     number/temp = result remainder of divisor
     *
     * @param number
     * @param divisor
     * @return
     */

    public int gcd2(int number, int divisor){
        while(divisor != 0) {
            int temp =  divisor;
            divisor = (number % divisor);
            number = temp;
        }
        return number;
    }
}
