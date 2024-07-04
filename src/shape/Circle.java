package shape;

public class Circle extends Shape{
	private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}