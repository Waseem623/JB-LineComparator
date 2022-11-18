package org.example;

public class Line implements Comparable<Line> {
    int x1;
    int y1;
    int x2;
    int y2;
    double length;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public double getLength() {
        return length;
    }

    @Override
    public boolean equals(Object obj) {
        Line lineObj = ((Line) obj);
        return this.length == lineObj.length;
    }

    @Override
    public int compareTo(Line lineObj) {
        return Double.compare(this.length, lineObj.length);
    }
}