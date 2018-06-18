import java.util.Scanner;
public class Descending_Order 
{
    public static void main(String[] args) 
    {
        int num, tempVar;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements to sort:");
        num = s.nextInt();
        int array[] = new int[num];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < num; i++) 
        {
            array[i] = s.nextInt();
        }
        for (int i = 0; i < num; i++) 
        {
            for (int j = i + 1; j < num; j++) 
            {
                if (array[i] < array[j]) 
                {
                    tempVar = array[i];
                    array[i] = array[j];
                    array[j] = tempVar;
                }
            }
        }
        System.out.print("Descending Order:");
        for (int i = 0; i < num - 1; i++) 
        {
            System.out.print(array[i] + ",");
        }
        System.out.print(array[num - 1]);
    }
}