package com.company;

public class MyPoint {
    private double x = 0;
    private double y = 0;

    MyPoint(){}

    MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static double distance(MyPoint a, MyPoint b){
        double deltaX = b.getX() - a.getX();
        double deltaY = b.getY() - a.getY();

        return Math.sqrt((deltaX*deltaX)+(deltaY*deltaY));
    }
}
