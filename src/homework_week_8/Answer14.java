package homework_week_8;

/**
 * Write a program in Java to display the pattern like a diamond.
 * While loop
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */
public class Answer14 {
    public static void main(String[] args) {
        int count = 0;
        do {
            switch (count) {
                case 0:
                case 12:
                    System.out.println("      *      ");
                    break;
                case 1:
                case 11:
                    System.out.println("     ***     ");
                    break;
                case 2:
                case 10:
                    System.out.println("    *****    ");
                    break;
                case 3:
                case 9:
                    System.out.println("   *******   ");
                    break;
                case 4:
                case 8:
                    System.out.println("  *********  ");
                    break;
                case 5:
                case 7:
                    System.out.println(" *********** ");
                    break;
                case 6:
                    System.out.println("*************");
                    break;
            }
            count++;
        } while (count < 13);
    }
}
