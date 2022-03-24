package com.college;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a[" + i + "] =");
            arr[i] = sc.nextInt();
        }

        bubble_sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a[" + i + "] = " + arr[i]);
        }

    }

    public static void bubble_sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1 ] = t;
                }
            }
        }
    }
}
