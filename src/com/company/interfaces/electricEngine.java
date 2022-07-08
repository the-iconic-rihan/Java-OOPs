package com.company.interfaces;

public class electricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Electric engine starts.");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine stops.");
    }

    @Override
    public void acc() {
        System.out.println("Electric Engine accelerate.");
    }
}
