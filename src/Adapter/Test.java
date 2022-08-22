package Adapter;

import Adapter.Laptop.Entity.Macbook;
import Adapter.Laptop.MacbookEDAdapter;
import Adapter.Phone.Entity.IPhone;

public class Test {

    public static void main(String[] args) {

        CellularConnection cellularConnection = new CellularConnection();

        IPhone iPhone = new IPhone("Apple", "IPhone 14 Pro Max", 128, "5G");

        cellularConnection.getCellularConnectionType(iPhone);

        Macbook macbook = new Macbook("Apple", "Macbook Pro", 1024, "802.11AC");

        MacbookEDAdapter macbookEDAdapter = new MacbookEDAdapter(macbook);

        cellularConnection.getCellularConnectionType(macbookEDAdapter);

        System.out.println("Model " + macbookEDAdapter.getDeviceModel() + " " + macbookEDAdapter.getCellularConnectivity());
        System.out.println("Model " + iPhone.getDeviceModel() + " " + iPhone.getCellularConnectivity());
    }
}
