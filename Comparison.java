import java.util.Scanner;
/**
 * Comparison of two values
 */
public class Comparison {

    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);

        //Input the integer values
        System.out.println( "Enter the integer value of a to compare:");
	int value1=sc.nextInt();
        System.out.println( "Enter the integer value of b to compare:");
        int value2 = sc.nextInt();

        //Comparing two values
        if(value1 == value2)
            System.out.println("The values of a and b are equal");
        if(value1 != value2)
            System.out.println("The values of a and b are not equal");
        if(value1 > value2)
            System.out.println("The value of a greater than b");
        if(value1 < value2)
            System.out.println("The value of a smaller than b");
        
    }
}