package com.company;

import java.util.ArrayList;

public class CarPark {

    public double totalCharges = 0;

    public ArrayList<CustomerCar> customerCars;

    public CarPark(ArrayList<CustomerCar> _customerCars) {

        customerCars = _customerCars;
    }

    public double CalculateParkingCharges() {

        for(CustomerCar customerCar : customerCars) {

            ParkingCharge pc1 = new ParkingCharge(customerCar.hoursParked);
            totalCharges += pc1.calculateCharges();
        }

        return totalCharges;
    }

}
