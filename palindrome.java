package task9;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		 Scanner obj = new Scanner(System.in);
	        String str = obj.nextLine();
	        String reversedString = "";  
			
	        for(int i=0; i<str.length(); i++)
	        {
	            reversedString = str.charAt(i) + reversedString;
	        }
	      
	        if(str.equals(reversedString))
	        {
	            System.out.println(str+" is Palindrome");
	        }
	        else
	        {
	            System.out.println(str+" is Not a Palindrome");
	        }
	    }

	}


