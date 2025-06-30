package u_3_ex_1;

public class Triangle extends Figure implements Drawable {
    public double sideA;
    public double sideB;
    public double sideC;

    public Triangle(Point point, double sideA, double sideB, double sideC) {
        super(point);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        double halfPerimeter = this.perimeter() / 2d;
        return Math.sqrt(
                halfPerimeter * (halfPerimeter - this.sideA) * (halfPerimeter - this.sideB) * (halfPerimeter - this.sideC)
        );
    }

    @Override
    public double perimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    @Override
    public void draw() {
        System.out.println("Нарисован ТРЕУГОЛЬНИК с кординатами (" + this.point.x + ", " + this.point.y + ")");
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован ТРЕУГОЛЬНИК с кординатами (" + this.point.x + ", " + this.point.y + ") и цветом  " + color);
    }
}
