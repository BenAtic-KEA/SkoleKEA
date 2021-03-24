package inherritanceGeometrical;

public class Square extends GeometricalFigure {

    double height;
    double width;

    public Square(String color, int numberOfAngles, double height, double width) {

        super(color, numberOfAngles);
        this.height = height;
        this.width = width;


    }

    @Override
    public double calculateArea() {

        return (height * width);

    }

    @Override

    public double calculatePerimeter() {

        return height * 2 + width * 2;
    }

    @Override
    public String toString() {
        return "Square " +
                "color: " + super.getColor();
    }
}
