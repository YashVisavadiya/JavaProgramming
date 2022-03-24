package com.college;

import java.util.Scanner;
class Bank_Example{

    Scanner sc = new Scanner(System.in);

    public long Account_No;
    public String User_Name;
    public String Email;
    public String Account_Type;
    public double Account_Balance;

    public void GetAccountDetails(){

        Account_No = sc.nextLong();
        User_Name = sc.next();
        Email = sc.next();
        Account_Type = sc.next();
        Account_Balance = sc.nextDouble();

    }

    public void DisplayAccountDetails(){
        System.out.println("Account_No : "+Account_No);
        System.out.println("User_Name : "+User_Name);
        System.out.println("Email : "+Email);
        System.out.println("Account_Type : "+Account_Type);
        System.out.println("Account_Balance : "+Account_Balance);
    }
}

public class Bank {
    public static void main(String[] args) {

        Bank_Example obj = new Bank_Example();

        obj.GetAccountDetails();
        obj.DisplayAccountDetails();
    }
}