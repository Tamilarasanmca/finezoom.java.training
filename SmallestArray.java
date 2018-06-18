import java.util.Arrays;
/**
 * This program for second smallest number in array
 */
public class SmallestArray {
  public static void main(String[] args) {

    int[] array = {10,40,50,20,30};
    System.out.println("Array : "+Arrays.toString(array));
    int min = Integer.MAX_VALUE;
    int second_min = Integer.MAX_VALUE;
    for (int i = 0; i < array.length; i++) {
        if(array[i]==min){
          second_min=min;
        } else if (array[i] < min) {
            second_min = min;
            min = array[i];
        } else if (array[i] < second_min) {
            second_min = array[i];
        }

    }
    System.out.println("Second smallest number is : " + second_min);
    }
}