package org.example.task2;

public class IntStack {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public IntStack() {
        elements = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    public void push(int value) {
        if (size == elements.length) {
            grow();
        }
        elements[size++] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return elements[--size];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return elements[size - 1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        elements = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    private void grow() {
        int[] newArray = new int[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }
}