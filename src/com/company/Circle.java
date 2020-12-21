package com.company;

import java.util.Locale;

public class Circle extends Figure implements Moveable{
    private double radius;
    private static final double PI = Math.PI;
    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    @Override
    public void resize(double koeff) {
        radius *= koeff;
    }

    @Override
    public String toString() {
        return "Circle\n" + "Center: (" + String.format(Locale.US, "%.2f", x) + ", " + String.format(Locale.US, "%.2f", y) + ")\n" + "Radius: " + radius;
    }
}