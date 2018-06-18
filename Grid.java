/**
 * This program for print a grid
 * Used for loop to print
 */
public class Grid {
	public static void main(String[] args) {   
     //initializing a as multidimentional array
	 int [][]a = new int[10][10];    
	 for(int i = 0; i < 10; i++)
	   {
		  for(int j = 0; j < 10; j++)
		  {
			 System.out.printf("- ", a[i][j]);
		  }
		  System.out.println();
	   }
	}
}