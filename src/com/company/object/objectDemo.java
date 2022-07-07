package com.company.object;

public class objectDemo {
    int num;

    public objectDemo(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() {
//        unique random number
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        objectDemo obj = new objectDemo(45);
        System.out.println(obj.hashCode());
    }
}
