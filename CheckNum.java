import java.util.*; 
import java.io.*; 
/**
 * This program for check two specified numbers
 */
 public class CheckNum {
 public static void main(String[] args)
 {
    int[] array_nums = {5, 3, 7, 8, 2};
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	System.out.println("Result: "+test(array_nums));
    }	
    public static boolean test(int[] numbers) {
    for (int number : numbers) {
      if (number == 0 || number == -1) {
        return false;
      }
    }
    return true;
  }  
}