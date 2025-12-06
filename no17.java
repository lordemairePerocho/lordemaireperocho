
/**
 * Write a description of class no17 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class no17
{
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 80, 60};
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > max) {
                second = max;
                max = n;
            } else if (n > second && n != max) {
                second = n;
            }
        }

        System.out.println("Second highest = " + second);
    }
}