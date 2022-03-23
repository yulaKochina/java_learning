package ru.yuko.java_learning.task2;

public class MainClassTask2 {
    public static void main(String[] args) {

        Point p1 = new Point(2, 0);
        Point p2 = new Point(4, 0);
        System.out.println("Рассояние между двумя точками : " +  txt(p1,p2) + " = " + distance(p1, p2));
    }
    public static String txt(Point p1, Point p2){
        return "√|((" + p1.x + "-" + p2.x + ")*2)+((" + p1.y + "-" + p2.y + ")*2)|";
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.abs(((p1.x - p2.x) * 2) + ((p1.y - p2.y) * 2)));
    }
}
