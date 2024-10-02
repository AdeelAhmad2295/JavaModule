package Assingment1Oct;

import java.util.Scanner;

public class Shape {

    public void printArea(double side) {
        double area = side * side;
        System.out.println("Area of the square: " + area);
    }

    public void printArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of the rectangle: " + area);
    }

    public void printPerimeter(double side) {
        double perimeter = 4 * side;
        System.out.println("Perimeter of the square: " + perimeter);
    }

    public void printPerimeter(double length, double breadth) {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = new Shape();

        System.out.print("Enter the side of the square: ");
        double side = scanner.nextDouble();
        shape.printArea(side);
        shape.printPerimeter(side);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
        shape.printArea(length, breadth);
        shape.printPerimeter(length, breadth);

        scanner.close();
    }
}

