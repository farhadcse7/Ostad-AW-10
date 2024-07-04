package shape;

public class Main {
	public static void main(String[] args) {
        Circle circle = new Circle(10);
        Square square = new Square(5);
        Triangle triangle = new Triangle(3, 6);

        circle.draw();
        System.out.println("Area of Circle: " + circle.calculateArea());

        square.draw();
        System.out.println("Area of Square: " + square.calculateArea());

        triangle.draw();
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }

}
