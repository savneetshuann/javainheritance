package com.savneet.vehicle;

import com.savneet.Color;

public class Car extends Vehicle{
    Color color;

    public Car(String vin, String brand, boolean isInsured) {
        super(vin, brand, isInsured);
        this.color=color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
