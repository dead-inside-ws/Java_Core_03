package ua.lviv.lgs;

public class Rectangle {

	private int width;
	private int height;
	
	Rectangle(){
		this.width=600;
		this.height=450;
	}
	Rectangle(int width,int height){
		this.width=width;
		this.height=height;
	}
	
	public int square(int width, int height) {
		int square = width*height;
		return square;
	}
	public int perimeter(int width, int height) {
		int perimeter = 2*(width+height);
		return perimeter;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "[width=" + width + ", height=" + height + "]";
	}
	
}
