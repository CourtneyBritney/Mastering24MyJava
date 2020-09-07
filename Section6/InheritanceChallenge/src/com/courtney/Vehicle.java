package com.courtney;

public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int CurrentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.CurrentDirection = 0;
    }

    public void steer(int direction) {
        this.CurrentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + CurrentDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        CurrentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + CurrentDirection);

    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return CurrentDirection;
    }

    public void stop() {
        this.currentVelocity = 0;
    }
}
