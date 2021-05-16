package com.example.lr4rom.task3;

public abstract class shape_3 {
    private String color;
    private boolean filled;

    public shape_3 (){
        this.color = "red";
        this.filled = true;
    }

    public shape_3 (String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public shape_3 ( String color) {
    }


    public String getColor(){
        return color;
    }

    public void setColor(String color){

        this.color = color;
    }

    public boolean isFilled(){

        return this.filled;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    public abstract double getArea();

    @Override
    public String toString(){

        return "Фигура цвета: " + color + ", заполнена: " + filled;
    }
}
