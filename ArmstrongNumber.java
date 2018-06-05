import java.util.Scanner;
/**
 *Finding Armstrong number
 */
class ArmstrongNumber{  
  public static void main(String[] args)  {  
    Scanner s = new Scanner(System.in);
    int c=0,a,temp;

    //Getting input
	System.out.println("Enter the number to check Armstrong number:");
	int n=s.nextInt();	
    
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }  
}  