package u_3_ex_1;

public class Square extends Figure{
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
}