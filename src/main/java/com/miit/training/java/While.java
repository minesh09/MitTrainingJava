package com.miit.training.java;

public class While {

	public static void main(String[] args) {
		int arr[] = { 2, 11, 45, 9 };
		int i = 0;
		
		while (i < arr.length) {
			System.out.println(arr[i]);
			i++;
		}
		int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);

	}

}
