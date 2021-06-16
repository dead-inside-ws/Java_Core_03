package ua.lviv.lgs;

public class Circle {
	
	private double radius;
	private double diameter;
	
	Circle(double radius, double diameter){
		this.radius=radius;
		this.diameter=diameter;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getDiameter() {
		return diameter;
	}
	
	public double square(double diameter) {
		double square = Math.PI*diameter*diameter/4;
		return square;
	}
	
	public double length(double radius) {
		double length=2*Math.PI*radius;
		return length;
	}

	@Override
	public String toString() {
		return "[radius=" + radius + ", diameter=" + diameter + "]";
	}
	
}
