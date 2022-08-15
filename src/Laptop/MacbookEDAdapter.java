package Laptop;

import Adaptor.ElectronicalDevices;

public class MacbookEDAdapter implements ElectronicalDevices,Laptop {

    private Macbook macbook;

    public MacbookEDAdapter(Macbook macbook){
        this.macbook=macbook;
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
    public String getNetworkConnectivity() {
        return macbook.getNetworkConnectivity();
    }

    @Override
    public String getCellularConnectivity() {
        return "No connection support";
    }



}
