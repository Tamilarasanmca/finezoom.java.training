package collections;

import java.util.*;
/*I am going to add,remove,replace,find 
 *elements in arraylist */
public class ArrayListElements {
   public static void main(String args[]) {
      
	  ArrayList<String> numList = new ArrayList<String>();

	  /*Elements added to the array list*/
	  numList.add("one");
	  numList.add("two");
	  numList.add("three");
	  numList.add("four");
	  numList.add("five");

	  /* Displaying array list elements */
	  System.out.println("Currently the array list has following elements:"+numList);

	  /*Add element at the given index*/
	  numList.add(0, "six");
	  numList.add(1, "seven");

	  /*Remove elements from array list like this*/
	  numList.remove("three");
	  numList.remove("four");
	  
	  System.out.println("Current array list is:"+numList);

	  /*Remove element from the given index*/
	  numList.remove(1);

	  System.out.println("Current array list is:"+numList);
	  
	  /*Replacing the element*/
	  numList.set(2, "ten");
	  System.out.println("Current array list is:"+numList); 
	  
	  /*Finding index of element*/
	  int num = numList.indexOf("ten");
	  System.out.println("The index of Ten is:"+num); 
	  
	  /*Finding value with index*/
	  String value = numList.get(2);
	  System.out.println("The value of index 2 is:"+value); 
	  
	  /*Finding number elements in list*/
	  int noOfValue = numList.size();
	  System.out.println("Number of elements in list:"+noOfValue); 
	  
	  
   }
}