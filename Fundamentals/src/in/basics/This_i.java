package in.basics;


class VechicleData{
	VechicleData(){
		System.out.println("Current value of this -->"+this);
	}
}
public class This_i {

	public static void main(String[] args) {
		VechicleData v = new VechicleData();
		System.out.println("Current vale of v :"+v);
		
		System.out.println("v2:._____________________________________");
		
		VechicleData v2 = new VechicleData();
		System.out.println("Current vale of v2 :"+v2);	
	}
}