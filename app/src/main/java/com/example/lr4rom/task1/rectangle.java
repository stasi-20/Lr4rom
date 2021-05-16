package com.example.lr4rom.task1;


public class rectangle extends shape_1 {

        private double width;
        private double length;

        public rectangle(){
            width = 3.1;
            length = 4.2;
        }

        public rectangle(double width, double length){
            this.width = width;
            this.length = length;
        }

        public rectangle(double width, double length, String color, boolean filled){
            super(color, filled);
            this.width = width;
            this.length = length;
        }

        public double getWidth(){

            return this.width = width;
        }

        public void setWidth(double width){

            this.width = width;
        }

        public double getLength(){

            return this.width = width;
        }

        public  void setLength(double length){

            this.length = length;
        }

        public double getArea(){

            return length * width;
        }

        public double getPerimeter(){

            return width + length;
        }

        public String toString(){
            return "Прямоугольник цвета: " + getColor() + ", длиной: " + length + ", шириной: "+ width + ", площадью: "
                    + getArea() + ", периметром: "+ getPerimeter() +", заполненна: " + isFilled();
        }
    }

