package com.college;

// import java.util.Scanner;
class Circle{
    public double Radius;

    Circle(double r){
        Radius = r;
    }

    public double Area(){
        return ((Math.PI)*Radius*Radius);
    }
    public double Perimeter(){
        return (2*(Math.PI)*Radius);
    }
}

public class CircleAreaPerimeter {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // int radius = sc.nextInt();
        Circle obj = new Circle(5);

        System.out.println("Area of a Circle : "+obj.Area());
        System.out.println("Perimeter of a Circle : "+obj.Perimeter());
    }
}
