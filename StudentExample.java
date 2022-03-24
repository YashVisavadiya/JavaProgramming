package com.college;

import java.util.Scanner;
class Student{

    Scanner sc = new Scanner(System.in);

    public long Enrollment_No;
    public String Student_Name;
    public int Semester;
    public double CPI;
    public double SPI;

    public void GetStudentDetails(){
        System.out.print("Enrollment_No :");
        Enrollment_No = sc.nextLong();

        System.out.print("Student_Name :");
        Student_Name = sc.next();

        System.out.print("Semester :");
        Semester = sc.nextInt();

        System.out.print("CPI :");
        CPI = sc.nextDouble();

        System.out.print("SPI :");
        SPI = sc.nextDouble();
    }

    public void DisplayStudentDetails(){

        System.out.println("Enrollment_No :"+Enrollment_No);


        System.out.println("Student_Name :"+Student_Name);


        System.out.println("Semester :"+Semester);


        System.out.println("CPI :"+CPI);


        System.out.println("SPI :"+SPI);
    }
}

public class StudentExample {
    public static void main(String[] args) {

        Student obj = new Student();

        obj.GetStudentDetails();
        obj.DisplayStudentDetails();
    }
}
