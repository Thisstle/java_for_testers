package ru.stqa.geometry.figures;

public class Triangle {
    public static void main(String[] args) {
double a = 3.0;
double b = 4.0;
double c = 5.0;

double area = TriangleArea(a, b, c);
printTriangle(area);
    }

    public static void printTriangle(double area) {
        String text = String.format("Площадь треугольника =  %.2f%n", area);
        System.out.println(text);
    }



    public static double TriangleArea(double a, double b, double c) {
        double s = (a + b + c) /2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }



    }

