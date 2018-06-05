
class Prime
{
   public static void main(String args[])
   {		
	int number;
	boolean isPrime=true;
	int given_number=11;
        
        for(int i=2;i<=given_number/2;i++)
	{
           number=given_number%i;
	   if(number==0)
	   {
	      isPrime=false;
	      
	   }
	}
	
        if(isPrime)
	   System.out.println(given_number + " is a Prime Number");
	else
	   System.out.println(given_number + " is not a Prime Number");
   }
}