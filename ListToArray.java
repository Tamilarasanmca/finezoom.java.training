import java.util.ArrayList;
import java.util.Arrays;
 /**
 * This program for convert arraylist to array
 */
  public class ListToArray {
	  public static void  main(String[] args)
	  { 
		  ArrayList<String> list = new ArrayList<String>();

		  list.add("Lion");
		 
		  list.add("Tiger");
		 
		  list.add("Deer");
		  
		  list.add("Bull");
		 
		  String[]  array = new String[list.size()];
		  
		  list.toArray(array);
		  
		  for (String  string : array)
		  {
		  System.out.println(string);
		  }
	  } 
  }

