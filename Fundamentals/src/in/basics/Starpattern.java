package in.basics;

public class Starpattern {

	 public static void main(String[] args) {
	  int rows=5;
	  for (int i=1;i<rows;i++) {
	   for(int j=rows;j>i;j--) {
	    System.out.print("* ");
	   }
	   System.out.println();
	  }
	  
	  System.out.println("up-down right angle");
	 
	  ///////////inverted right angle 
	  
	  for (int i=1;i<rows;i++) {
	//   for(int j=rows;j>i;j--) {
//	    System.out.print(" ");
	//   }
	   for(int j=1;j<=i;j++) {
	    System.out.print("* ");

	   }
	   System.out.println();
	  }
	  System.out.println("right angle triangle");
	  //////////////////////////////////////////////////////
	  for (int i=1;i<rows;i++) {
	   for(int j=rows-1;j>i;j--) {
	    System.out.print("   ");
	   }
	   for(int j=1;j<=i;j++) {
	    System.out.print(" * ");

	   }
	   System.out.println();
	  }
	  System.out.println("inverted right angle triangle");
	  ////////////////////////////////////////////////////
	  for (int i=1;i<rows;i++) {
	   for(int j=1;j<=i;j++) {
	    System.out.print("  ");
	   }
	   for(int k=rows-1;k>=i;k--) {
	    System.out.print(" *");
	   }
	   
	   System.out.println();
	  }
	  
	  System.out.println("inverted up-down right angle");
	 }
	 
	}
