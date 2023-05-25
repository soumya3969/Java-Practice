// package lab test2;

// public class PrimeChecker {
    
// }


class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class PrimeChecker {
    public static void main(String[] args) {
        int number = -5; // Example input, change as needed

        try {
            if (number < 0) {
                throw new NegativeNumberException("Negative numbers are not allowed.");
            }

            boolean isPrime = checkPrime(number);

            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        } catch (NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
