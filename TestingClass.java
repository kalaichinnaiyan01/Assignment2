package com.tasks.kalai;

import java.util.Scanner;

public class TestingClass {
	public static void main(String[] args) {
		try {
		Scanner user=new Scanner(System.in);
		int x, y;
		System.out.println("Enter X value:");
		x = user.nextInt();
		System.out.println("Enter y value:");
		y = user.nextInt();
		ArithmeticOperationUtil.alloperators(x, y);
		}
		catch(Exception e) {
			System.out.println("something went wrong");
		}
	}

}
