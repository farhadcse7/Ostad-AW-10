package shape;

public class Square extends Shape{
	 private double side;

	    public Square(double side) {
	        this.side = side;
	    }

	    @Override
	    void draw() {
	        System.out.println("Drawing Square");
	    }

	    @Override
	    double calculateArea() {
	        return side * side;
	    }
}
