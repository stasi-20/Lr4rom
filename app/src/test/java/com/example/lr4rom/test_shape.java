package com.example.lr4rom;

import com.example.lr4rom.task1.rectangle;
import com.example.lr4rom.task1.shape_1;
import com.example.lr4rom.task2.circle;
import com.example.lr4rom.task2.shape_2;
import com.example.lr4rom.task2.square;
import com.example.lr4rom.task3.shape_3;

import org.junit.Test;

public class test_shape {
    @Test
    public void test_shape(){

        shape_1 s1 = new shape_1() {
            @Override
            public double getArea() {
                return 0;
            }
        };
        shape_2 s2 = new shape_2() {
            @Override
            public double getArea() {
                return 0;
            }
        };
        shape_3 s3 = new shape_3() {
            @Override
            public double getArea() {
                return 0;
            }
        };
        System.out.println("S1 = " + s1);

        circle c1 = new circle();
        System.out.println("C1 = " + c1);

        rectangle r1 = new rectangle();
        System.out.println("R1: " + r1);

        square square1 = new square();
        System.out.println("square1 = "+ square1);
    }
}
