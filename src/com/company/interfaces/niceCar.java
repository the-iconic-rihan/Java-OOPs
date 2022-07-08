package com.company.interfaces;

public class niceCar {
    private Engine engine;
    private Media player = new CDPlayer();

    public niceCar() {
        engine = new powerEngine();
    }

    public niceCar(Engine engine) {
        this.engine = engine;
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

    public void updtageEngine(Engine engne) {
        this.engine = engine;
        System.out.println("Electric engine started");
    }
}
