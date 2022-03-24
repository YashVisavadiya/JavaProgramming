package com.college;

import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if( n == 1){
            System.out.println(n+" is neither a Prime Number nor Composite Number ");
            System.exit(0);
        }

        for(int i = 2 ; i*i <= n ; i++){
            if(n%i == 0){
                System.out.println(n+" is not a Prime Number");
                System.exit(0);
            }
        }
        System.out.println(n+" is a Prime Number");
    }
}
