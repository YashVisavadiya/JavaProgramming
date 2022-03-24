package com.college;

import java.util.Scanner;
public class MaxOfTwoNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Max(a,b));
    }
    public static int Max(int a, int b){
        return (a > b) ? a : b;
    }
}
