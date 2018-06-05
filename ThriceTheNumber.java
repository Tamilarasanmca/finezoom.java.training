import java.util.Scanner;
/**
 *Increment the value as thrice and decrement the value as twice
 */
public class ThriceTheNumber{
	
	public static void main (String[] args){
	Scanner s = new Scanner(System.in);
	
	//Increment the given value as thrice
	System.out.println("Enter the number to increment thrice:");
	int number=s.nextInt();
	int thriceNum= number*3;
	
	 System.out.println("The thrice value of "+number+" is "+thriceNum);
	 
	 //Decrement the given value as twice
	 System.out.println("Enter the number to decrement twice:");
     int numberDec=s.nextInt();
	 int twiceNum= numberDec/2;
	
	 System.out.println("The thrice value of "+numberDec+" is "+twiceNum);
	}
	}

