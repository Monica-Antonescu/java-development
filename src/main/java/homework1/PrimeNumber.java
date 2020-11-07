package src.main.java.homework1;

public class PrimeNumber {

    public static void main(String[] args) {
        //Display all the prime numbers lower than a given number
        int number = 12345;
        System.out.print("All prime numbers from 1 to " + number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (isNumberPrime(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    private static boolean isNumberPrime(int number) {
        int count = 0;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            return true;
        }
        return false;
    }
}
