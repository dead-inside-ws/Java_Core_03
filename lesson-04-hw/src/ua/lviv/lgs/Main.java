package ua.lviv.lgs;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Rectangle");
		System.out.println();
		
		Rectangle a1 = new Rectangle();

		
		Rectangle a2 = new Rectangle(800, 1200);
		
		System.out.println("����������� 1 = "+a1);
		System.out.println("����������� 2 = "+a2);
		System.out.println();
		System.out.println("����� ������������ 1 = " + a1.square(a1.getWidth(),a1.getHeight()));
		System.out.println("����� ������������ 2 = " + a2.square(a2.getWidth(),a2.getHeight()));
		System.out.println();
		System.out.println("�������� ������������ 1 = "+a1.perimeter(a1.getWidth(),a1.getHeight()));
		System.out.println("�������� ������������ 2 = "+a2.perimeter(a2.getWidth(),a2.getHeight()));
		System.out.println();
		System.out.println("Circle");
		System.out.println();
		Circle b = new Circle(20,40);
		System.out.println("���� = "+b);
		System.out.println("����� ���� = "+b.square(b.getDiameter()));
		System.out.println("������� ���� = "+b.length(b.getRadius()));
	}
	

}
