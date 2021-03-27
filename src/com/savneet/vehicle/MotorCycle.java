package com.savneet.vehicle;

public class MotorCycle extends Vehicle{
    int noOFSeats;

    public MotorCycle(String vin, String brand, boolean isInsured) {
        super(vin, brand, isInsured);
        this.noOFSeats=noOFSeats;
    }

    public int getNoOFSeats() {
        return noOFSeats;
    }

    public void setNoOFSeats(int noOFSeats) {
        this.noOFSeats = noOFSeats;
    }
}
