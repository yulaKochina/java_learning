package ru.yuko.java_learning.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        // Опробовала использование выражений
        String text = "Hello, world!";
        System.out.println("\nIt's my first program! " + text);

        // Вызвала функцию осуществляющую вывод текста с использованием значения передаваемого фукции
        String txt = "Yuliya";
        text(txt);

        // Определила значения переменных
        Square s = new Square(4);
        double a = 3;
        double b = 5;

        // Вычисление и вывод площади через выражения
        double sRictangle = a * b;
        System.out.println("\n(площадь прямоугольника через выражение) " + "\nПлощадь прямоугольника со сторонами " + a + " и " + b + " равна " + "= " + sRictangle);

        // Вычисление и вывод площади через функцию
        System.out.println("\n(площадь квадрата через функцию) " + "\nПлощадь квадрата со стороной " + s.l + " равна " + "= " + s.area());
    }

    public static void text( String txt){
        System.out.println("\nHi, " + txt + ", it's first program!");
    }

    public static double area(double a, double b){
        return a * b;
    }


}