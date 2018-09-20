import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // largest prime factor of a given large number
        long N = 600851475143L;
        ArrayList<Long> possiblePrimeFactorList = new ArrayList<>();
        ArrayList<Long> primeFactors = new ArrayList<>();
        long B = Math.round(Math.sqrt(N));
        System.out.println(B);

        for (long possFactor = 3; possFactor < B; possFactor+=2){
            if (N % possFactor == 0){
                possiblePrimeFactorList.add(possFactor);
                primeFactors.add(possFactor);
            }
        }
        for (Long possiblePrime : possiblePrimeFactorList) {
            for (int j = 2; j < possiblePrime; j++) {
                if (possiblePrime % j == 0) {
                    primeFactors.remove(possiblePrime);
                    break;
                }
            }

        }
        System.out.println("The answer is " + primeFactors.get(primeFactors.size()-1));

        // First, start from the maximum number and divide by 2
        // until you can no longer divide evenly by 2, i.e., the number is odd
        while (N % 2 == 0) {

            // in the case of 600851475143 this will be skipped entirely since it is an odd number,
            // but for the sake of generality we will keep it so it can be used on any number
            N /= 2;
        }

        // the next prime number is 3, and all prime numbers from there are odd numbers,
        // so we can safely just add 2 to the factor each time and only test for odd numbers
        // note that this has a small inefficiency in that it will also test for a few non-prime odd numbers
        // like 9, 15, 21, etc. but it's much less computational work to try dividing by a candidate factor than to test for primality.
        for (long factor = 3; factor < N; factor += 2) {

            // if N is evenly divisible by the factor, then we just divide it, and we keep going
            // until N can no longer be divided by a number smaller than itself,
            // in other words, until N is a prime number
            while (N % factor == 0 && factor < N) {
                N /= factor;
            }
        }
        System.out.println("The answer is " + N);

//
//        long tgtNumber = 600851475143L;
//        long possiblePrimeFactor = 3;
//        ArrayList<Long>  primeFactors = new ArrayList<>();
//        ArrayList<Long> possiblePrimeFactorList = new ArrayList<>();
//        while (possiblePrimeFactor < tgtNumber) {
//            if (tgtNumber % possiblePrimeFactor == 0) {
//                possiblePrimeFactorList.add(possiblePrimeFactor);
//                primeFactors.add(possiblePrimeFactor);
//            }
//            possiblePrimeFactor++;
//        }
//        Long[] possiblePrimes = possiblePrimeFactorList.toArray(new Long[0]);
//        for (Long possiblePrime : possiblePrimes) {
//            //System.out.println(possiblePrimes[i] + " contained within? " +  primeFactors.contains(possiblePrimes[i]));
//            for (int j = 2; j < possiblePrime; j++) {
//                if (possiblePrime % j == 0) {
//                    primeFactors.remove(possiblePrime);
//                    break;
//                }
//            }
//
//        }
//        Long[] primes = primeFactors.toArray(new Long[0]);
//        long temp = 0;
//        //System.out.println(Arrays.toString(primes));
//        for (Long prime : primes) {
//            if (prime > temp) {
//                temp = prime;
//            }
//        }
//        System.out.println(temp);
  }
}