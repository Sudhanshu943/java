package code.preactic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Parimeter {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        while (true) {
            
            System.out.println("--------Select operation you want to perform---------");
            System.out.println("1. Perimeter  of Circle");
            System.out.println("2. Perimeter  of Equilateral Triangle");
            System.out.println("3. Perimeter  of Parallelogram");
            System.out.println("4. Perimeter  of Rectangle");
            System.out.println("5. Perimeter  of Square");
            System.out.println("6. Perimeter  of Rhombus");
            System.out.println("0. Exit");
            
            System.out.print("Enter a number form 1 to 6(or 0 to Exit) --->  ");
            byte key = getValidIntInput();

            if (key==0) {
                System.out.println("Exiting the Program.");
                break;
            }
            
            switch (key) {
                case 1 -> {
                    System.out.println("------>>> Circle Perimeter <<< ------");
                    circlePerimeter();
                }
                
                case 2 -> {
                    System.out.println("------>>> Equilateral Triangle Perimeter  <<<------");
                    equilateralTrianglePerimeter();
                }
                
                case 3 -> {
                    System.out.println("------>>> Parallelogram Perimeter  <<<------");
                    parallelogramPerimeter();
                }
                
                case 4 -> {
                    System.out.println("------>>> Rectangle Perimeter  <<<------");
                    rectanglePerimeter();
                }
                
                case 5 -> {
                    System.out.println("------>>> Square Perimeter  <<<------");
                    squarePerimeter();
                }
                
                case 6 -> {
                    System.out.println("------>>> Rhombus Perimeter <<< ------");
                    rhombusPerimeter ();
                }
                
                default -> System.out.println("Invalid Input, Please Enter again");
            }
        }
    }
    
    static byte getValidIntInput(){
        while (true) {
            try {
                return scan.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input, Please Select valid input.");
                scan.next();
            }
        }
    }
    
    static double getValidDoubleInput(){
        while (true) {
            try {
                return scan.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Input Should be Positive");
                scan.next();
            }
        }
    }
        
        //----- Circle Perimeter  ---
        static void circlePerimeter(){
            System.out.print("Enter the radious of Cirle: ");
            double r = getValidDoubleInput();
            if (r <= 0) {
                System.out.println("Radius should be Positive.");
                return;
            }
            double Perimeter  = 2*Math.PI*r;
            System.out.println("Perimeter  of Cirle is : "+Perimeter );        
        }
        
        //----- Equilateral Triangle Perimeter  ---
        static void equilateralTrianglePerimeter(){
            System.out.print("Enter the side of Equilateral Triangle: ");
            double side = getValidDoubleInput();
            if (side <= 0) {
                System.out.println("Side should be Positive.");
                return;
        }
        double Perimeter  = 3 * side;
        System.out.println("Perimeter  of Equilateral Triangle is : "+Perimeter );        
    }

    //----- Rectangle Perimeter  ---
    static void rectanglePerimeter(){
        System.out.print("Enter the Length of Rectangle: ");
        double length =  getValidDoubleInput();
        System.out.print("Enter the Width of Rectangle: ");
        double width =  getValidDoubleInput();
        if (length<=0 || width<=0) {
            System.out.println("Length and Width Should be positive");
            return;
        }
        double Perimeter  = 2 * (length + width);
        System.out.println("Perimeter  of Rectangle is : "+Perimeter );        
    }

    //----- Parallelogram Perimeter  ---
    static void parallelogramPerimeter(){
        System.out.print("Enter Lengths one by one of Parallelogram: ");
        double a =  getValidDoubleInput();
        double b =  getValidDoubleInput();
        double c =  getValidDoubleInput();
        double d =  getValidDoubleInput();
        double Perimeter  = a + b + c + d;
        System.out.println("Perimeter  of Parallelogram is : "+Perimeter );        
    }

    //----- Parallelogram Perimeter  ---
    static void squarePerimeter(){
        System.out.print("Enter Lengths one by one of Square: ");
        double s =  getValidDoubleInput();
        double Perimeter  = 4*s;
        System.out.println("Perimeter  of Square is : "+Perimeter );        
    }

    //----- Rhombus Perimeter  ---
    static void rhombusPerimeter(){
        System.out.print("Enter lengths of Rhombus: ");
        double a =  getValidDoubleInput();
        double b =  getValidDoubleInput();
        double c =  getValidDoubleInput();
        double d =  getValidDoubleInput();
        double Perimeter  = a + b + c + d;
        System.out.println("Perimeter  of Rhombus is : "+Perimeter );        
    }

  

}
