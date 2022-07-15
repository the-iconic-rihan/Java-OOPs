package com.company.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.acc();
//        car.start();
//        car.stop();

        niceCar car = new niceCar();
        niceCar car1 = new niceCar();
        car.start();
        car.startMusic();
        car.stopMusic();
        car.stop();
        car.updtageEngine(new electricEngine());
    }
}
