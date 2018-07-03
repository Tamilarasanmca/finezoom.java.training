/*Sorting string elements in ascending order using array list*/
import java.util.*;
public class ArrayListAscending  {

	public static void main(String args[]){
	   ArrayList<String> arraylist = new ArrayList<String>();
	   arraylist.add("Arun");
	   arraylist.add("Tamil");
	   arraylist.add("Selven");
	   arraylist.add("Kumar");

	   //ArrayList sorting
	   System.out.println("Before Sorting:");
	   for(String str: arraylist){
			System.out.println(str);
		}

	   //Sorting
	   Collections.sort(arraylist);

	  System.out.println("ArrayList in descending order:");
	   for(String str: arraylist){
			System.out.println(str);
		}
	}
}
