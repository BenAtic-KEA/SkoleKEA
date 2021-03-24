package inherritanceGeometrical;

import java.util.ArrayList;

public class Geometri {
    public static void main(String[] args) {

        GeometricalFigure square1 = new Square("Red",4,5,4);
        GeometricalFigure triangle1 = new RetVinkletTriangle("Blue",3,4,2);
        GeometricalFigure circle1 = new Circle("Pink",0,5);

        ArrayList<GeometricalFigure> figureList = new ArrayList<>();

        figureList.add(square1);
        figureList.add(triangle1);
        figureList.add(circle1);

        for(GeometricalFigure figure : figureList){

            System.out.println(figure);
            System.out.println("Area: " + figure.calculateArea());
            System.out.println("Perimeter " + figure.calculatePerimeter());

        }
    }
}
