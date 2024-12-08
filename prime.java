public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are:");

        for (int num = 2; num <= 100; num++) { // Loop through numbers 2 to 100
            boolean isPrime = true;

            // Check if num is divisible by any number from 2 to its square root
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Exit loop if not prime
                }
            }

            // If the number is prime, print it
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
