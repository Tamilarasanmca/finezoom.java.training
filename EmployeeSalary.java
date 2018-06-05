import java.util.Scanner;  
/**
 * salary calculations of employees 
 */
 public class EmployeeSalary{  
 public static void main(String args[]){  
   Scanner sc=new Scanner(System.in);  
    
   
  //Input of Salary details
 
   System.out.println("Enter Tamil's Salary");  
   double tamilSalary=sc.nextDouble();
   
   
   System.out.println("Enter Arasan's Salary");  
   double arasanSalary=sc.nextDouble();
   
   
   System.out.println("Enter Krishna's Salary");  
   double krishnaSalary=sc.nextDouble();
   
   
   System.out.println("Enter Kumar's Salary");  
   double kumarSalary=sc.nextDouble();
   
   double totalSalary= tamilSalary + arasanSalary + krishnaSalary + kumarSalary;
   
   
   //Sum of salary
    
   System.out.println(" Sum of salary :"+totalSalary); 
   
   //Average salary
   System.out.println(" Average salary :"+totalSalary/4); 
   
  
   //To find maximum salary
     
   if(tamilSalary > arasanSalary && tamilSalary > krishnaSalary && tamilSalary > kumarSalary){
   System.out.println("Tamil has maximum salary:"+tamilSalary);
   }
    
   if(arasanSalary > tamilSalary && arasanSalary > krishnaSalary && arasanSalary > kumarSalary){
   System.out.println("Arasan has maximum salary:"+arasanSalary);
   }
   
   if(krishnaSalary > tamilSalary && krishnaSalary > arasanSalary && krishnaSalary > kumarSalary){
   System.out.println("Krishna has maximum salary:"+krishnaSalary);
   }

   if(kumarSalary > tamilSalary && kumarSalary > arasanSalary && kumarSalary > krishnaSalary){
   System.out.println("Kumar has maximum salary:"+kumarSalary);
   }

   
   //To find minimum salary
    
   if(tamilSalary < arasanSalary && tamilSalary < krishnaSalary && tamilSalary < kumarSalary){
   System.out.println("Tamil has minimum salary:"+tamilSalary);
   }
    
   if(arasanSalary < tamilSalary && arasanSalary < krishnaSalary && arasanSalary < kumarSalary){
   System.out.println("Arasan has minimum salary:"+arasanSalary);
   }
   
   if(krishnaSalary < tamilSalary && krishnaSalary < arasanSalary && krishnaSalary < kumarSalary){
   System.out.println("Krishna has minimum salary:"+krishnaSalary);
   }

   if(kumarSalary < tamilSalary && kumarSalary < arasanSalary && kumarSalary < krishnaSalary){
   System.out.println("Kumar has minimum salary:"+kumarSalary);
   }
   
   //Ascending order
   double tempAsc;

	for (int count = 0; count < 4; count++)
	{
		if ( arasanSalary < tamilSalary)
		{
		   tempAsc = tamilSalary;
		   tamilSalary = arasanSalary;
		   arasanSalary = tempAsc;
		}

		if ( krishnaSalary < arasanSalary)
		{
		   tempAsc = arasanSalary;
		   arasanSalary = krishnaSalary;
		   krishnaSalary = tempAsc;
		}

		if ( kumarSalary < krishnaSalary)
		{
		   tempAsc = krishnaSalary;
		   krishnaSalary = kumarSalary;
		   kumarSalary = tempAsc;
		}

		
	}

	System.out.println("Ascending Order:"+tamilSalary + " " + arasanSalary + " " + krishnaSalary + " " + kumarSalary);
	
	//Descending order
   double tempDesc;

	for (int count = 0; count < 4; count++)
	{
		if ( arasanSalary > tamilSalary)
		{
		   tempDesc = tamilSalary;
		   tamilSalary = arasanSalary;
		   arasanSalary = tempDesc;
		}

		if ( krishnaSalary > arasanSalary)
		{
		   tempDesc = arasanSalary;
		   arasanSalary = krishnaSalary;
		   krishnaSalary = tempDesc;
		}

		if ( kumarSalary > krishnaSalary)
		{
		   tempDesc = krishnaSalary;
		   krishnaSalary = kumarSalary;
		   kumarSalary = tempDesc;
		}

		
	}
	
	
	System.out.println( "Descending Order:"+tamilSalary + " " + arasanSalary + " " + krishnaSalary + " " + kumarSalary);
	
	
	//To find Nth maximum salaray
	System.out.println( "Enter the number to find nth minimum salary:");
	int minSal=sc.nextInt();
	
	  switch (minSal) 
        {
            case 1:  System.out.println(kumarSalary);
                     break;
            case 2:  System.out.println(krishnaSalary);
                     break;
            case 3:  System.out.println(arasanSalary);
                     break;
            case 4:  System.out.println(tamilSalary);
                     break;
            
            default: System.out.println("No Values");
                     break;
        }
        
	
	
	//To find Nth minimum salaray
	System.out.println( "Enter the number to find nth maximum salary:");
	int maxSal=sc.nextInt();
	  switch (maxSal) 
        {
            case 1:  System.out.println(tamilSalary);
                     break;
            case 2:  System.out.println(arasanSalary);
                     break;
            case 3:  System.out.println(krishnaSalary);
                     break;
            case 4:  System.out.println(kumarSalary);
                     break;
            
            default: System.out.println("No Values");
                     break;
        }
        
	//Increment Employee salary
	System.out.println( "Enter increment percentage:");
	double percentage=sc.nextDouble();
	
	double incrementPercentage= percentage/100;
	double tamilPercentage= tamilSalary*incrementPercentage;
	double arasanPercentage= arasanSalary*incrementPercentage;
	double krishnaPercentage= krishnaSalary*incrementPercentage;
	double kumarPercentage= kumarSalary*incrementPercentage;
	
	System.out.println( "Tamil's salary after increment:"+(tamilSalary+tamilPercentage));
	System.out.println( "Arasan's salary after increment:"+ (arasanSalary+arasanPercentage));
	System.out.println( "Krishna's salary after increment:"+(krishnaSalary+krishnaPercentage));
	System.out.println( "Kumar's salary after increment:"+(kumarSalary+kumarPercentage));
	
	//Decrement Employee salary
	System.out.println( "Enter decrement percentage:");
	double decpercentage=sc.nextDouble();
	
	double decrementPercentage= percentage/100;
	double tamildecPercentage= tamilSalary*decrementPercentage;
	double arasandecPercentage= arasanSalary*decrementPercentage;
	double krishnadecPercentage= krishnaSalary*decrementPercentage;
	double kumardecPercentage= kumarSalary*decrementPercentage;
	
	System.out.println( "Tamil's salary after decrement:"+(tamilSalary-tamildecPercentage));
	System.out.println( "Arasan's salary after decrement:"+ (arasanSalary-arasandecPercentage));
	System.out.println( "Krishna's salary after decrement:"+(krishnaSalary-krishnadecPercentage));
	System.out.println( "Kumar's salary after decrement:"+(kumarSalary-kumardecPercentage));
	
	//Descending order
	
   
      
   sc.close();  
 }  
}   