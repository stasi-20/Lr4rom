package com.example.lr4rom.task1;

public class triangle extends shape_1 {
    private int base;
    private int height;

    public triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Основание треугольника: " + base + " Высота треугольника: " + height +
                ", подкласс: " + super.toString() + ", площадь: " + getArea();
    }

    @Override
    public double getArea()
    {
        return 0.5 * base * height;
    }
}


