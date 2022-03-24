package com.college;

import java.util.Scanner;
class Time{
    public int hour;
    public int minute;

    Time(int h,int min){
        hour = h;
        minute = min;
    }

    public void AddTime(int h,int min){
        hour += h;
        minute += min;
        if(hour>=24){
            hour = hour % 24;
        }
        if(minute>=60){
            hour = hour + (minute/60);
            minute = minute%60;
        }
        System.out.println("Total Time :"+hour+" : "+minute);
    }
}

public class TimeExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h1=sc.nextInt();
        int m1=sc.nextInt();

        int h2=sc.nextInt();
        int m2=sc.nextInt();

        Time obj1 = new Time(h1,m1);
        Time obj2 = new Time(h2,m2);
        obj1.AddTime(obj2.hour,obj2.minute);
    }
}
