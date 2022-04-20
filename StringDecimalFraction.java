package com.college;

import java.util.Scanner;

class DecimalFractionFromString {
    String s;
    long decimal = 0;
    long numerator = 0;
    long denominator = 1;

    Scanner sc = new Scanner(System.in);

    void getString() {
        System.out.println("Enter a Number String : ");
        s = sc.next();
    }

    void convertToDecimal() {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '.')
                decimal = decimal * 10 + Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        System.out.println("Decimal Number : "+ decimal);
    }

    void convertToFraction() {
        long befp = 0;
        long aftp = 0;
        int countpoint=0;
        char temp = 'a';
        for (int i = 0; i < s.length(); i++) {
            if (temp != '.') {
                temp = s.charAt(i);
                if(s.charAt(i)!='.')
                    befp = befp * 10 + Integer.parseInt(String.valueOf(s.charAt(i)));
            } else if(s.charAt(i)!='.'){
                aftp = aftp * 10 + Integer.parseInt(String.valueOf(s.charAt(i)));
                countpoint++;
            }
        }
        denominator=(long)Math.pow(10.0,(double) countpoint);
        int divide=gcd(aftp,denominator);

        aftp/=divide;
        denominator/=divide;

        numerator=(befp*denominator)+aftp;

        System.out.println("Numerator    : "+numerator);
        System.out.println("Denominator  : "+denominator);
    }
    int gcd(long a , long b){
        if(a > b){
            a = a - b;
            return gcd(b,a);
        }
        else if( b > a ){
            b = b - a;
            return gcd(a,b);
        }
        else{
            return (int)a;
        }
    }
}


public class StringDecimalFraction {
    public static void main(String[] args) {
        DecimalFractionFromString s1 =new DecimalFractionFromString();
        s1.getString();

        s1.convertToDecimal();
        s1.convertToFraction();
    }
}
