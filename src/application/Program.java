package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Shape shape1 = new Circle(Color.BLACK, 2.0);
        Shape shape2 = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println(shape1.getColor());
        System.out.println(shape1.area());
        System.out.println(shape2.getColor());
        System.out.println(shape2.area());
    }
}
