import java.util.Arrays; 
/**
 * This program for reverse values in array
 */
public class ReverseArray {
public static void main(String[] args){   
		int[] array = {
				10,20,40,30,50};
	  System.out.println("Original array : "+Arrays.toString(array));  
	   for(int i = 0; i < array.length / 2; i++)
	  {
		int temp = array[i];
		array[i] = array[array.length - i - 1];
		array[array.length - i - 1] = temp;
	  }
		System.out.println("Reverse array : "+Arrays.toString(array));
	 }
}