package com.company;

import java.util.Locale;

public class Rectangle extends Figure implements Moveable{
    private double height = 0;
    private double width = 0;

    Rectangle(double x, double y, double height, double width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return (height * width);
    }

    @Override
    public double getPerimeter() {
        return 2 * (height + width);
    }

    @Override
    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    @Override
    public void resize(double koeff) {
        height *= koeff;
        width *= koeff;
    }

    private double centerX() {
        return (x + width / 2);
    }

    private double centerY() {
        return (y + height / 2);
    }

    @Override
    public String toString() {
        return "Rectangle\n" + "Center: (" + String.format(Locale.US, "%.2f", this.centerX()) + ", " + String.format(Locale.US, "%.2f", this.centerY()) + ")\n" + "Height: " + height + "\n" + "Width: " + width;
    }
}