package in.basics;

class Transport{
	String typeOfTransport;
	int speed;
	
	Transport(String typeOfTransport,int speed){
		this.typeOfTransport = typeOfTransport;
		this.speed = speed;
	}
	
	
	public void getType() {
		System.out.println(this.typeOfTransport);
		this.getSpeed();
	}
	
	public void getSpeed() {
		System.out.println("speed"+this.speed);
	}
}



public class Class_IV {

	public static void main(String[] args) {
		
		Transport car = new Transport("car",120);
		Transport train = new Transport("train",120);
		Transport flight = new Transport("flight",120);
		
		
		train.getType();
		car.getType();
		flight.getType();
		
			
		

	}

}
