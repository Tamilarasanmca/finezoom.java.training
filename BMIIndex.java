import java.util.Scanner;

// BMI Calculation

public class BMIIndex {

    public static void main(String[] args){
      
        System.out.print("Please enter your weight in kg: ");
        Scanner s = new Scanner(System.in);
        float weight = s.nextFloat();
        System.out.print("Please enter your height in cm: ");
        float height = s.nextFloat();
        
        // BMI calculation using formula
        float bmi = weight/((height/100)*(height/100));
        
        System.out.println("Your BMI is: "+bmi);
       
	   //Status of BMI
	   if(bmi < 18.5) {
            System.out.println("You are underweight");
        }else if (bmi < 25) {
            System.out.println("You are normal");
        }else if (bmi < 30) {
            System.out.println("You are overweight");
        }else {
            System.out.println("You are obese");
        }
        
    }
    
   
}