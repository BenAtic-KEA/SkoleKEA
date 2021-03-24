package inherritanceGeometrical;

public class RetVinkletTriangle extends GeometricalFigure {

    double height;
    double width;


    public RetVinkletTriangle(String color, int numberOfAngles, double height, double width) {

        super(color, numberOfAngles);
        this.height = height;
        this.width = width;


    }

    @Override
    public double calculateArea() {

        return (height * width) / 2;

    }

    @Override

    public double calculatePerimeter() {

        double c = Math.sqrt(Math.pow(height, 2) * Math.pow(width, 2));

        return height + width + c;
    }

    @Override
    public String toString() {
        return "Triangle " +
                "color: " + super.getColor();
    }
}
