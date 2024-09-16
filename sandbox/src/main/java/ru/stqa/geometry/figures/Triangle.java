package ru.stqa.geometry.figures;

public class Triangle {
    public static void main(String[] args) {
double a = 3.0;
double b = 4.0;
double c = 5.0;
double s = Pr(a, b, c);
double area = TriangleArea(a, b, c, s);
printTriangle(area, b, c);
    }

    public static void printTriangle(double area, double b, double c) {
        String text = String.format("Площадь треугольника =  %.2f%n", area);
        System.out.println(text);
    }

    public static double TriangleArea(double a, double b, double c, double s) {
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }


    public static double Pr(double a, double b, double c) {
        return (a + b + c) / 2;
    }

}