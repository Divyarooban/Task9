package task9;

import java.util.Scanner;

public class gradingsystem {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the student portal");
		System.out.println("Enter the marks ");
		Scanner sc= new Scanner(System.in);
		int mk=sc.nextInt();

		if(mk>=0)
		{
			if(mk>100) {
			System.out.println("Invalid Input");
			}
			else if(mk>=100)
			{
				System.out.println("The Grade is S");
			}
			else if((mk>=90) && (mk<=99))
			{
				System.out.println("The Grade is A");
			}
			else if((mk>=80) && (mk<=89))
			{
				System.out.println("The Grade is B");
			}
			else if((mk>=70) && (mk<=79))
			{
				System.out.println("The Grade is C");
			}
			else if((mk>=60) && (mk<=69))
			{
				System.out.println("The Grade is D");
			}
			else if((mk>=50) && (mk<=59))
			{
				System.out.println("The Grade is E");
			}
			else if(mk<50)
			{
				System.out.println("The Grade is F");
			}
			}
			else 
			{
				System.out.println("Negative number is not valid");
			}
		
				
}
}