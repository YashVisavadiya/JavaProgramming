package com.college;

import java.util.Scanner;
public class CandidateExample {
    public static void main(String[] args) {

        Candidate obj = new Candidate();

        obj.GetCandidateDetails();
        obj.DisplayCandidateDetails();
    }
}
class Candidate{

    Scanner sc = new Scanner(System.in);

    public long Candidate_ID;
    public String Candidate_Name;
    public int Candidate_Age;
    public double Candidate_Weight;
    public double Candidate_Height;

    public void GetCandidateDetails(){
        System.out.print("Candidate_ID :");
        Candidate_ID = sc.nextLong();

        System.out.print("Candidate_Name :");
        Candidate_Name = sc.next();

        System.out.print("Candidate_Age :");
        Candidate_Age = sc.nextInt();

        System.out.print("Candidate_Weight :");
        Candidate_Weight = sc.nextDouble();

        System.out.print("Candidate_Height :");
        Candidate_Height = sc.nextDouble();
    }

    public void DisplayCandidateDetails(){

        System.out.println("Candidate_ID :"+Candidate_ID);


        System.out.println("Candidate_Name :"+Candidate_Name);


        System.out.println("Candidate_Age :"+Candidate_Age);


        System.out.println("Candidate_Weight :"+Candidate_Weight);


        System.out.println("Candidate_Height :"+Candidate_Height);
    }
}
