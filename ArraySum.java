import java.util.Scanner;
/**
 * This program for sum the elements in array
 * Used for loop to get all elements
 */
public class ArraySum {
	public static void main(String[] args) {   
    int num;	
	Scanner s = new Scanner(System.in);
	//to get number of elements
	System.out.print("Enter the number of elements to sum:");
        num = s.nextInt();
		int array[] = new int[num];
        int sum = 0;
	//get all elements	
    System.out.println("Enter all the elements:");
        for (int i = 0; i < num; i++) 
        {
            array[i] = s.nextInt();
        }
	//sum all elements in array	
		for (int i : array)
			sum += i;
		System.out.println("The sum of array " + sum);
		}
}