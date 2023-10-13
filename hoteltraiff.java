package task9;

import java.util.Scanner;

public class hoteltraiff {

	public static void main(String[] args) {
		float tariff1;
		double tariff2;
		System.out.println("Enter the month ");
		Scanner sc= new Scanner(System.in);
		int month=sc.nextInt();
		int rent=sc.nextInt();
		int days=sc.nextInt();
		tariff1=rent*days;
		tariff2=(rent+(rent*0.2))*days;
			
		switch(month)
		{
		case 1: 
			System.out.println(tariff1);
			break;
		case 2: 
			System.out.println(tariff1);
			break;
		case 3: 
			System.out.println(tariff1);
			break;
		case 4: 
			System.out.println(tariff2);
			break;
		case 5: 
			System.out.println(tariff2);
			break;
		case 6: 
			System.out.println(tariff2);
			break;
		case 7:
			System.out.println(tariff1);
			break;
		case 8: 
			System.out.println(tariff1);
			break;
		case 9: 
			System.out.println(tariff1);
			break;
		case 10: 
			System.out.println(tariff1);
			break;
		case 11: 
			System.out.println(tariff2);
			break;
		case 12: 
			System.out.println(tariff2);
			break;
		
		}

	}

}
