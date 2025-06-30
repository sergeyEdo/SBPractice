package u_3_ex_1;

public class Square extends Figure implements Drawable{
    public double side;

    public Square(Point point, double side){
        super(point);
        this.side = side;
    }

    @Override
    public double area() {
        return this.side * this.side;
    }

    @Override
    public double perimeter() {
        return 4d * this.side;
    }

    @Override
    public void draw() {
        System.out.println("Нарисован КВАДРАТ с кординатами (" + this.point.x + ", " + this.point.y + ")");
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован КВАДРАТ с кординатами (" + this.point.x + ", " + this.point.y + ") и цветом  " + color);
    }
}