package com.college;

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Fibonacci(n);
    }
    public static void Fibonacci(int n){
        if(n>=1){
            System.out.print("0 ");
        }
        if(n>=2){
            System.out.print("1 ");
        }
        int a=0,b=1,c;
        while(n-2>0){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
            n--;
        }
    }
}
