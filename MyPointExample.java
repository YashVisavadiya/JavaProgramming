package com.college;

class MyPoint{
    double x , y;

    MyPoint(){x=0;y=0;}
    MyPoint(double x1 ,double y1){x=x1;y=y1;}

    double distance (MyPoint p){
        return Math.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y-p.y));
    }
    double distance (double x1,double y1){
        return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
    }
}

class ThreeDPoint extends MyPoint{
    double z;

    ThreeDPoint(){
        super();
        z=0;
    }
    ThreeDPoint(double x1,double y1,double z1){
        super(x1,y1);
        z=z1;
    }
    double getZ(){
        return z;
    }
    double distance(ThreeDPoint p){
        return Math.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y-p.y) + (z-p.z)*(z-p.z)) ;
    }
}

public class MyPointExample {
    public static void main(String[] args) {
        ThreeDPoint p1 = new ThreeDPoint();
        ThreeDPoint p2 = new ThreeDPoint(10,30,25.5);
        System.out.println("Distance of x="+p2.x+" y="+p2.y+" z="+p2.z+" to origin is "+p1.distance(p2));
    }
}

