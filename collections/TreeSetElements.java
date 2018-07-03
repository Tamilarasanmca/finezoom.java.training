package collections;
/*TreeSet String Elements*/
import java.util.TreeSet;
public class TreeSetElements {
     public static void main(String args[]) {
         // TreeSet of String Type
         TreeSet<String> stringTree = new TreeSet<String>();

         // Adding elements to TreeSet
         stringTree.add("Tamil");
         stringTree.add("Selvan");
         stringTree.add("Krishna");
         stringTree.add("Arasan");
         stringTree.add("Kavi");
         stringTree.add("Ratna");

         //Displaying TreeSet
         System.out.println(stringTree);

         // TreeSet of Integer
         TreeSet<Integer> intTree = new TreeSet<Integer>();

         // Adding elements to TreeSet
         intTree.add(11);
         intTree.add(10);
         intTree.add(15);
         intTree.add(14);
         intTree.add(12);
         intTree.add(13);
         System.out.println(intTree);
    }
 }