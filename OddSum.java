package com.college;

import java.sql.SQLOutput;
import java.util.Scanner;
public class OddSum {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int sum=0;

        while(n > 0){
            if(n % 2 == 1){
                sum += n;
            }
            n--;
        }
        System.out.println("Sum is "+sum);
    }
}
