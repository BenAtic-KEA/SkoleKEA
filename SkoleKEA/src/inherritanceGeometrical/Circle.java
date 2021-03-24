package inherritanceGeometrical;

public class Circle extends GeometricalFigure {

    private double diameter;

    public Circle(String color, int numberOfAngles, double diameter) {

        super(color, numberOfAngles);
        this.diameter = diameter;


    }

    @Override
    public double calculateArea() {

        return Math.PI * Math.pow(diameter / 2, 2);

    }

    @Override

    public double calculatePerimeter() {

        return 2 * Math.PI * diameter;
    }

    @Override
    public String toString() {
        return "Circle " +
                "color: " + super.getColor();

    }
}
