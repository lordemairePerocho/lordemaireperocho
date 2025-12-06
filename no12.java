
/**
 * Write a description of class mo12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class no12
{
   public static void main(String[] args) {
        int[] arr = {5, 5, 7, 5, 8};
        int target = 5;
        int count = 0;

        for (int n : arr) {
            if (n == target) {
                count++;
            }
        }

        if (count >= 3)
            System.out.println(target + " appears at least 3 times.");
        else
            System.out.println("Not enough occurrences.");
    }
}