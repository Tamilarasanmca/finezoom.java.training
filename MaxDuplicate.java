import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Arrays; 
/**
 * This program for find majority of duplicate in array
 */
public class MaxDuplicate
{
  	public static void main (String[] args)
	{
		int number[] = { 1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2 };
                                 System.out.println("Original Array : "+Arrays.toString(number));  
		int result = MajorityElement(number);
		if (result != -1)
			System.out.println("Majority element is " + result);
		else
			System.out.println("Majority element does not exist");
	}
  
  
	public static int MajorityElement(int arr[])
	{
		int n = arr.length;

		// Hash Map
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	 
		// Element's frequency in a map
		for (int i = 0; i < n; i++)
		{
			if (map.get(arr[i]) == null)
				map.put(arr[i], 0);
			
			map.put(arr[i], map.get(arr[i]) + 1);
		}

		// Return the element if its count is more than n/2
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) 
		{
			Map.Entry pair = (Map.Entry)it.next();
			if ((int)pair.getValue() > n/2)
				return (int)pair.getKey();

			it.remove(); 
		}

		// no majority element
		return -1;
	}
}
