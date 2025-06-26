package u_2_ex_2;

public class ex_2 {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "red");
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        System.out.println(circle.toString());
    }

    public static class Circle {
        double radius;
        String color;

        public Circle(double radius, String color) {
            this.radius = radius;
            this.color = color;
        }

        public double area() {
            return 3.14d * this.radius * this.radius;
        }

        public double perimeter() {
            return 2d * 3.14d * this.radius;
        }

        public String toString() {
            return this.radius + " " + this.color + " " + this.area() + " " + this.perimeter();
        }
    }
}
