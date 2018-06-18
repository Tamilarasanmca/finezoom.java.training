import java.util.Arrays; 
/**
 * This program for find the number of even and odd integers
 */
 public class FindOddEven {
 public static void main(String[] args)
 {
    int[] array_nums = {3, 9, 6, 8, 7};
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	int ctr = 0;
	for(int i = 0; i < array_nums.length; i++)
	{
		if(array_nums[i] % 2 == 0)
			ctr++;
	}
	System.out.println("Number of even numbers : "+ctr);
	System.out.println("Number of odd numbers  : "+(array_nums.length-ctr));
 }
}