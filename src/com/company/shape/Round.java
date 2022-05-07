package com.company.shape;

import java.util.ArrayList;

public class Round extends Shape {
    private ArrayList<Point>points;
    String color;
double radius;

    public Round(ArrayList<Point> points, String color, double radius) {
        this.points = points;
        this.color = color;
        this.radius = points.get(1).getX()-points.get(0).getX()+points.get(1).getY()-points.get(2).getY();
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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Round round = (Round) o;

        if (Double.compare(round.radius, radius) != 0) return false;
        if (points != null ? !points.equals(round.points) : round.points != null) return false;
        return color != null ? color.equals(round.color) : round.color == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = points != null ? points.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем круг "+ color+"цвета и с точками "+points.toString()+"радиус"+radius);
    }
}
