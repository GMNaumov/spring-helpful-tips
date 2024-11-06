package com.ngm.projects;

public class ElectricEngine implements Engine {
    private int power;

    @Override
    public void starting() {
        System.out.println("Silence and eco-friendly. Power is: " + power);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
