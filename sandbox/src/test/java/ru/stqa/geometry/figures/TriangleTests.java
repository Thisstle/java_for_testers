package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculateArea() {
        double result = Triangle.TriangleArea(9.0);
        Assertions.assertEquals(216.0, result);
    }
}

