package entities;

public class Rectangle {
	
	public double width;
	public double heigth;
	
	public double area() {
		return width * heigth;
	};
	
	public double perimeter() {
		return width * 2.0 + heigth * 2.0;
	}
	
	public double diagonal() {
		return Math.sqrt((width * width) + (heigth * heigth));
	}
	

}
