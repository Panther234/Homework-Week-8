package homework_week_8;

/**
 * Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */
public class Answer13 {
    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 >= 10 && number1 <= 99 && number2 <= 99 && number2 >= 10) {
            String num1 = String.valueOf(number1);
            String num2 = String.valueOf(number2);
            if (num1.contains("0") && num2.contains("0")) {
                return true;
            } else if (num1.contains("1") && num2.contains("1")) {
                return true;
            } else if (num1.contains("2") && num2.contains("2")) {
                return true;
            } else if (num1.contains("3") && num2.contains("3")) {
                return true;
            } else if (num1.contains("4") && num2.contains("4")) {
                return true;
            } else if (num1.contains("5") && num2.contains("5")) {
                return true;
            } else if (num1.contains("6") && num2.contains("6")) {
                return true;
            } else if (num1.contains("7") && num2.contains("7")) {
                return true;
            } else if (num1.contains("8") && num2.contains("8")) {
                return true;
            } else return num1.contains("9") && num2.contains("9");
        } else return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

    }
}
