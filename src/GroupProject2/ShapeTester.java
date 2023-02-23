package GroupProject2;

public class ShapeTester {
    public static void main(String[] args) {
        Circle circle=new Circle(4);
        circle.calculateArea();
        circle.calculatePerimiter();

        Square square=new Square(5);
        square.calculateArea();
        square.calculatePerimiter();

    }
}
