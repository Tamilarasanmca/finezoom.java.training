import java.util.Arrays; 
/**
 * This program for find common values in two integer arrays
 */
public class FindCommonInteger {
public static void main(String[] args) 
    {
      int[] array1 = {10,20,3,30,40,5,50};
      int[] array2 = {1,2,3,4,5,6,7};
 
       System.out.println("Array1 : "+Arrays.toString(array1));
       System.out.println("Array2 : "+Arrays.toString(array2));
 
      
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i] == (array2[j]))
                {
                 
                 System.out.println("Common element is : "+(array1[i]));
                 }
            }
        }
 
    }
}

