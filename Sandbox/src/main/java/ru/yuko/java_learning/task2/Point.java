package ru.yuko.java_learning.task2;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point p2){
        double d = Math.sqrt(Math.abs(((this.x - p2.x) * 2) + ((this.y - p2.y) * 2)));
        return d;
    }
}
