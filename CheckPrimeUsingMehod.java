package com.college;

import java.util.Scanner;
public class CheckPrimeUsingMehod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(CheckPrime(n));
    }
    public static int CheckPrime(int n){

        if( n == 1){
            System.out.println(n+" is neither a Prime Number nor Composite Number ");
            return 0;
        }

        for(int i = 2 ; i*i < n ; i++){
            if(n%i == 0){
                // System.out.println(n+" is not a Prime Number");
                return 0;
            }
        }
        // System.out.println(n+" is a Prime Number");
        return 1;
    }
}
