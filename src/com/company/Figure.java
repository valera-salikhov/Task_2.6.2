package com.company;

public abstract class Figure {
    double x;
    double y;
    abstract double getArea();
    abstract double getPerimeter();
    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

}