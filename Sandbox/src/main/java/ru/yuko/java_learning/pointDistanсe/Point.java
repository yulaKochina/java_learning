package ru.yuko.java_learning.pointDistanсe;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point p2){
        double d = Math.sqrt(Math.sqrt(p2.x - this.x ) + Math.sqrt(p2.y - this.y ));
        return d;
    }
}
