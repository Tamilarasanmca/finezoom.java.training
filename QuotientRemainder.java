
import java.util.Scanner;
/**
 *Finding Quotient and remainder
 */
public class QuotientRemainder {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		//Getting input
        System.out.println("Enter the divident number:");
	    int dividend=s.nextInt();
		
		System.out.println("Enter the divisor number:");
	    int divisor=s.nextInt();
        //Calculating Quotient and remainder
        double quotient = dividend / divisor;
        double remainder = dividend % divisor;
        //Displaying Quotient and remainder
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}