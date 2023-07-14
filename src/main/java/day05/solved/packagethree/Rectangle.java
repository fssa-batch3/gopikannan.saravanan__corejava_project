package day05.solved.packagethree;

public class Rectangle implements Polygon {

	@Override
	public double area(double a, double b) {
		System.out.println("Calculating Rectangle area");
		return a * b;
	}

}