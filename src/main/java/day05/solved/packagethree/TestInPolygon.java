package day05.solved.packagethree;

public class TestInPolygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polygon p = new Rectangle();
		double area = p.area(5, 6);
		System.out.println("Calculated Area: " + area);

		p = new RightAngleTriangle();

		area = p.area(5, 6);

		System.out.println("Newly calculated Area: " + area);

	}

}
