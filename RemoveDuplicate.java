import java.util.Arrays;
 /**
 * This program for remove duplicate from array
 */
public class RemoveDuplicate {
   static void firstArray(int[] array)
    {
        System.out.println("Original Array : ");
         
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+",");
        }
         
        
         
        int noElements = array.length;
         
        //Comparing elements
         
        for (int i = 0; i < noElements; i++) 
        {
            for (int j = i+1; j < noElements; j++)
            {
                //If any two elements are found equal
                 
                if(array[i] == array[j])
                {
                    //Replace duplicate element with last unique element
                     
                    array[j] = array[noElements-1];
                     
                    noElements--;
                     
                    j--;
                }
            }
        }
         
        //only unique values in array
         
        int[] array1 = Arrays.copyOf(array, noElements);
         
        System.out.println("Array with unique values : ");
         
        for (int i = 0; i < array1.length; i++)
        {
            System.out.print(array1[i]+",");
        }
         
        System.out.println();
         
       
    }
     
    public static void main(String[] args) 
    {        
        firstArray(new int[] {1,4,2,5,3,6,7,2});
         
      }    
}

