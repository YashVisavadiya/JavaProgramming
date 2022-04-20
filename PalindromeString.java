package com.college;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s;
        System.out.println("Enter a String : ");
        s = sc.next();

        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i -1)) {
                System.out.println("Not Palindrome");
                System.exit(0);
            }
        }
        System.out.println("Palindrome ");
    }
}
