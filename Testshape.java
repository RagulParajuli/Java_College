import java.util.Scanner;
import java.lang.Math;
abstract class shape{
    abstract void FindArea();
    protected int x,y;
    Scanner sr = new Scanner(System.in);
    
}

class Rectangle extends shape{
    void FindArea(){
        System.out.println("Enter Length and Breath:");
        float l = sr.nextInt();
        float b = sr.nextInt();
        float area = l*b;
        System.out.println("Area of Rectangle is :"+area);
    }
}

class Triangle extends shape{
    void FindArea(){
        System.out.println("Enter Height and Base:");
        float h = sr.nextInt();
        float b = sr.nextInt();
        float area = (0.5f) * h * b;
        System.out.println("Area of Triangle is :"+area);
    }
}

class Circle extends shape{
    void FindArea(){
        System.out.println("Enter Radius:");
        double r = sr.nextInt();
        double area = (3.14) * Math.pow(r,2);
        System.out.println("Area of Circle is :"+area);
    }
}

public class Testshape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.Rectangle\t2.Triangle\t3.Circle");
        shape s;
        System.out.println("Enter your choice:");
        int ch = input.nextInt();
        switch (ch) {
            case 1:
                s = new Rectangle();
                s.FindArea();
                break;

            case 2:
                s = new Triangle();
                s.FindArea();
                break;

            case 3:
                s = new Circle();
                s.FindArea();
                break;

            default:
                System.out.println("Invalid Choice!");
                break;
            }
    }
}
