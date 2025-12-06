
/**
 * Write a description of class no20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class no20
{
  public static void main(String[] args) {
        int[] arr = {10, 22, 35, 40, 18};

        for (int n : arr) {
            if (n % 2 == 0 && n > 20) {
                System.out.println(n);
            }
        }
    }
}