package in.basics;

import java.util.Scanner;

public class iff_1 {
	
	
	public static void CD(int a) {
	  int cost = a*100;
	  int discount = cost/10;
	  int main = cost - discount;
	  if(cost<1000){
		  System.out.println("amount"+cost);
		  
	  }else{
		  System.out.println("discount amount"+main);
		  
	  }
	  
	}

	public static void main(String[] args) {
		Scanner CD = new Scanner(System.in);
		int a = CD.nextInt();
		iff_1.CD(a);
	}

}
