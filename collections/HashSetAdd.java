package collections;
/*HashSet String Elements*/
import java.util.HashSet;
public class HashSetAdd {
   public static void main(String args[]) {
      // HashSet declaration
      HashSet<String> hashSet = 
               new HashSet<String>();

      // Adding elements to the HashSet
      hashSet.add("Tamil");
      hashSet.add("English");
      hashSet.add("Maths");
      hashSet.add("Science");
      hashSet.add("Social");
      //Addition of duplicate elements
      hashSet.add("Tamil");
      hashSet.add("English");
      //Addition of null values
      hashSet.add(null);
      hashSet.add(null);

      //Displaying HashSet elements
      System.out.println(hashSet);
    }
}