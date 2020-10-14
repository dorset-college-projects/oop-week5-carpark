package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here

    //    ParkingCharge pc1 = new ParkingCharge(4);

        // Customer Cars
        CustomerCar c1 = new CustomerCar("BAT 1", 5);
        CustomerCar c2 = new CustomerCar("SPIDER 1", 15);
        CustomerCar c3 = new CustomerCar("HULK 1", 2);
        CustomerCar c4 = new CustomerCar("WONDER W 1", 24);
        CustomerCar c5 = new CustomerCar("SUPER 1", 18);

        //Add them to a list
        ArrayList<CustomerCar> listOfCustomerCars = new ArrayList<CustomerCar>();

        listOfCustomerCars.add(c1);
        listOfCustomerCars.add(c2);
        listOfCustomerCars.add(c3);
        listOfCustomerCars.add(c4);
        listOfCustomerCars.add(c5);

        //Pass the list of cars to the car park
        CarPark cp = new CarPark(listOfCustomerCars);

        double totalCharges = cp.CalculateParkingCharges();

        System.out.println("Total Charges is " + totalCharges);

    }
}
