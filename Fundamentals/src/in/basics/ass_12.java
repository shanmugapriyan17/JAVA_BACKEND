package in.basics;

import java.util.Scanner;

public class ass_12 {
	 public static void div(int a) {
		 for(int i=2;i<a;i++){
			 if(a == 0){
				 System.out.println("i");
				 
				 
			 }else {
				 System.out.println("s");
				 
			 }
		 }
	 }
	 public static void main(String[] args) {
		 Scanner DB = new Scanner(System.in);
		 int a = DB.nextInt();	
		 ass_12.div(a);
	 }

}
