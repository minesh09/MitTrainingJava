package com.miit.training.java;

public class Switch {

	public static void main(String[] args) {
		int day = 4;
		String Days;
		switch (day) {
		case 1:
			Days = "Monday";
			break;
		case 2:
			Days = "Tuesday";
			break;
		case 3:
			Days = "Wednesday";
			break;
		case 4:
			Days = "Thursday";
			break;
		case 5:
			Days = "Friday";
			break;
		case 6:
			Days = "Saturday";
			break;
		case 7:
			Days = "Sunday";
			break;
		default:
			Days = "Not a Valid Day";
		}
		System.out.println("Today is " + Days);
	}

}
