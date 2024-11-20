package pro_statement_1;

public class Leap_year {
	
	public String L_Y(int year) {
		 System.out.println("the year "+year+ " is a");
		 if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
	        return "leap Year";
	     } 
		 else {
	        return "not a leap year";
	     }

		
	}
	

	public static void main(String[] args) {
		Leap_year obj = new Leap_year();
		System.out.println(obj.L_Y(2008));
		
		

	}

}
