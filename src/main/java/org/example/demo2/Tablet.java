package org.example.demo2;

import javafx.fxml.FXML;

public class Tablet extends Device {
    private double batteryLife;
    private boolean hasStylus;

    public Tablet(String name, double price, double weight, double batteryLife, boolean hasStylus) {
        super(Devicetype.TABLET, name, price, weight);
        this.batteryLife = batteryLife;
        this.hasStylus = hasStylus;
    }

    // Getters and setters
    public double getBatteryLife() { return batteryLife; }
    public boolean isHasStylus() { return hasStylus; }

    public void setBatteryLife(double batteryLife) { this.batteryLife = batteryLife; }
    public void setHasStylus(boolean hasStylus) { this.hasStylus = hasStylus; }

    @FXML
    public String toString() {
        return super.toString() + String.format(", Battery Life: %.2f hours, Has Stylus: %s", batteryLife, hasStylus);
    }
}

