package ru.yuko.java_learning.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        // Опробовала использование выражений
        String text = "Hello, world!";
        System.out.println("\nIt's my first program! " + text);

        // Вызвала функцию осуществляющую вывод текста с использованием значения передаваемого фукции
        String txt = "Yuliya";
        text(txt);

        // Определина значения переменных
        double a = 3;
        double b = 5;
        String area = "\nПлощадь прямоугольника со сторонами " + a + " и " + b + " равна ";

        // Вычисление и вывод площанди через выражения
        double s = a * b;
        System.out.println("\n(площадь через выражение) " + area + "= " + s);

        // Вычисление и вывод площанди через функцию
        System.out.println("\n(площадь через функцию) " + area + "= " + area(a,b));
    }

    public static void text( String txt){
        System.out.println("\nHi, " + txt + ", it's first program!");
    }

    public static double area(double a, double b){
        return a * b;
    }
}