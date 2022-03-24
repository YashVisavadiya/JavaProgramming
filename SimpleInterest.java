package com.college;

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double P = sc.nextDouble();
        double R = sc.nextDouble();
        double T = sc.nextDouble();
        double si = SimpleInterest(P,R,T);

        System.out.println(si);

    }
    public static double SimpleInterest(double P,double R,double T){
        return (P*R*T)/100 ;
    }
}
