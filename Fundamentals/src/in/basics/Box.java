package in.basics;


class Box{
	int lenght;
	int breadth;
	
	Box(int lenght,int breadth){
		this.lenght = lenght;
		this.breadth = breadth;
	}
	
	public void getDimension() {
		System.out.println(this.lenght*this.breadth);
	}


	public static void main(String[] args) {
		
		Box s1 = new Box(10,12);
		s1.getDimension();
		
		Box s2 = new Box(12,12);
		s2.getDimension();

	}

	}
