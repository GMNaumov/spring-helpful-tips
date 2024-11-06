package com.ngm.projects;

public class Car implements Vehicle{
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        System.out.println("Car has started!");

        engine.starting();
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped");
    }
}
