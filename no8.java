
/**
 * Write a description of class no8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class no8
{
   public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }

        for (int n : B)
            System.out.print(n + " ");
    }
}