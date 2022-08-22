package Adapter.Laptop.Entity;

import Adapter.Laptop.Laptop;

public class Macbook implements Laptop {

    private String brand;
    private String model;
    private int capacity;
    private String networkConnectivity;

    public Macbook(String brand, String model, int capacity, String networkConnectivity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.networkConnectivity = networkConnectivity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setNetworkConnectivity(String networkConnectivity) {
        this.networkConnectivity = networkConnectivity;
    }

    @Override
    public String getDeviceBrand() {
        return brand;
    }

    @Override
    public String getDeviceModel() {
        return model;
    }

    @Override
    public int getDeviceCapacity() {
        return capacity;
    }

    @Override
    public String getDeviceNetworkConnectivity() {
        return networkConnectivity;
    }
}
