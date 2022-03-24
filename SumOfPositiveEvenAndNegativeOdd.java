package com.college;

import java.util.Scanner;
public class SumOfPositiveEvenAndNegativeOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a,sumeven=0,sumodd=0;

        do{
            a=sc.nextInt();
            if(a%2 == 0 && a > 0){
                sumeven+=a;
            }
            if(a%2 != 0 && a<0){
                sumodd+=a;
            }
        }while(a!=0);
        System.out.println("Sum of all Positive even Numbers : "+sumeven);
        System.out.println("Sum of all Negative Odd Numbers : "+sumodd);
    }
}
