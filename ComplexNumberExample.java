package com.college;

import java.util.Scanner;
class Complex{

    public double real;
    public double image;

    Complex(double r,double i){
        real = r;
        image = i;
    }
    Complex(double r,boolean x){
        real = r;
    }
    Complex(boolean x,double i){
        image = i;
    }

    public void Add(double r, double i){
        real += r;
        image += i;

        System.out.println(real+" + i * "+image );
    }
}

public class ComplexNumberExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double r1=sc.nextDouble();
        double i1=sc.nextDouble();

        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();

        Complex obj1 = new Complex(r1,i1);
        Complex obj2 = new Complex(r2,i2);

        obj1.Add(obj2.real,obj2.image);
    }
}
