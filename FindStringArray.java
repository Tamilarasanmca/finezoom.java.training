import java.util.*;
/**
 * This program for find the common elements in two string arrays
 */
public class FindStringArray {
public static void main(String[] args) 
    {
       String[] student1 = {"Tamil", "English", "Hindhi"};
 
       String[] student2 = {"Malayalam", "English", "Hindhi"};
       
       System.out.println("student1 : "+Arrays.toString(student1));
       System.out.println("student2 : "+Arrays.toString(student2));
 
       HashSet<String> set = new HashSet<String>();
 
        for (int i = 0; i < student1.length; i++)
        {
            for (int j = 0; j < student2.length; j++)
            {
                if(student1[i].equals(student2[j]))
                {
                    set.add(student1[i]);
                }
            }
        }
 
        System.out.println("Common element : "+(set));  
    }
}

