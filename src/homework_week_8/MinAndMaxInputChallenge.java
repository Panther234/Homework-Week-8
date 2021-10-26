package homework_week_8;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int minNumber = 0;//initial min number is 0
        int maxNumber = 0;//initial max number is 0
        boolean hasMax = false;//initial max number is 0, so its false
        boolean hasMin = false;//initial min number is 0, so its false

        while (true) {
            System.out.print("Enter number: ");
            if (in.hasNextInt()) {
                int input = in.nextInt();
                if (input > maxNumber || !hasMax) {
                    maxNumber = input;
                    hasMax = true;
                }
                if (input < minNumber || !hasMin) {
                    minNumber = input;
                    hasMin = true;
                }
            } else {
                System.out.println("minNumber = " + minNumber);
                System.out.println("maxNumber = " + maxNumber);
                break;//if user enter invalid number then break the loop and print min and max number
            }
        }
        in.close();
    }
}
