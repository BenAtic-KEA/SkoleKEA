package inherritanceGeometrical;

public abstract class GeometricalFigure {


    private String color;
    private int numberOfAngles;


    public GeometricalFigure(String color, int numberOfAngles){

        this.color = color;
        this.numberOfAngles = numberOfAngles;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public String getColor() {
        return color;
    }
}
