package com.tasks.kalai;
import java.util.Scanner;

public class ArithmeticOperationUtil {
	public static int sum(int a, int b) {
		return a+b; 
	}
	public static int sub(int a, int b) {
		return a-b; 
	}
	public static int mul(int a, int b) {
		return a*b; 
	}
	public static int mod(int a, int b) {
		return a%b; 
	}
	public static int div(int a, int b) {
		return a/b; 
	}
	public static class TestingClass{
	public static void main(String[] args) {
		ArithmeticOperationUtil operator = new ArithmeticOperationUtil();
		Scanner sc = new Scanner (System.in);
		int a=0, b=0;
		
		try {
		System.out.println("Enter First value:");   
		a = sc.nextInt();
		System.out.println("Enter Second value:");
		b = sc.nextInt();
		System.out.println("-------------ARITHMETIC OPERATIONS---------------");
		int sum =ArithmeticOperationUtil.sum(a, b);
		System.out.println("sum value is:" + sum);
		int sub =ArithmeticOperationUtil.sub(a, b);
		System.out.println("sub value is:"+ sub);
		int mul =ArithmeticOperationUtil.mul(a, b);
		System.out.println("multiplication value is:"+ mul);
		int mod =ArithmeticOperationUtil.mod(a, b);
		System.out.println("Modules value is:"+ mod);
		int div =ArithmeticOperationUtil.div(a, b);
		System.out.println("Division value is:"+ div);
		}
		catch(Exception e) {
			System.out.println("something went wrong");
			sc.nextLine();
		}
	}
	}
}
	

  
  
