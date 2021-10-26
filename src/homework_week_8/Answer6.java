package homework_week_8;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class Answer6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = in.nextInt();
        for (int i = 1; i <= rows; i++) { //iterate through each row
            for (int c = 1; c <= i; c++) { //iterate through each number for each row
                System.out.print(c);
            }
            System.out.println();

        }
        in.close();//scanner close
    }
}
