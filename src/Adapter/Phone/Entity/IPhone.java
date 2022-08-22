package Adapter.Phone.Entity;

import Adapter.ElectronicalDevices;

public class IPhone implements ElectronicalDevices {

    private String brand;
    private String model;
    private int capacity;
    private String cellularConnectivity;

    public IPhone(String brand, String model, int capacity, String cellularConnectivity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.cellularConnectivity = cellularConnectivity;
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

    public void setCellularConnectivity(String cellularConnectivity) {
        this.cellularConnectivity = cellularConnectivity;
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
    public String getCellularConnectivity() {
        return cellularConnectivity;
    }
}
