package rectangle1;
import utils1.UnitUtils;

public class MainRectangle {

	public static void main(String[] args) {
		
		
		Square sq1 = new Square(10, Units.Meter, "Black" );  //square
		
		
		
		//Rectangle r3 = new Rectangle(); //default
		

		System.out.println(UnitUtils.convertPerimeter(sq1.getLength(), sq1.getUnits(), Units.Centimeter));
		System.out.println(sq1);  //toString
		
		
		

	}
	

}
