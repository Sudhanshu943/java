package code.preactic;

    // Problem 1
/* class Car{
    String make;
    int year;

    Car(String make, int year){
        this.make = make;
        this.year = year;
    }
}
    // Problem 2

class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displayDetail(){
        System.out.println("Student Name: "+name);
        System.out.println("Student Age: "+age);
    }
}
    // Problem 3
class Rectangle{
    int length;
    int width;

    Rectangle(int length,int width) {
        this.length = length;
        this.width = width;
    }

    void displayOutput(){
        System.out.println("Area of Rectangle: "+area());
        System.out.println("Perimeter of Rectangle: "+perimeter());
    }

    public int area(){
        return length * width;
    }
    public int perimeter(){
        return 2 * (length + width);
    }

}
    // Problem 4
class Person{
    String name;
    int age;

    Person(){
        name = "Unknown";
        age = 0;
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Person Name: " + name + "  Person Age: " + age);
    }
}
    // Problem 5
    class Book{
        private String title;
        private String author;
        private int price;

        Book(){
            title = "The Worlds End";
            author = "Sudhanshu Thapa";
            price = 2000;
        }

        Book(String title, String author, int price){
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public String getTitle(){
            return title;
        }
        public String getAuthor(){
            return author;
        }
        public int getPrice(){
            return price;
        }

        public void displayDetails() {
            System.out.println("Book's Name: " +title);
            System.out.println("Book's Author Name: " +author);
            System.out.println("Book's Price: " +price);
        }
    }

    // Problem 6
class Circle{
    private double radius;

    Circle(double radius){
        if (radius <= 0){
            throw new IllegalArgumentException("Radius can't be Negative");
        }
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    double circumference(){
        return 2 * Math.PI * radius;
    }
    double area(){
        return Math.PI * radius * radius;
    }

    public void displayOutput(){
        System.out.printf("Circle Circumference: %.2f%n",circumference());
        System.out.printf("Circle Area: %.2f%n",area());
    }
}

    // Problem 7
class BankAccount{
    private double balance;

    BankAccount(){
        double balance = 0;
    }
    BankAccount(double balance){
        this.balance = balance;
    }
    public double getAccount (){
        return balance;
    }

    void displayOutput(){
        System.out.println("Bank Account: "+balance);
    }
}
*/
    // Problem 8
class Employee{
    private int id;
    private String name;
    private int salary;

    Employee(){
        id = 0;
        name = "Unknown";
        salary = 0;
    }

    Employee(int id,String name , int salary){
        if (id <= 0 || salary < 0) {
            throw new IllegalArgumentException("Invalid ID or Salary");
        }
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

        public int getId() {
            return id;
        }

        public int getSalary() {
            return salary;
        }

        public String getName() {
            return name;
        }

        void displayOutput(){
            System.out.printf("Employee Id: %d%n",id);
            System.out.printf("Employee Name: %s%n",name);
            System.out.printf("Employee Salary: %,d%n",salary);
        }
}

public class SimpleClassAndObject {
    public static void main(String[] args){
    // Problem 1
/*        Car car = new Car("RR",1998);
        System.out.println("Car Make: "+car.make);
        System.out.println("Car Year: "+car.year);

    // Problem 2
        Student one = new Student("Sudhanshu Thapa", 21);
        one.displayDetail();

    // Problem 3
        Rectangle rectangle = new Rectangle(2,5);
        System.out.println("Rectangle Dimensions:");
        System.out.println("Length: " + rectangle.length + ", Width: " + rectangle.width);
        rectangle.displayOutput();;

    // Problem 4
        Person person = new Person("Sudhanshu Thapa",21);
        person.displayDetails();
        Person person2 = new Person();
        person2.displayDetails();

    // Problem 5
        Book book = new Book();
        book.displayDetails();

        System.out.println();

        Book book2 = new Book("JAVA is Love","Aditya Dimri",2021);
        book2.displayDetails();

    // Problem 6
        Circle circle = new Circle(45.5);
        System.out.println("Circle Radius: "+circle.getRadius());
        circle.displayOutput();

    // Problem 7
        BankAccount acc = new BankAccount();
        acc.displayOutput();

        BankAccount acc2 = new BankAccount(4877536);
        acc2.displayOutput();

*/
    // Problem 8
        Employee person1 = new Employee();
        person1.displayOutput();

        System.out.println();

        Employee person2 = new Employee(54,"Sudhanshu Thapa", 48000000);
        person2.displayOutput();
    }
}
