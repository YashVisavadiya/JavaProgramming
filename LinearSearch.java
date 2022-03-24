package com.college;

import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0;i<n;i++){
            System.out.print("Enter a["+i+"] =");
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter a Element to FInd : ");
        int num = sc.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i]==num){
                System.out.println(num+" is present in an Array");
                System.exit(0);
            }
        }
        System.out.println(num+" is not present in an Array");
    }
}
