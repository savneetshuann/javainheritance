package com.savneet.employee;

import com.savneet.Gender;
import com.savneet.vehicle.Vehicle;

public class PartTime extends Faculty{
        double noHoursWorked;
        double payPerHours;


    public PartTime(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, double totalSalary) {
        super(id, firstName, lastName, gender, vehicle, totalSalary);
        this.noHoursWorked=noHoursWorked;
        this.payPerHours=payPerHours;

    }

    public double getNoHoursWorked() {
        return noHoursWorked;
    }

    public void setNoHoursWorked(double noHoursWorked) {
        this.noHoursWorked = noHoursWorked;
    }

    public double getPayPerHours() {
        return payPerHours;
    }

    public void setPayPerHours(double payPerHours) {
        this.payPerHours = payPerHours;
    }
}
