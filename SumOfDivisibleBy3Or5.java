package com.college;

import java.util.Scanner;

public class SumOfDivisibleBy3Or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int sum=0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a["+i+"] = ");
            arr[i]=sc.nextInt();

            if(arr[i]%3==0 || arr[i]%5==0){
                sum+=arr[i];
            }
        }
        System.out.println("Sum of Numbers Divisible by either 3 or 5 in array is "+sum);

    }
}
