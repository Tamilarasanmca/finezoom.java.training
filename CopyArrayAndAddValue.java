import java.util.Arrays; 
import java.util.Scanner;
/**
 * This program for copy the array to new array
 * Add specific value to array
 * Find duplicate values in array
 */
public class CopyArrayAndAddValue {
 public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
   int[] array = {10,20,30,40};
   int[] newArray = new int[10];     
 
   System.out.println("Source Array : "+Arrays.toString(array));     
   
   for(int i=0; i < array.length; i++) {
    newArray[i] = array[i];
}
   System.out.println("New Array: "+Arrays.toString(newArray));
   //add value in array to specif position
   System.out.println("Enter enter specific index to add:");
	 int indexNum = s.nextInt();
	System.out.println("Enter value to add:");
	 int value = s.nextInt(); 
	 
	 for(int i=newArray.length-1; i > indexNum; i--){
    newArray[i] = newArray[i-1];
   }
   newArray[indexNum] = value;
   System.out.println("New Array: "+Arrays.toString(newArray));
   //find duplicate value
   for (int i = 0; i < newArray.length-1; i++)
        {
            for (int j = i+1; j < newArray.length; j++)
            {
                if ((newArray[i] == newArray[j]) && (i != j))
                {
                    System.out.println("Duplicate Element is : "+newArray[j]);
					
                }
            }
        }
   
 }
 }