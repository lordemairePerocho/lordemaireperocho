
/**
 * Write a description of class no6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class no6
{
   public static void main(String[] args){
        int[] arr = {1, 3, 5, 2, 4, 7};
        int sum = 0, count = 0;

        for (int n : arr) {
            if (n % 2 != 0) {
                sum += n;
                count++;
            }
        }

        double avg = (double) sum / count;
        System.out.println("Average odd = " + avg);
    }
}