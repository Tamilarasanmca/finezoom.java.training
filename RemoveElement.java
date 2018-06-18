import java.util.Arrays; 
/**
 * This program for remove a particular element in array
 * Used for loop to find index of array
 */
public class RemoveElement {
 
	public static void main(String[] args) {
	   int[] my_array = {10,40,30,20,50};
	   
	   System.out.println("Original Array : "+Arrays.toString(my_array));     
	   
	  // Remove the third element
	   int removeIndex = 2;

	   for(int i = removeIndex; i < my_array.length -1; i++){
			my_array[i] = my_array[i + 1];
		  }
	// After removal of element the array will be
		System.out.println("After removing the third element: "+Arrays.toString(my_array));
	 }
 }