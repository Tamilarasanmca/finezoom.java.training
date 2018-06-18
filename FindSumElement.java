import java.util.*;
/**
 * This program for find sum of two elements in array
 */
public class FindSumElement
{
        public static ArrayList<Integer> two_sum_array_target(final List<Integer> a, int b) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0);
        result.add(0);
        for(int i = 0; i < a.size(); i++){
            if(map.containsKey(a.get(i))){
                int index = map.get(a.get(i));
                result.set(0, index + 1);
                result.set(1, i + 1);
                break;
            }
            else{
                map.put(b - a.get(i), i);
            }
        }
        
        return result;
    }
  
    public static void main(String[] args){
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(4);
        array.add(5);
		array.add(6);
		int target = 6;
        ArrayList<Integer> result = two_sum_array_target(array, target);
        for(int i : result)
            System.out.print("Index: "+i + " ");
    }
}