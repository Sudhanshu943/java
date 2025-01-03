package code.preactic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Volume {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        while (true) {
            System.out.println("--------Select operation you want to perform---------");
            System.out.println("1. code.preactic.Volume of Cone");
            System.out.println("2. code.preactic.Volume of Prism");
            System.out.println("3. code.preactic.Volume of Cylinder");
            System.out.println("4. code.preactic.Volume of Sphere");
            System.out.println("5. code.preactic.Volume of Pyramid");
            System.out.println("0. Exit");

            System.out.print("Enter a number from 1 to 5 (or 0 to exit): ");
            int key = getValidIntInput();

            if (key == 0) {
                System.out.println("Exiting the Code");
                return;
            }

            switch (key) {
                case 1 -> coneVolume();
                case 2 -> prismVolume();
                case 3 -> cylinderVolume();
                case 4 -> sphereVolume();
                case 5 -> pyramidVolume();
            
                default -> System.out.println("Please enter a Valid Key.");
            }
        }
    }

    static int getValidIntInput(){
        while (true) {
            try {
                return scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input, Please Enter a valid Input.");
                scan.next();// clear wromg input
            }
        }
    }
    
    static double getValidDoubleInput(){
        while (true) {
            try {
                return scan.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input, Please Enter a valid Input.");
                scan.next();
            }
        }
    }

    // ==== code.preactic.Volume of Cone
    static void coneVolume(){
        System.out.print("Enter Radius of cone: ");
        double radius = getValidDoubleInput();
        System.out.print("Enter height of cone: ");
        double height = getValidDoubleInput();
        // Check Input type positive or not
        if (radius <= 0 || height <= 0) {
            System.out.println("Radius and Height Should be Positive.");
            return;
        }
        double volume = (Math.PI * Math.pow(radius, 2) * height)/3;
        System.out.println("code.preactic.Volume of cone is   "+volume);
    }

    // ==== code.preactic.Volume of Prism
    static void prismVolume(){
        System.out.println("Enter Base length of Prism");
        double baseLength = getValidDoubleInput();
        System.out.println("Enter Base width of Prism");
        double baseWidth = getValidDoubleInput();
        System.out.println("Enter height of Prism");
        double height = getValidDoubleInput();
        if (baseLength <= 0 || baseWidth <= 0 || height <= 0) {
            System.out.println("Prism height and Base's length, width should be Positive. ");
            return;
        }
        // calculat the base area 
        double baseArea = baseLength * baseWidth;
        double volume  = baseArea * height;
        System.out.println("code.preactic.Volume of Prism is   "+volume);
    }

    // ==== code.preactic.Volume of Cylinder
    static void cylinderVolume(){
        System.out.print("Enter Radius of Cylinder: ");
        double radius = getValidDoubleInput();
        System.out.print("Enter height of Cylinder: ");
        double height = getValidDoubleInput();
        // Check Input type positive or not
        if (radius <= 0 || height <= 0) {
            System.out.println("Radius and Height Should be Positive.");
            return;
        }
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("code.preactic.Volume of Cylinder is  "+volume);
    }

    // ==== code.preactic.Volume of Sphere
    static void sphereVolume(){
        System.out.print("Enter Radius of Sphere: ");
        double radius = getValidDoubleInput();
        // Check Input type positive or not
        if (radius <= 0) {
            System.out.println("Radius Should be Positive.");
            return;
        }
        double volume = (Math.PI * Math.pow(radius, 3))*4/3 ;
        System.out.println("code.preactic.Volume of Sphere is   "+volume);
    }

    // ==== code.preactic.Volume of Pyramid
    static void pyramidVolume(){
       while (true) {
            System.out.println("------ Select a Pyramid operation ------");
            System.out.println("1. For Triangular Pyramid code.preactic.Volume");
            System.out.println("2. For Square Pyramid code.preactic.Volume");
            System.out.println("3. For Rectangular Pyramid code.preactic.Volume");
            System.out.println("4. For Pentagonal Pyramid code.preactic.Volume");
            System.out.println("5. For Hexagonal Pyramid code.preactic.Volume");
            System.out.println("0. Back to volumes");

            System.out.println("Enter a key: ");
            int key = getValidIntInput();
            if (key == 0) {
                System.out.println("Exiting Pyramid");
                return;
            }

            switch (key) {
                case 1 -> triangulurPyramidVolume();
                case 2 -> squarePyramidVolume();
                case 3 -> rectangularPyramidVolume();
                case 4 -> pentagonalPyramidVolume();
                case 5 -> hexagonalPyramidVolume();
            
                default -> System.out.println("Enter a valid key");
            }
       }
    }

    static void triangulurPyramidVolume(){
        System.out.println("Enter Base length of Triangular Pyramid");
        double baseLength = getValidDoubleInput();
        System.out.println("Enter Base height of Triangular Pyramid");
        double baseHeight = getValidDoubleInput();
        System.out.println("Enter height of Triangular Pyramid");
        double height = getValidDoubleInput();
        if (baseLength <= 0 || baseHeight <= 0 || height <= 0) {
            System.out.println("Triangular Pyramid height and Base's length, height should be Positive. ");
            return;
        }
        // calculat the base area 
        double baseArea = (baseLength * baseHeight)/2;
        double volume  = (baseArea * height)/3;
        System.out.println("code.preactic.Volume of Triangular Pyramid is   "+volume);
    }
    
    
    static void squarePyramidVolume(){
        System.out.println("Enter Base side of Square Pyramid ");
        double side = getValidDoubleInput();
        System.out.println("Enter height of Square Pyramid");
        double height = getValidDoubleInput();
        if (side <= 0  || height <= 0) {
            System.out.println("Square Pyramid height and Base's side should be Positive. ");
            return;
        }
        // calculat the base area 
        double baseArea = side * side;
        double volume  = (baseArea * height)/3;
        System.out.println("code.preactic.Volume of Square Pyramid is   "+volume);
    }


    static void rectangularPyramidVolume(){
        System.out.println("Enter Base Length of Rectangular Pyramid ");
        double baseLength = getValidDoubleInput();
        System.out.println("Enter Base Width of Rectangular Pyramid");
        double baseWidth = getValidDoubleInput();
        System.out.println("Enter height of Rectangular Pyramid");
        double height = getValidDoubleInput();
        if (baseLength <= 0 || baseWidth <= 0 || height <= 0) {
            System.out.println("Rectangular Pyramid height and Base's length, width should be Positive. ");
            return;
        }
        // calculat the base area 
        double baseArea = baseLength * baseWidth;
        double volume  = (baseArea * height)/3;
        System.out.println("code.preactic.Volume of Rectangular Pyramid is   "+volume);
    }


    static void pentagonalPyramidVolume(){
        System.out.println("Enter Base Side of Pentagonal Pyramid ");
        double side = getValidDoubleInput();
        System.out.println("Enter Apothem of Pentagonal Pyramid");
        double apothem = getValidDoubleInput();
        System.out.println("Enter height of Pentagonal Pyramid");
        double height = getValidDoubleInput();
        if (side <= 0 || apothem <= 0 || height <= 0) {
            System.out.println("Pentagonal Pyramid height and Base's Side, Apothem should be Positive. ");
            return;
        }
        // calculat the base area 
        double baseArea = (side * apothem)* (5/2);
        double volume  = (baseArea * height)/3;
        System.out.println("code.preactic.Volume of Pentagonal Pyramid is   "+volume);
    }

    static void hexagonalPyramidVolume(){
        System.out.println("Enter Base Side of Hexagonal Pyramid ");
        double side = getValidDoubleInput();
        System.out.println("Enter Apothem of Hexagonal Pyramid");
        double apothem = getValidDoubleInput();
        System.out.println("Enter height of Hexagonal Pyramid");
        double height = getValidDoubleInput();
        if (side <= 0 || apothem <= 0 || height <= 0) {
            System.out.println("Hexagonal Pyramid height and Base's Side, Apothem should be Positive. ");
            return;
        }
        // calculat the base area 
        double baseArea = 3 * side * apothem;
        double volume  = (baseArea * height)/3;
        System.out.println("code.preactic.Volume of Hexagonal Pyramid is  "+volume);
    }
}
