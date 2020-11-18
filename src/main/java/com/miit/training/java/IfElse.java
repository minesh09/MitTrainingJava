package com.miit.training.java;

public class IfElse {

	public static void main(String args[]) {
		String language = "Java";
		  if (language == "Java") {
		      System.out.println("Best Programming Language");
		    }
		  else
		  {
			  System.out.println("Programming Language");
		  }
		  int a = 5;
		  int b= 6;
		  int c = 4;
		  
		  if (a>b)
		  {
			  if (a>c)
			  {
				  System.out.println("Greater Value " + a);
			  }
			  else
			  {
				  System.out.println("Greater Value" + c);
			  }
		  }
		  else if (b>c)
		  {
			  System.out.println("Greater Value " + b);
		  }
		  else
		  {
			  System.out.println("Greater Value" + c);
		  }
				  
		
	}
}
