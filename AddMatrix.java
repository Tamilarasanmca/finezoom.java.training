import java.util.Scanner;
/**
 * This program for add two matrix
 */
public class AddMatrix {
 public static void main(String args[])
   {
      int row, column, c, d;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Input number of rows of matrix");
      row = in.nextInt();
      System.out.println("Input number of columns of matrix");
      column  = in.nextInt();
 
      int array1[][] = new int[row][column];
      int array2[][] = new int[row][column];
      int sum[][] = new int[row][column];
 
      System.out.println("Inputs for first matrix");
 
      for (  c = 0 ; c < row ; c++ )
         for ( d = 0 ; d < column ; d++ )
            array1[c][d] = in.nextInt();
 
      System.out.println("Inputs for second matrix");
 
      for ( c = 0 ; c < row ; c++ )
         for ( d = 0 ; d < column ; d++ )
            array2[c][d] = in.nextInt();
 
      for ( c = 0 ; c < row ; c++ )
         for ( d = 0 ; d < column ; d++ )
             sum[c][d] = array1[c][d] + array2[c][d]; 
 
      System.out.println("Sum of the matrices:-");
 
      for ( c = 0 ; c < row ; c++ )
      {
         for ( d = 0 ; d < column ; d++ )
            System.out.print(sum[c][d]+"\t");
 
         System.out.println();
      }
   }
}

