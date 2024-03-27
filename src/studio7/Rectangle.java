package studio7;

public class Rectangle {

	private double length;
	private double width;
	
	
	public Rectangle(double initLength, double initWidth) {
		
		length = initLength;
		width = initWidth;
		
	}
	
	public void info()
	
	{
		boolean square = false;
		double area = length * width;
		double perimeter = 2 * (length + width);
		if(length == width) {
			square = true;
		}
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Square?: "+ square);
			
	}
	

	
	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle(20, 10);
		Rectangle rect2 = new Rectangle(10, 10);
		
		rect1.info();
		rect2.info();
		
		
	}
	
	
	
}
