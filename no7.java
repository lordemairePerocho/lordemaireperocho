
/**
 * Write a description of class no7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class no7
{ 
    public static void main(String[] args) {
        int[] arr = {-5, 3, -9, 10, -1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                arr[i] = Math.abs(arr[i]);
        }

        for (int n : arr)
            System.out.print(n + " ");
    }
}
   