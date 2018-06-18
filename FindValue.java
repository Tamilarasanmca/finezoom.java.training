import java.util.Arrays; 
import java.util.Scanner;
/**
 * This program for find specific value in array
 * Used for loop to get all elements
 */
public class FindValue{
   public static void main(String[] args) {
          int num;	
	Scanner s = new Scanner(System.in);
	//to get number of elements
	System.out.print("Enter the number of elements:");
        num = s.nextInt();
		int array[] = new int[num];
        int sum = 0;
	//get all elements	
    System.out.println("Enter all the elements:");
        for (int i = 0; i < num; i++) 
        {
            array[i] = s.nextInt();
        }
     System.out.println("Enter enter specific value to find:");
	 int n = s.nextInt();
	 int find = 0;
	 int notFind = 0;
	  for (int arr : array) {
         if (n == arr) {
            find = n;
         }
		 else{
			 notFind = n;
			
		 }
      }
	  System.out.println("The "+ find +" is in array list"); 
	  System.out.println("The "+ find +" is not in array list"); 
   }
}