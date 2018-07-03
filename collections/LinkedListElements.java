package collections;

/*Linked List String Elements*/
import java.util.*;
public class LinkedListElements {
     public static void main(String args[]) {

       // Linked List Declaration
       LinkedList<String> linkedlist = new LinkedList<String>();

       //adding string elements
       linkedlist.add("Tamil");
       linkedlist.add("English");
       linkedlist.add("Maths");
       linkedlist.add("Science");
       linkedlist.add("Social");

       //Display Linked List elements
       System.out.println("Linked List Content: " +linkedlist);

       //Add element at first position
       linkedlist.addFirst("Computer Science");
       System.out.println("LinkedList elements after addition: " +linkedlist);

       //get and set Values
       Object firstElemt = linkedlist.get(0);
       System.out.println("First element: " +firstElemt);
       linkedlist.set(0, "EVS");
       Object firstChangedElement = linkedlist.get(0);
       System.out.println("First element after update by set method: " +firstChangedElement);

       //Remove last element
       linkedlist.removeLast();
       System.out.println("LinkedList after deletion of last element: " +linkedlist);

       //add and remove particular position
       linkedlist.add(0, "Hindhi");
       linkedlist.remove(2);
       System.out.println("Final Content: " +linkedlist); 
     }
}