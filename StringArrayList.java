import java.util.ArrayList;
  import java.util.Arrays;
  /**
 * This program for convert array to arraylist
 */
public class StringArrayList {
	  public static void  main(String[] args) 
	  {
		  String[]  zoo = new String[] {"Lion", "Tiger", "Deer",  "Monkey", "Cheetah", "Bull"};
		  ArrayList<String>  list = new ArrayList<String>(Arrays.asList(zoo));
		  
		  System.out.println(list);
	  }
}