package src;

import java.util.Scanner;

public class Test_4 {
	
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void sub(int a,int b) {
		System.out.println(a-b);
		
	}
	public static void mult(int a,int b) {
		System.out.println(a*b);
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.ADD 2.SUB 3.MULT");
		System.out.println("Select any option");
		int option = sc.nextInt();
		switch(option) {
		case 1:add(12,13);
		break;
		case 2:sub(12,9);
		break;
		case 3:mult(2,5);
		break;
		default:System.out.println("INVALID OPTION");
		}
		

	}

}
