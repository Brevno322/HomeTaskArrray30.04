package com.company.shape;

import java.util.ArrayList;

public class Rectangle extends Shape {

    private ArrayList<Point>points;
    String color;

    public Rectangle(ArrayList<Point> points, String color) {
        this.points = points;
        this.color = color;
    }


    public ArrayList<Point> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (points != null ? !points.equals(rectangle.points) : rectangle.points != null) return false;
        return color != null ? color.equals(rectangle.color) : rectangle.color == null;
    }

    @Override
    public int hashCode() {
        int result = points != null ? points.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
    @Override
    public void draw() {
        System.out.println("Рисуем многоугольник "+ color+"цвета и с точками "+points.toString());
    }
}
