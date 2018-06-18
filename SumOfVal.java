import java.util.*; 
import java.io.*; 
/**
 * This program for check sum of values
 */
 public class SumOfVal {
 public static void main(String[] args)
 {
    int[] array_nums = {1, 3, 1, 2, 1, 5};
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	int search_num = 1;
    int fixed_sum = 3;
	
	System.out.println("Result: "+result(array_nums, search_num, fixed_sum));
    }	
  
  public static boolean result(int[] numbers, int search_num, int fixed_sum) {
   int temp_sum = 0;
   for (int number : numbers) {
      if (number == search_num) {
        temp_sum += search_num;
      }

      if (temp_sum > fixed_sum) {
        break;
      }
    }
    return temp_sum == fixed_sum;
  }  
}