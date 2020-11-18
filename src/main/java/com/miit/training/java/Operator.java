package com.miit.training.java;

public class Operator {

	public static void main(String[] args) {
		int count = 5000;
		System.out.println(count++);
		System.out.println(count--);
		System.out.println(--count);
		System.out.println(++count);
		System.out.println(count * count);
		System.out.println(count + count);
		System.out.println(count - count);
		System.out.println(count / 1);
		System.out.println(count % count);
		System.out.println(count < 0 && count > 0);
		System.out.println(count > 0 & count < 0);
		System.out.println(count < 0 || count > 0);
		System.out.println(count > 0 | count < 0);
		int a = 2;
		int b = 5;
		int min = (a < b) ? a : b;
		System.out.println(min);
		short c = 10;
		short d = 10;
		c = (short) (c + d);// 20 which is int now converted to short
		System.out.println(a);
	}

}
