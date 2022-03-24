package com.college;

import java.util.Scanner;
public class FindArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius : ");
        double r = sc.nextDouble();
        System.out.println("Area Of Circle = "+Area(r,0));

        System.out.println("Enter Base : ");
        double b = sc.nextDouble();
        System.out.println("Enter Height : ");
        double h = sc.nextDouble();
        System.out.println("Area Of Triangle = "+Area(b,h));

        System.out.println("Enter Length : ");
        double l = sc.nextDouble();
        System.out.println("Area Of Square = "+Area(l));
    }

    public static double Area(double r,int i){
        return (Math.PI)*r*r;
    }

    public static double Area(double base , double height ){
        return (((double)1/(double)2)*(base*height));
    }

    public static double Area(double length){
        return length*length;
    }
}
