package com.example.lr4rom.task2;

public class circle extends shape_2 {

    private double radius;

    public circle(){

        radius = 5.3;
    }
    public circle (double radius){

        this.radius = radius;
    }

    public circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){

        return this.radius = radius;
    }

    public void setRadius(double radius){

        this.radius = radius;
    }


    public double getArea()
    {
        return 3.14 * radius * radius;
    }

    public double getPerimeter(){

        return 2 * 3.14 * radius;
    }

    @Override
    public String toString(){
        return "Круг цвета: " + getColor() + ", с радиусом: " + getRadius() + ", площадью: "+ getArea() + ", периметром: "
                + getPerimeter() + ", заполненна:  " + isFilled();
    }
}
