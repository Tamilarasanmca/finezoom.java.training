import java.util.Scanner;
 
public class FindingNthPrime {
 
  public static void main(String[] args) {
 
    Scanner scan = new Scanner(System.in);
 
    System.out.print("Enter number to find the nth prime number: ");
 
    int nth = scan.nextInt();
 
    int num, count, i;
    num=1;
    count=0;
 
    while (count < nth){
      num=num+1;
      for (i = 2; i <= num; i++){
        if (num % i == 0) {
          break;
        }
      }
      if ( i == num){
        count = count+1;
      }
    }
    System.out.println("Value of nth prime: " + num);
  }
}