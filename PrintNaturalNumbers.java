package com.college;

import java.util.Scanner;
public class PrintNaturalNumbers {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n=sc.nextInt();

        while(n>0){
            System.out.print(n+" ");
            n--;
        }
    }
}


