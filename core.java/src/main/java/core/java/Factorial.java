package core.java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int fact=1,n;
		  
		  Scanner sc=new Scanner(System.in);
		  System.out.print("n:");
		  n=sc.nextInt();
		  while(n!=0)
		  {
		  fact=fact*n;
		  n--;
		  
		  }
		  System.out.print(fact);
		  
		  
		  

	}

}
