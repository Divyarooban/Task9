package task9;

import java.util.Scanner;

public class reverseorderofstring {

	public static void main(String[] args) {
		 System.out.println("Enter the string");
		    Scanner sc= new Scanner(System.in);
		    String s = sc.next();
		    String rev = "";

		    for (int i = s.length()-1; i >=0; i--) {
		      rev=rev+s.charAt(i);
		    }
		    System.out.println(rev);
		  }
	}


