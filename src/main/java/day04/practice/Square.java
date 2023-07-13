package day04.practice;

public class Square extends Rectangle {

	public Square() {	
	}
	
	public Square(int side) {
		super(side, side);
	}
	
	 public static void main(String[] args) {
	        Square square = new Square(3);
	        int area = square.Area();
	        int length = square.getLength();
	        System.out.println( "The get length is called from parent which is "+length );
	        System.out.println( "The area of the square is calculated is "+area);
	    }

}
