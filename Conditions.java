package conditions;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		//Program to implement If-Else Statement.
	
		int num;
		System.out.println("Enter a number:");
		Scanner s = new Scanner(System.in);
		num= s.nextInt();
		if(num%2==0)
			System.out.println("Entered no. Is Even!!");
		else 
			System.out.println("Entered no. Is Odd!!");
	
			
        //Program to implement Switch case Statement.
		
		int choice,a,b;
		System.out.println("Mini Calculator:\n 1.Addition\n 2.Subraction\n 3.Multiplication\n 4.Division\n Enter Your Choice:");
		choice = s.nextInt();
		System.out.println("Enter 2 numbers:");
		a=s.nextInt();
		b=s.nextInt();
		switch(choice) {
		    case 1: int sum= a+b;
		            System.out.println("Sum= "+sum);
		            break;
		    case 2: int sub=a-b;
		            System.out.println("Difference="+sub);
		            break;
		    case 3: int mul=a*b;
		            System.out.println("Product="+mul);
		            break;
		    case 4: if(b==0) {
		    	      System.out.println("Divide by Zero error!");
		              break;}
		            else {
		    	       float div= (float)a/b;
		               System.out.println("Division="+div);
		               break;}
		    default: System.out.println("Invalid Choice");
		            
		}
		
	}

}
