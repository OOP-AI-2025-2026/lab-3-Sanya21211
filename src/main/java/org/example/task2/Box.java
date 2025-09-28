package org.example.task2;

public class Box {
    private int length;
    private int width;
    private int height;

    public Box(int length, int width, int height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    public double surfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    public double lateralSurfaceArea() {
        return 2 * height * (length + width);
    }

    public double volume() {
        return length * width * height;
    }

    private void setLength(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException();
        }
        this.length = length;
    }

    private void setWidth(int width) {
        if (width <= 0) {
            throw new IllegalArgumentException();
        }
        this.width = width;
    }

    private void setHeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException();
        }
        this.height = height;
    }

}