package com.company.generics;

import java.util.Arrays;

public class CustomArraylist<T> {
    //    Declare an array with default size 10
    private Object[] data;
    final private static int DEFAULT_SIZE = 10;
    private int size = 0;

    //assigning the size to custom array list .Initializing array with size
    public CustomArraylist() {
        this.data = new Object[DEFAULT_SIZE];
    }

    //    creating add method.
    public void add(T num) {
//        check if array is full or not if yes resize or add element
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {

        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
//        copy the element to new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    //removing the element
    public T remove() {
        return (T) data[--size];
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArraylist<String> list = new CustomArraylist<>();
        list.add("guy");
        list.add("nlk");
        list.add("ftyui");
//        for (int i = 0; i < 12; i++) {
//            list.add(i);
//        }
        System.out.println(list);
    }
}
