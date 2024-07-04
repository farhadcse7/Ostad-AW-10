package shape;

public class Triangle extends Shape{
	private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}
