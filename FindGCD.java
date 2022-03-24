package com.college;

import java.util.Scanner;
public class FindGCD {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a,b));
    }

    public static int gcd(int a , int b){

        if(a > b){
            a = a - b;
            return gcd(b,a);
        }
        else if( b > a ){
            b = b - a;
            return gcd(a,b);
        }
        else{
            return a;
        }
    }
}
