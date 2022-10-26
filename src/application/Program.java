package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.enums.Color;
import model.services.Shape;

public class Program {
    public static void main(String[] args) {

        AbstractShape shape1 = new Circle(Color.BLACK, 2.0);
        AbstractShape shape2 = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println(shape1.getColor());
        System.out.println(shape1.area());
        System.out.println(shape2.getColor());
        System.out.println(shape2.area());
    }
}
