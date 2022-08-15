import Adaptor.CellularConnection;
import Laptop.Macbook;
import Laptop.MacbookEDAdapter;
import Phone.IPhone;

public class Test {
    public static void main(String[] args) {
        CellularConnection cellularConnection = new CellularConnection();

        IPhone iPhone = new IPhone("Apple","14 Pro-Max", 256, "5G");
        cellularConnection.getCellularConnectionType(iPhone);

        Macbook macbook = new Macbook("Apple","M1",1024,"802.AC");
        MacbookEDAdapter macbookEDAdapter= new MacbookEDAdapter(macbook);
        cellularConnection.getCellularConnectionType(macbookEDAdapter);

        System.out.println(macbookEDAdapter.getCellularConnectivity());
    }
}
