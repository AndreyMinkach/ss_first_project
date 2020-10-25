import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Circle extends BufferedReader {
    private double radius;

    public Circle() {
        this(12);
    }

    public Circle(double radius) {
        super(new InputStreamReader(System.in));
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius() throws IOException {
        System.out.println("Enter circle radius ");
        this.radius = Double.parseDouble(super.readLine());
    }

    public double getCircleArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public double getCirclePerimeter() {
        return 2 * this.radius * Math.PI;
    }

    public void showCirclePerimeterAndArea() throws IOException {
        System.out.printf("Circle perimeter = %.2f\n", getCirclePerimeter());
        System.out.printf("Circle area = %.2f\n", getCircleArea());
    }
}