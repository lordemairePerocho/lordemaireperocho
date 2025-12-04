
/**
 * Write a description of class no5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class no5
{
   public static void main(String [] args){
       int[] arr ={3, 6, 9, 12, 15};
       int target = 9;
       
       for (int i = 0; i < arr.length; i++){
           if (arr[i] ==target) {
               System.out.println("Found at index: "+ i);
               break;
           }
       }
   }
}