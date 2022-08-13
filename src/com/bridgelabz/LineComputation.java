package com.bridgelabz;

public class LineComputation {
    public static double x1,x2,y1,y2,x3,y3,y4,x4,lineLength;

    public static double calculateLength(double x1, double y1, double x2, double y2){

        lineLength = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        //System.out.println("line length :"+lineLength1);
        return lineLength;

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comprise Program");

    }
}
