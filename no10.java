
/**
 * Write a description of class no10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class no10
{
     public static void main(String[] args) {
        int[] arr = {5, 9, 7, 4, 11};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("First even at index " + i);
                break;
            }
        }
    }
}