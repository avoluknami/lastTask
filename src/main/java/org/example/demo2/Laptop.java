package org.example.demo2;

import javafx.fxml.FXML;

public class Laptop extends Device {
    private int ramSize;
    private String processorType;

    public Laptop(String name, double price, double weight, int ramSize, String processorType) {
        super(Devicetype.LAPTOP, name, price, weight);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    // Getters and setters
    public int getRamSize() { return ramSize; }
    public String getProcessorType() { return processorType; }

    public void setRamSize(int ramSize) { this.ramSize = ramSize; }
    public void setProcessorType(String processorType) { this.processorType = processorType; }

    @FXML
    public String toString() {
        return super.toString() + String.format(", RAM Size: %d GB, Processor: %s", ramSize, processorType);
    }
}

