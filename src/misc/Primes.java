package misc;
public class Primes {
	public static void main(String[] args) {
        System.out.println(sumFirstPrimes(10));
    }
    // Calculates the total of the first n primes
    public static int sumFirstPrimes(int n) {
        /* Since 2 is the only even prime it is pre-included; 
        affords convenience of skipping other evens.
        3 is as well to skip an otherwise necessary check in isPrime() */
        int result = 5, count = 2;

        for (int i = 5; count < n; i += 2) {
            if (isPrime(i)) { result += i; count++; }
        }
        return result;
    }
    /* Determines if a number is prime, commented out irrelevant checks
    remove comments for general use */
    private static boolean isPrime(int num) {
        // if (num <= 3) { return num > 1; }
        if (/*(num & 1) == 0 || */ num % 3 == 0) { return false; }

        int limit = (int)Math.sqrt(num);

        for (int i = 5; i <= limit; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) { return false; }
        }
        return true;
    }
    
    @Override
    protected void finalize() throws Throwable {
    	System.out.println("In GC");
    	super.finalize();
    }
}