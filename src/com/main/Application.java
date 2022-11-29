package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
				

		  Scanner in = new Scanner(System.in);
		   int n = in .nextInt();
		   
		   //String s=???; Complete this line below
		String s = String.valueOf(n);
		   //Write your code here

		   
		   if (n == Integer.parseInt(s)) {
		    System.out.println("Good job");
		   } else {
		    System.out.println("Wrong answer.");
		   }
		   in.close();
		  
	}
}	
	
