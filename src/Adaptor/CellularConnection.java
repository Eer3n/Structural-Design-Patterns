package Adaptor;

public class CellularConnection {
    public String getCellularConnectionType(ElectronicalDevices electronicalDevices){
        return electronicalDevices.getCellularConnectivity();
    }
}
