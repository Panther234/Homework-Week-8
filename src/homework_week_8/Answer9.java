package homework_week_8;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Answer9 {
    public static void main(String[] args) {
        int n,a=1,b=1;
        n = 0;
        System.out.print("1 1 ");
        while (n <= 20) {
            n = a + b;
            System.out.print(n + " ");
            a = b;
            b = n;
        }
    }
}
