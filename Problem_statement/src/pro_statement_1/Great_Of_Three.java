package pro_statement_1;

public class Great_Of_Three {

	public int G_O_T(int a,int b,int c){
			

			System.out.println("The greates number is :");
			if (a>b && a>c) {
				return a;
			}
			else if(b>a && b>c) {
				return b;
			}
			else {
				return c;
			}
		}
		
	public static void main(String[] args) {
		
		Great_Of_Three obj = new Great_Of_Three();
		System.out.println(obj.G_O_T(5, 7, 9));
		

	}

}
