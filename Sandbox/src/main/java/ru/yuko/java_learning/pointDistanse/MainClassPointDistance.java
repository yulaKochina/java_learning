package ru.yuko.java_learning.pointDistanse;

public class MainClassPointDistance {
    public static void main(String[] args) {

        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        System.out.println("Рассояние между двумя точками способ при помощи функции : " +  txt(p1,p2) + " = " + distance(p1, p2));
        System.out.println("Рассояние между двумя точками способ при помощи метода: " +  txt(p1,p2) + " = " + p1.distance(p2));

    }
    public static String txt(Point p1, Point p2){
        return "√((" + p2.x + "-" + p1.x + ")² + (" + p2.y + "-" + p1.y + ")²)";
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.sqrt(p2.x - p1.x) + Math.sqrt(p2.y - p1.y));
    }
}
