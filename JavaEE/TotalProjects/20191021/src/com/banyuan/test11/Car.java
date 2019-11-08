package com.banyuan.test11;

import java.awt.*;

public class Car {
    private String name;
    private double speed;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}

interface GPS {
    Point getLocation();
}

class GPSCar extends Car implements GPS {
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(",坐标：(" + getLocation().x + "," + getLocation().y + ")");
        return sb.toString();
    }

    @Override
    public Point getLocation() {
        Point point = new Point();
        point.setLocation(super.getSpeed(), super.getSpeed());

        return point;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println("自定义普通的汽车");
        Car car = new Car();
        car.setName("Adui");
        car.setSpeed(60);
        System.out.println(car);
        System.out.println("自定义GPS汽车");

        GPSCar gpsCar=new GPSCar();
        gpsCar.setName("Audi");
        gpsCar.setSpeed(60);
        System.out.println(gpsCar);
    }
}
