package homework_week_8;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class Answer12 {

    /**
     * Checks whether a number is prime
     * We make a boolean isPrime, and initialize it to true.
     * We check for every number from two to the given number whether it is a factor of number
     * If it is a factor of number, then we know that the number cannot be prime, and we therefore return false
     * However, if there are no factors other than 1 and itself, it must be prime, which is when true is returned
     * Because negative numbers aren't considered to be prime, we will return false for them
     * @param number number to check for whether it is prime or not
     * @return if number is prime
     */
    public static boolean checkPrime(int number) {
        if (number <= 1)
            return false;
        else {
            boolean isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = in.nextInt();
        System.out.println(checkPrime(a) ? "It is a prime number" : "It is not a prime number");
        in.close();
    }
}
