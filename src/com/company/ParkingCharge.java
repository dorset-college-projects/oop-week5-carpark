package com.company;

public class ParkingCharge {

    private double totalHours = 0;
    private final double minimumFee = 2.0;
    private final double additionalFee = 0.5;
    private final double maxCharge = 10.00;
    private double totalFee = 0;

    public ParkingCharge(double _totalHours) {
        totalHours = _totalHours;
    }

    public double calculateCharges() {

        if (totalHours <= 3) {
            totalFee = minimumFee;

        } else if (totalHours > 3 && totalHours < 19) {
            totalFee = minimumFee + ((totalHours - 3) * additionalFee);

        } else {

            totalFee = maxCharge;
        }

        return totalFee;
    }

}
