package code.preactic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaAll {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("--------Select operation you want to perform---------");
            System.out.println("1. Area of Circle");
            System.out.println("2. Area of Triangle");
            System.out.println("3. Area of Rectangle");
            System.out.println("4. Area of Isosceles Triangle");
            System.out.println("5. Area of Parallelogram");
            System.out.println("6. Area of Rhombus");
            System.out.println("7. Area of Equilateral Triangle");
            System.out.println("0. Exit");

            System.out.print("Enter a number from 1 to 7 (or 0 to exit): ");
            int key = getValidIntInput();

            if (key == 0) {
                System.out.println("Exiting the program.");
                break;
            }

            switch (key) {
                case 1: circleArea(); break;
                case 2: triangleArea(); break;
                case 3: rectangleArea(); break;
                case 4: isoscelesTriangleArea(); break;
                case 5: parallelogramArea(); break;
                case 6: rhombusArea(); break;
                case 7: equilateralTriangleArea(); break;
                default: System.out.println("Invalid option, please try again."); break;
            }
        }
    }

    // Helper method to ensure valid integer input
    static int getValidIntInput() {
        while (true) {
            try {
                return scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Clear the invalid input
            }
        }
    }

    // Helper method to ensure valid double input (for decimal values)
    static double getValidDoubleInput() {
        while (true) {
            try {
                return scan.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scan.next(); // Clear the invalid input
            }
        }
    }

    // Circle area
    static void circleArea() {
        System.out.print("Enter the radius of the circle: ");
        double radius = getValidDoubleInput();
        if (radius <= 0) {
            System.out.println("Radius must be positive.");
            return;
        }
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Area of Circle: %.2f%n", area);
    }

    // Triangle area
    static void triangleArea() {
        System.out.print("Enter the base of the triangle: ");
        double base = getValidDoubleInput();
        System.out.print("Enter the height of the triangle: ");
        double height = getValidDoubleInput();
        if (base <= 0 || height <= 0) {
            System.out.println("Base and height must be positive.");
            return;
        }
        double area = (base * height) / 2;
        System.out.printf("Area of Triangle: %.2f%n", area);
    }

    // Rectangle area
    static void rectangleArea() {
        System.out.print("Enter the length of the rectangle: ");
        double length = getValidDoubleInput();
        System.out.print("Enter the width of the rectangle: ");
        double width = getValidDoubleInput();
        if (length <= 0 || width <= 0) {
            System.out.println("Length and width must be positive.");
            return;
        }
        double area = length * width;
        System.out.printf("Area of Rectangle: %.2f%n", area);
    }

    // Parallelogram area
    static void parallelogramArea() {
        System.out.print("Enter the base of the parallelogram: ");
        double base = getValidDoubleInput();
        System.out.print("Enter the height of the parallelogram: ");
        double height = getValidDoubleInput();
        if (base <= 0 || height <= 0) {
            System.out.println("Base and height must be positive.");
            return;
        }
        double area = base * height;
        System.out.printf("Area of Parallelogram: %.2f%n", area);
    }

    // Rhombus area
    static void rhombusArea() {
        System.out.print("Enter the length of diagonal 1: ");
        double diagonal1 = getValidDoubleInput();
        System.out.print("Enter the length of diagonal 2: ");
        double diagonal2 = getValidDoubleInput();
        if (diagonal1 <= 0 || diagonal2 <= 0) {
            System.out.println("Diagonals must be positive.");
            return;
        }
        double area = (diagonal1 * diagonal2) / 2;
        System.out.printf("Area of Rhombus: %.2f%n", area);
    }

    // Equilateral triangle area
    static void equilateralTriangleArea() {
        System.out.print("Enter the side of the equilateral triangle: ");
        double side = getValidDoubleInput();
        if (side <= 0) {
            System.out.println("Side length must be positive.");
            return;
        }
        double area = (Math.pow(side, 2) * Math.sqrt(3)) / 4;
        System.out.printf("Area of Equilateral Triangle: %.2f%n", area);
    }

    // Isosceles triangle area
    static void isoscelesTriangleArea() {
        System.out.println("Select the method to calculate the area:");
        System.out.println("1. Base and Height");
        System.out.println("2. Two equal sides and base");
        System.out.println("3. Two equal sides and angle between them");
        System.out.print("Enter choice (1-3): ");
        int choice = getValidIntInput();

        switch (choice) {
            case 1: calculateIsoscelesBaseHeight(); break;
            case 2: calculateIsoscelesSidesBase(); break;
            case 3: calculateIsoscelesSidesAngle(); break;
            default: System.out.println("Invalid choice, please try again."); break;
        }
    }

    // Formula for base and height of isosceles triangle
    static void calculateIsoscelesBaseHeight() {
        System.out.print("Enter the base of the isosceles triangle: ");
        double base = getValidDoubleInput();
        System.out.print("Enter the height of the isosceles triangle: ");
        double height = getValidDoubleInput();
        if (base <= 0 || height <= 0) {
            System.out.println("Base and height must be positive.");
            return;
        }
        double area = (base * height) / 2;
        System.out.printf("Area of Isosceles Triangle: %.2f%n", area);
    }

    // Formula for two equal sides and base of isosceles triangle
    static void calculateIsoscelesSidesBase() {
        System.out.print("Enter the equal side length of the isosceles triangle: ");
        double side = getValidDoubleInput();
        System.out.print("Enter the base of the isosceles triangle: ");
        double base = getValidDoubleInput();
        if (side <= 0 || base <= 0) {
            System.out.println("Side and base must be positive.");
            return;
        }
        double height = Math.sqrt(Math.pow(side, 2) - Math.pow(base, 2) / 4);
        double area = (base * height) / 2;
        System.out.printf("Area of Isosceles Triangle: %.2f%n", area);
    }

    // Formula for two equal sides and the angle between them (using sine)
    static void calculateIsoscelesSidesAngle() {
        System.out.print("Enter the length of the equal sides of the isosceles triangle: ");
        double side = getValidDoubleInput();
        System.out.print("Enter the angle between the equal sides (in degrees): ");
        double angle = getValidDoubleInput();
        angle = Math.toRadians(angle); // Convert to radians
        if (side <= 0 || angle <= 0) {
            System.out.println("Side and angle must be positive.");
            return;
        }
        double area = (Math.pow(side, 2) * Math.sin(angle)) / 2;
        System.out.printf("Area of Isosceles Triangle: %.2f%n", area);
    }
}
