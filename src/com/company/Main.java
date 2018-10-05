package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyPoint a = new MyPoint();

        MyPoint b = new MyPoint(10, 30.5);

        System.out.println("Distance between a and b is: "+MyPoint.distance(a, b));
    }
}
