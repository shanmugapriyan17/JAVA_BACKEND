package pro_statement_1;

public class Greatest_Two_Num {
	
	public int G_T_N(int x,int y) {
		if (x>y){
			System.out.println("the greates number among "+ x +","+ y +" is : ");
			return x;
			
		}else {
			System.out.println("the greates number among "+ x +","+ y +" is : ");
			return y;
			
			
			
		}
		
	}

	public static void main(String[] args) {
		Greatest_Two_Num obj4=new Greatest_Two_Num();
		System.out.println(obj4.G_T_N(4, 5));
		

	}

}
