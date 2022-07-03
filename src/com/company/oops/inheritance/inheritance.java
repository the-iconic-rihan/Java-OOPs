package com.company.oops.inheritance;

class Box {
    //    parent class variables
    int l, b, h;
    double side;

    public Box() {
        System.out.println("I'm non parameter constructor of Box class");

    }

    public Box(double side) {
        this.side = side;
    }

    Box(int l, int b, int h) {
        System.out.println("I'm  parameter constructor of BOX Class");

        this.l = -l;
        this.b = b;
        this.h = h;
    }

    public Box(Box old) {
        System.out.println("I'm copy parameter constructor of Box class");
        this.side = old.side;
        this.l = old.l;
        this.b = old.b;
        this.h = old.h;
    }
}

class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        super();
        System.out.println("I'm non parameter constructor of BoxWeight");
    }

    public BoxWeight(int l, int b, int h, double weight) {
        super(l, b, h);
        System.out.println("I'm parameter constructor of BoxWeight");
        this.weight = weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(BoxPrice other) {
        super(other);
        System.out.println("I'm copy constructor of BoxWeight");

    }
}

class BoxPrice extends BoxWeight {
    float price;

    BoxPrice() {
        super();
        System.out.println("I'm non parameter constructor of BoxPrice");

    }

    BoxPrice(double side, float price, double weight) {
        super(side, weight);
        System.out.println("constructor of side and weight");

        this.price = price;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        System.out.println("I'm copy constructor of BoxPrice");
        this.price = -1;
    }

    public BoxPrice(int l, int b, int h, double weight, float price) {
        super(l, b, h, weight);
        System.out.println("I'm parameter constructor of BoxPrice");
        this.price = price;
    }
}

public class inheritance {
    public static void main(String[] args) {
//        calling non parameterized constructor.
//        BoxPrice box = new BoxPrice();
        //        calling parameterized constructor.
//        BoxPrice box1 = new BoxPrice(12, 1, 4, 45.23, 63.120f);
//        calling copy constructor.
//        BoxPrice box2 = new BoxPrice(box1);
        BoxPrice box3 = new BoxPrice(5, 8, 320);
    }
}
