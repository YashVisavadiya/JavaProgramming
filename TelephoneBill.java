package com.college;

import java.util.Scanner;
public class TelephoneBill {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int calls= sc.nextInt();
        double amount = 0;

        if( calls > 200 ){
            amount += 1.5 * (calls-200);
            calls = 200;
        }
        if(calls >150 && calls <= 200){
            amount += 1.1 * ( calls - 150 );
            calls = 150;
        }
        if(calls >100 && calls <= 150){
            amount += 0.6 * (calls -100);
            calls = 100 ;
        }
        if( calls <= 100 ){
            amount += 200;
            calls = 0;
        }


        System.out.println("Total Amount to be paid is "+amount);
    }
}

/* For not using all If statements use this one

        if(calls > 200){
            amount = ((calls-200) * 1.5) + (50 * 1.1) + (50 * 0.6) + 200;
        }
        else if(calls > 150 && calls <=200){
            amount = ((calls - 150) * 1.1) + (50 * 0.6) + 200;
        }
        else if(calls > 100 && calls <= 150){
            amount = ((calls - 100) * 0.6 ) + 200;
        }
        else{
            amount = 200;
        }
 */