package com.company.Lab1_3;

public class Car {
    public Car(String color, String type, String fuel, int maxSpeed)
    {
        this.color = color;
        this.type = type;
        this.fuel = fuel;
        this.maxSpeed = maxSpeed;
    }

    public String getCarName() {
        return "I am " + this.color + " " + this.type + ". Fill me up with " + this.fuel + "!";
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    private String color;
    private String type;
    private String fuel;
    private int maxSpeed;
}
