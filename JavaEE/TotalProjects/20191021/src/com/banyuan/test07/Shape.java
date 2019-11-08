package com.banyuan.test07;

public abstract class Shape {
    public String getName() {
        return this.getClass().getSimpleName();
    }

    public abstract double getArea();//获得图形面积
}
