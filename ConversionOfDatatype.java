import java.util.Scanner;  
/**
 * A Simple Program That Converts Java Float to Int.
 */
public class ConversionOfDatatype {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      //Float to integer conversion  
      System.out.println("Enter Float value:");
      float floatValue=sc.nextFloat();
      int intValue = (int) floatValue;
      System.out.println("The int value is: " + intValue);

      //Long to string conversion  
      System.out.println("Enter long value:");
      long longValue=sc.nextLong();
      String stringValue = String.valueOf(longValue);
      System.out.println("The string value is: " + stringValue);
   }
}