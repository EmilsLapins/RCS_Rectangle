package rectangle1;

public class Square extends Rectangle {


	
	public Square (int a, Units units, String color) {  //square
		// Var ari sadi!
		// super(a, a, units);
		setWidth(a);
		setLength(a);
		setUnits(units);
		setColor(color);
	}

	@Override
	public String toString() {
		return "Square [getColor()=" + getColor() + ", getUnits()=" + getUnits() + ", getLength()=" + getLength()
				+ ", isSquare()=" + isSquare() + ", area()=" + area() + ", perimeter()=" + perimeter() + "]";
	}
	
	
}
