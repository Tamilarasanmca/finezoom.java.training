import java.util.*;
public class NumberToWord
{
  
  public static void main(String[] args)
  {
   
    Scanner s = new Scanner(System.in);
    System.out.println("Enter an integer number between 1 to 10: ");
    int number = s.nextInt();
    String word;
     switch (number) 
        {
            case 1:  word = "One";
                     break;
            case 2:  word = "Two";
                     break;
            case 3:  word = "Three";
                     break;
            case 4:  word = "Four";
                     break;
            case 5:  word = "Five";
                     break;
            case 6:  word = "Six";
                     break;
            case 7:  word = "Seven";
                     break;
            case 8:  word = "Eight";
                     break;
            case 9:  word = "Nine";
                     break;
            case 10:  word = "Ten";
                     break;         
            default: word = "Number is out of range";
                     break;
        }
        System.out.println(word);
        s.close();
  
  }
}