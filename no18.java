
/**
 * Write a description of class no18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class no18
{
     public static void main(String[] args) {
        int[] arr = {3, 5, 7, 3, 9};
        boolean duplicate = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
        }

        System.out.println("Contains duplicates? " + duplicate);
    }
}