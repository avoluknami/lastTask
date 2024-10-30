package org.example.demo2;

public class Smartphone extends Device {

        private String name;
        private double price;
        private double weight;
        private double batteryCapacity; // e.g., in mAh
        private double storage; // e.g., in GB

        // Default constructor
        public Smartphone() {
            this.name = "Unknown";
            this.price = 0.0;
            this.weight = 0.0;
            this.batteryCapacity = 0.0;
            this.storage = 0.0;
        }

        // Parameterized constructor
        public Smartphone(String name, double price, double weight, double batteryCapacity, double storage) {
            this.name = name;
            this.price = price;
            this.weight = weight;
            this.batteryCapacity = batteryCapacity;
            this.storage = storage;
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public double getBatteryCapacity() {
            return batteryCapacity;
        }

        public void setBatteryCapacity(double batteryCapacity) {
            this.batteryCapacity = batteryCapacity;
        }

        public double getStorage() {
            return storage;
        }

        public void setStorage(double storage) {
            this.storage = storage;
        }

        // toString method for displaying smartphone information
        @Override
        public String toString() {
            return "Smartphone{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", weight=" + weight +
                    " kg, batteryCapacity=" + batteryCapacity +
                    " mAh, storage=" + storage +
                    " GB" +
                    '}';
        }
    }


