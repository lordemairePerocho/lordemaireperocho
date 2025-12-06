
/**
 * Write a description of class no16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class no16
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digits = 0;

        while (n != 0) {
            n /= 10;
            digits++;
        }

        System.out.println("Digits: " + digits);
    }
}