package com.miit.training.java;

public class ForLoop {

	public static void main(String[] args) {
		int n = 10;
		int sum = 0;
		String sumof = "";
		String days[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
			if (i == 1) {
				sumof = String.valueOf(i);
			} else {
				sumof = sumof + "+" + i;
			}
		}
		System.out.println(sumof + " :- " + sum);
		
		for(String str: days)
		{
			System.out.println(str);
		}
	}

}
