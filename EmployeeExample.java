package com.college;

import java.util.Scanner;
class Employee{

    Scanner sc = new Scanner(System.in);

    public long Employee_ID;
    public String Employee_Name;
    public String Designation;
    public int Age;
    public double Salary;

    public void GetEmployeeDetails(){
        System.out.print("Employee_ID :");
        Employee_ID = sc.nextLong();

        System.out.print("Employee_Name :");
        Employee_Name = sc.next();

        System.out.print("Age :");
        Age = sc.nextInt();

        System.out.print("Designation :");
        Designation = sc.next();

        System.out.print("Salary :");
        Salary = sc.nextDouble();
    }

    public void DisplayEmployeeDetails(){

        System.out.println("Employee_ID :"+Employee_ID);


        System.out.println("Employee_Name :"+Employee_Name);


        System.out.println("Age :"+Age);


        System.out.println("Designation :"+Designation);


        System.out.println("Salary :"+Salary);
    }
}

public class EmployeeExample {
    public static void main(String[] args) {

        Employee obj = new Employee();

        obj.GetEmployeeDetails();
        obj.DisplayEmployeeDetails();
    }
}
