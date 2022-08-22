package Adapter.Laptop;

import Adapter.ElectronicalDevices;
import Adapter.Laptop.Entity.Macbook;

public class MacbookEDAdapter implements ElectronicalDevices, Laptop {

    private Macbook macbook;

    public MacbookEDAdapter(Macbook macbook) {
        this.macbook = macbook;
    }

    @Override
    public String getDeviceBrand() {
        return macbook.getDeviceBrand();
    }

    @Override
    public String getDeviceModel() {
        return macbook.getDeviceModel();
    }

    @Override
    public int getDeviceCapacity() {
        return macbook.getDeviceCapacity();
    }

    @Override
    public String getDeviceNetworkConnectivity() {
        return macbook.getDeviceNetworkConnectivity();
    }

    @Override
    public String getCellularConnectivity() {
        return "Not cellular connectivity support for this device type";
    }
}
