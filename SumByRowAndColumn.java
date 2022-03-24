package com.college;

import java.util.Scanner;

public class SumByRowAndColumn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int[] sumrow = new int[n];
        int[] sumcol = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sumrow[i] += arr[i][j];
                sumcol[j] += arr[i][j];
            }
        }

        System.out.print("Sum By Row :");
        for (int i = 0; i < n; i++) {
            System.out.print(sumrow[i] + " ");
        }
        System.out.println();
        System.out.print("Sum By Column :");
        for (int i = 0; i < n; i++) {
            System.out.print(sumcol[i] + " ");
        }
        System.out.println();
    }
}
