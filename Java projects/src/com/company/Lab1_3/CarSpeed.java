package com.company.Lab1_3;

public class CarSpeed {

    public CarSpeed(String color, String type, String fuel, int maxSpeed) {
        this.car = new Car(color, type, fuel, maxSpeed);
    }

    public int getMaxSpeed()
    {
        return car.getMaxSpeed();
    }

    public void showCarName()
    {
        System.out.println(car.getCarName());
    }

    private Car car;
}