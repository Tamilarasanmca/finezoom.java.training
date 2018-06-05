import java.util.*;
public class WordToNumber
{
  
  public static void main(String[] args)
  {
   
    Scanner s = new Scanner(System.in);
    System.out.println("Enter word between one to ten in lowercase only: ");
    String word = s.nextLine();
    String number = "";
	String defaultMsg="";
     switch (word) 
        {
            case "one":  number = "1";
                     break;
            case "two":  number = "2";
                     break;
            case "three":  number = "3";
                     break;
            case "four":  number = "4";
                     break;
            case "five":  number = "5";
                     break;
            case "six":  number = "6";
                     break;
            case "seven":  number = "7";
                     break;
            case "eight":  number = "8";
                     break;
            case "nine":  number = "9";
                     break;
            case "ten": number = "10";
                     break;         
            default: number = "Enter only lower case words from one to ten";
                     break;
        }
        System.out.println(number);
		
        s.close();
  
  }
}