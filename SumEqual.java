/**
 * This program for find sum of equal in array
 */
public class SumEqual {
	static void  pairsValue(int inputArray[], int inputNumber)
	  {
		  System.out.println("Pairs of elements and their sum : ");
		 
		  for (int i =  0; i < inputArray.length; i++)
		  {
		  for (int j  = i+1; j < inputArray.length; j++)
		  {
		  if(inputArray[i]+inputArray[j] == inputNumber)
		  {
		  System.out.println(inputArray[i]+" + "+inputArray[j]+" =  "+inputNumber);
		  }
		  }
	  }
  }
  
  public static void  main(String[] args)
  {
	  pairsValue(new int[] {1,2,5,4,7,3}, 10);
	  
  }
}