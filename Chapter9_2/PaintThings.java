package Chapter9_2;

import java.text.DecimalFormat;

public class PaintThings {
	
	public static double PShape(Shape s, Paint p) {
		return p.amount(s);
	}
	
	public static void main(String[] args) {
		final double COVERAGE = 350;
		Paint paint = new Paint(COVERAGE);
		
		Rectangle deck;
		Sphere bigBall;
		Cylinder tank;
		
		double deckAmt,ballAmt, tankAmt;
		
		//instantiate the three shapes to paint
		deck = new Rectangle(20, 35);
		bigBall = new Sphere(15);
		tank = new Cylinder(10, 30);
		
		//Compute the amount to paint needed for each shape
		deckAmt = PShape(deck, paint);
		ballAmt = PShape(bigBall, paint);
		tankAmt = PShape(tank, paint);
			
//		deckAmt = paint.amount(deck);
//		ballAmt = paint.amount(bigBall);
//		tankAmt = paint.amount(tank);
		
		//Print the amount of paint needed for each shape
		DecimalFormat fmt = new DecimalFormat("0.#");
		System.out.println("\nNumber of gallons of paint needed...");
		System.out.println("Deck " + fmt.format(deckAmt));
		System.out.println("Big Ball " + fmt.format(ballAmt));
		System.out.println("Tank " + fmt.format(tankAmt));
	}
}
