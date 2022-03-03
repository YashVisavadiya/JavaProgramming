package com.college;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int unit = sc.nextInt();
        double amount = 0;


        if(unit > 200){
            amount += (unit-200) * 7;
            unit = 200;
        }
        if(unit > 100 && unit <=200){
            amount += (unit-100) * 6 ;
            unit = 100;
        }
        if(unit > 50 && unit <= 100){
            amount += (unit - 50) * 5.2 ;
            unit = 50;
        }
        if(unit <= 50){
            amount += unit * 4.5 ;
            unit = 0;
        }

        System.out.println("Total Amount to be paid is "+amount);
    }
}
