package task9;

import java.util.Scanner;

public class printnumberpattern {

	public static void main(String[] args) {
		
		 System.out.println("Enter the no of row");
		    Scanner sc= new Scanner(System.in);
		   int row=sc.nextInt();
		 int i, j, k = 1;
      for (i = 1; i <= row; i++) {
          for (j = 1; j< i + 1; j++) {
              System.out.print(k++ + " ");
          }
          System.out.println();
      }
		}
		}

