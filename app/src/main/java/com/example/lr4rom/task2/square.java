package com.example.lr4rom.task2;

public class square extends shape_2 {

    private double side;

    public square(){
        side = 4.3;
    }

    public square(double side){
        this.side = side;
    }

    public square (double side, String color, boolean filled){
        super(color, filled);
        this.side = side;
    }

    public double getSide(){
        return this.side = side;
    }

    public void setSide(double side){
        this.side = side;
    }

    public void setWidth(double side){
        this.side = side;
    }

    public void setLength(double side){
        this.side = side;
    }

    @Override
    public double getArea(){
        return side * side;
    }

    public String toString(){
        return "Квадрат цвета: " + getColor() + ", длиной: " + getSide() + ", шириной: "+ getSide() + ", заполненна:  " + isFilled();
    }
}
