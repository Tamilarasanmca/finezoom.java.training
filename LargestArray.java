import java.util.Arrays;
/**
 * This program for second largest number in array
 */
public class LargestArray {
	public static void main(String[] args) {
		int[] array = {10,20,32,50,60,40,70};
		System.out.println("Array : "+Arrays.toString(array));            
		Arrays.sort(array);
		int index = array.length-1;
			while(array[index]==array[array.length-1]){
			index--;
			}
		System.out.println("Second largest value is: " + array[index]);
	}
}