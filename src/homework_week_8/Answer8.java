package homework_week_8;

/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Answer8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int c = 0; c < i; c++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
