
/**
 * Write a description of class no9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class no9
{
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, num;

        do {
            num = sc.nextInt();
            sum += num;
        } while (num != 0);

        System.out.println("Sum = " + sum);
    }
}