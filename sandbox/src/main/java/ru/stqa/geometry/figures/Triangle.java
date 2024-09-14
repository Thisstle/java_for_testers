package ru.stqa.geometry.figures;

public class Triangle {
    public static void main(String[] args) {

        printPerimeterTriangle(5, 6, 7);
        printTriangleArea(9, 5, 6, 7);

    }


    public static void printPerimeterTriangle(double a, double b, double c) {
        double PerimeterTriangle;

        System.out.println("Периметр треугольника" + " = " + (a + b + c) / 2);
    }

    public static void printTriangleArea(double printPerimeterTriangle, double a, double b, double c) {
        double TriangleArea;


        System.out.println("Площадь треугольника" + "=" + (printPerimeterTriangle* (printPerimeterTriangle - a) * (printPerimeterTriangle - b) * (printPerimeterTriangle - c)));
    }

    public static double TriangleArea(double PerimeterTriangle){
        double a = 5;
        double b = 6;
        double c = 7;
        return PerimeterTriangle * (PerimeterTriangle - a) * (PerimeterTriangle - b) * (PerimeterTriangle - c);

    }
    public static double PerimeterTriangle(double a, double b, double c) {
    return a;
    }
}
