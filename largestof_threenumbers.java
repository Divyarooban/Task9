package task9;

import java.util.Scanner;

public class largestof_threenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the three numbers ");
		Scanner sc= new Scanner(System.in);
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int a3=sc.nextInt();
		
		if(a1>a2 && a1>a3)
		{
			System.out.println("The largest of three numbers is "+a1);
		}
		else if(a2>a3)
			{
				System.out.println("The largest of three numbers is "+a2);
				
			}
		else
			System.out.println("The largest of three numbers is "+a3);
		
	}
	

}
