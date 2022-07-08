package com.company.interfaces;

public class powerEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Power ENGINE starts");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine stops");
    }

    @Override
    public void acc() {
        System.out.println("Power engine accelerate");
    }
}
