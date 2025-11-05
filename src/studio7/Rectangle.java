public class Rectangle {
    private double length;
    private double width;
    private double area = length * width;
    private double perimeter;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double RectangleArea() {
        return width * length;
    }

    public double RectanglePerimeter() {
        return 2 * length + 2 * width;
    }

    public boolean Square() {
        if (length == width) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(4, 4);

        System.out.println(r1.RectangleArea());
        System.out.println(r2.RectangleArea());

        System.out.println(r1.RectanglePerimeter());
        System.out.println(r2.RectanglePerimeter());

        System.out.println(r1.Square());
        System.out.println(r2.Square());

    }
}
