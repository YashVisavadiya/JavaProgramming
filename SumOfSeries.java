package com.college;

import java.util.Scanner;
public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0;

        for(int i = 1 ; i <= n ; i++){
            sum += (1 / (double) i);
        }
        System.out.println("Sum of Series 1 + 1/2 + 1/3 + ... + 1/n is "+sum);
    }
}
