package u_3_ex_1;

public class FigureUtil {
    private FigureUtil() {

    }

    public static double area(Figure figure){
        return figure.area();
    }

    public static double perimeter(Figure figure) {
        return figure.perimeter();
    }

    public static void draw(Figure figure) {
        if(figure instanceof Drawable){
            Drawable drawable_figure = (Drawable) figure;
            drawable_figure.draw();
        }
    }

    public static void draw(Figure figure, Color color) {
        if(figure instanceof Drawable) {
            Drawable drawable_figure = (Drawable) figure;
            drawable_figure.draw(color);
        }
    }
}