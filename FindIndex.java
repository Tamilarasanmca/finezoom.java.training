/**
 * This program for find index of array
 */
public class FindIndex {
       public static int  findIndex (int[] array, int t) {
        if (array == null) return -1;
        int length = array.length;
        int i = 0;
		//finding index of 40 in while loop with array length
        while (i < length) {
            if (array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
      int[] array = {10,20,30,40,50};
      System.out.println("Index position of 40 is: " + findIndex(array, 40));
      }
}