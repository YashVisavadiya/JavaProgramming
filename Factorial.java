package com.college;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long fact = 1;
        for(int i = 1 ; i <= n ; i++){
            fact *= i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}