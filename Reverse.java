import java.util.*;
public class Reverse {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		//getting input to reverse the number
		System.out.println("Enter the number to reverse :");
		int number = s.nextInt();
        int reversed = 0;
        // loop to find reversed number
        while(number != 0) {
            int digit = number % 10;
			reversed = reversed * 10 + digit;
			number /= 10;
			
        }

        System.out.println("Reversed Number: " + reversed);
    }
}