package com.college;

import java.util.Scanner;
public class CountOddEven {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();
        int[] array = new int[n];
        int countOdd=0,countEven=0;

        for(int i=0;i<n;i++){
            System.out.print("Enter a["+i+"] = ");
            array[i]=sc.nextInt();
            if(array[i]%2==0){
                countEven++;
            }
            else{
                countOdd++;
            }
        }
        System.out.println("Count Number of Odd is "+countOdd);
        System.out.println("Count Number of Even is "+countEven);
    }
}
