package com.college;

import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("No. of Rows : ");
        int row = sc.nextInt();
        System.out.print("No. of Column : ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("Arr["+i+"]["+j+"] = ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Print 2-D Array/Matrix");

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
