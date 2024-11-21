package in.basics;

public class Shape {
	String name;
	Shape(String shapeName){
		name = shapeName;
	}
	Shape(Shape obj){
		name = obj.name;
	}
	public void getName(){
		System.out.println("Shape :"+name);
	}
	
	public static void main(String[] args) {
		Shape s1 = new Shape("Circle");
		s1.getName();
		
		Shape s2 = new Shape(s1);
		s2.getName();
		
		
	}

}
