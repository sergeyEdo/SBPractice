package u_3_ex_1;

public class Rectangle extends Figure{
    public double sideA;
    public double sideB;

    public Rectangle(Point point, double sideA, double sideB) {
        super(point);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return this.sideA * this.sideB;
    }

    @Override
    public double perimeter() {
        return 2d* this.sideA + 2d * this.sideB;
    }
}