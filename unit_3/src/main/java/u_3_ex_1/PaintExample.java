package u_3_ex_1;

public class PaintExample {
    public static void main(String[] args) {
        Figure[] listOfFigures = {
                new Circle(new Point(5, 5), 5d),
                new Rectangle(new Point(3, 4), 5d, 10d),
                new Square(new Point(1,1), 6d),
                new Triangle(new Point(0,1), 7d, 8d, 9d)
        };

        for(Figure figure : listOfFigures){
            FigureUtil.draw(figure);
            FigureUtil.draw(figure, Color.RED);
            System.out.println("Площадь фигуры равна = " + FigureUtil.area(figure));
            System.out.println("Периметер фигуры равен = " + FigureUtil.perimeter(figure));
        }
    }
}
