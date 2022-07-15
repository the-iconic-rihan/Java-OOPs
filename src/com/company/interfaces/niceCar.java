package com.company.interfaces;

public class niceCar {
    private Engine engine;
    private final Media player = new CDPlayer();

    public niceCar() {
        engine = new powerEngine();
    }

    public niceCar(Engine engine) {
        this.engine = engine;
//        System.out.println(this.engine);
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void updtageEngine(Engine engine) {
        this.engine = engine;
        System.out.println("Electric engine started");
    }
}
