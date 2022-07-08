package com.company.interfaces;

public interface Engine {
    static final int PRICE = 458632;

    void start();

    void stop();

    void acc();
}

interface Brake {
    void brake();
}

interface Media {
    void start();

    void stop();
}

class Car implements Engine, Brake, Media {
    @Override
    public void start() {
        System.out.println("I start engine like a normal car.");
    }

    @Override
    public void stop() {
        System.out.println("I STOP engine like normal car.");
    }

    @Override
    public void acc() {
        System.out.println("I'm accounts.");
    }

    @Override
    public void brake() {
        System.out.println("I decrease the speed like a normal car");
    }
}