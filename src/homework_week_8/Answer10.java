package homework_week_8;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Answer10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = in.nextInt();
        int temp = n;
        int r;
        int sum = 0;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            sum = sum + r * r * r;

        }
        if (temp == sum)
            System.out.println("This is an armstrong number");
        else
            System.out.println("This is not an armstrong number");
        in.close();
    }
}
