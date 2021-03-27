package com.savneet.employee;

import com.savneet.Gender;
import com.savneet.vehicle.Vehicle;

public class FullTime extends Faculty {
   double bonus;
    public FullTime(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, double totalSalary) {
        super(id, firstName, lastName, gender, vehicle, totalSalary);
        this.bonus=bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
