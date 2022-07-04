package com.company.oops.polymorphism;

//dynamic/Runtime polymorphism with multiple  inheritance.
class shape {
    int length, breadth;
    float Area;

    shape(int length) {
        this.length = length;
    }

    public shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("Polymorphism class.");
    }

    public shape() {

    }

    void area() {
        System.out.println("I'm in Shape area function");
    }
    static void greeting(){
        System.out.println("Hey I'm in shape class, greetings!");
    }
}

class circle extends shape {
    int r;

    circle(int r) {
        super();
        this.r = r;
    }

    @Override
    void area() {
        Area = (float) (2 * 3.14 * this.r * this.r);

        System.out.println("I'm in circle area function" + " " + Area);
    }
//    overriding of static is not possible
    static void greeting(){
        System.out.println("Hey I'm in shape class, greetings!");
    }
}

class triangle extends shape {
    public triangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    void area() {
        int Area = (length + breadth) / 2;
        System.out.println("I'm in triangle area function" + " " + Area);
    }

    @Override
    public String toString() {
        return "triangle{" +
                "length=" + length +
                '}';
    }
}

class square extends shape {

    public square(int length) {
        super(length);
    }

    public square(int length, int breadth) {
        super(length, breadth);
    }

    void area() {
        Area = length * length;
        System.out.println("I'm in square area function." + " " + Area);
    }
}

public class polymorphism {
    public static void main(String[] args) {
//        square obj = new square(12, 45);
        shape obj1 = new shape(12, 650);
        shape.greeting();
//        obj1.area();
        circle obj2 = new circle(3);
        obj2.area();

        shape obj3 = new triangle(1, 5);
        System.out.println(obj3);

    }

}
