
import java.util.InputMismatchException;
import java.util.Scanner;

public class SurfaceArea {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        while (true) {
            
            System.out.println("----Select one option----");
            System.out.println("1. Curved Surface Area Of Cylinder");
            System.out.println("2. Total Surface Area Of Cube");
            System.out.println("0. Exit the code");
            
            System.out.print("Choose one option.");
            int key = getValidateIntInput();
            
            switch (key) {
                case 1:
                System.out.println("Curved Serface Area Cylender");
                curvedSerfaceAreaCylender();
                break;
                case 2:
                System.out.println("Total Serface Area Cube");
                totalSerfaceAreaCube();
                default:System.out.println("Wrong Input");
                break;
            }
        }
    }

    
    static int getValidateIntInput(){
        while(true){
            try {
                return scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input Error. Please enter correct Input");
                scan.next();
            }
        }
    }
    
    static double  getValidateDoubleInput(){
        while(true){
            try {
                return scan.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Input Error. Please enter correct Input");
                scan.next();
            }
        }
    }

    static void curvedSerfaceAreaCylender(){
        System.out.println("Radius of Cylender is :");
        double radius =  getValidateDoubleInput();
        System.out.println("Height of Cylender is :");
        double height =  getValidateDoubleInput();
        if(radius <= 0 || height <= 0){
            System.out.println("Radius and height should be Positive");
            return;
        }
        double curvedSurfaceArea = 2*Math.PI*radius*height;
        System.out.println("Curved Serface Area of Cylender is "+curvedSurfaceArea);
        
    }

    static void  totalSerfaceAreaCube(){
        System.out.print("Enter The side of Cube: ");
        double side  = getValidateDoubleInput();
        if(side<= 0 ){
            System.out.println("Side should be positive.");
            return;
        }
        double totalSerfaceArea = 6*Math.pow(side, 2);
        System.out.println("The Total Surface Area of Cube is  "+totalSerfaceArea);
    }
}
