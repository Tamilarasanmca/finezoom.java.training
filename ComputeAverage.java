import java.util.*; 
import java.io.*; 
/**
 * This program for compute the average value of an array
 */
 public class ComputeAverage {
 public static void main(String[] args)
 {
    int[] array_nums = {10, 5, 2, 6, 4};
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	int max = array_nums[0];
	int min = array_nums[0];
	float sum = array_nums[0];
	for(int i = 1; i < array_nums.length; i++)
	{
		sum  += array_nums[i];
		if(array_nums[i] > max)
			max = array_nums[i];
		else if(array_nums[i] < min)
			min = array_nums[i];
	}
	float x = ((sum-max-min) / (array_nums.length - 2));
	System.out.printf("average value of an array: %.2f",x);
	System.out.print("\n");	
  }
}