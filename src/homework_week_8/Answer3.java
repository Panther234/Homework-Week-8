package homework_week_8;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Answer3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an alphabet: ");
        String alphabet = in.next();
        if (alphabet.length() != 1) {
            System.out.println("Alphabet must be only one character");
        } else if (alphabet.charAt(0) < 'A' || alphabet.charAt(0) > 'z') {
            System.out.println("Alphabet must match a-z or A-Z");
        } else {
            switch (alphabet.charAt(0)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("Input letter is vowel");
                    break;
                default:
                    System.out.println("Input letter is consonant");
                    break;
            }
        }
        in.close();
    }
}
