
/**
 * Write a description of class no2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class no2
{
    public static void main( String [] args){
        int [] arr ={ 7, 1, 7, 3, 4, 7, 0, 2, 8, 7};
        int count = 0;
        
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] == 7) count++;
            }
        System.out.println("Number of 7:  "+ count);
         }
    }