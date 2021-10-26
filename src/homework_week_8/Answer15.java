package homework_week_8;

/**
 * Display left angle triangle of * using nested for loops
 *       *
 *     * *
 *   * * *
 *  * * * *
 *   * * * * *
 */
public class Answer15 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            switch (i) {
                case 1:
                    System.out.print("     ");
                    break;
                case 2:
                    System.out.print("   ");
                    break;
                case 3:
                case 5:
                    System.out.print(" ");
                    break;
                case 4:
                    break;
            }
            for (int c = 0; c < i; c++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
