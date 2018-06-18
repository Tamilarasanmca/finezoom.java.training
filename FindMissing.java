import java.util.*;
/**
 * This program for find missing value
 */
public class FindMissing {
 public static void main(String[] args) {

   int totalNum;
   int[] numbers = new int[]{1,2,4,5,6,7};
   totalNum = 7;
   int resultSum = totalNum * ((totalNum + 1) / 2);
   int numSum = 0;
   for (int i: numbers) {
    numSum += i;
   }
       System.out.print( resultSum - numSum);
	   System.out.print("\n");
  }
 }