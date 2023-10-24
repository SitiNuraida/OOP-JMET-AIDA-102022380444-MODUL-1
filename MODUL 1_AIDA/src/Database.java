import java.util.List;
import java.util.ArrayList;

public class Database {

    // TODO: Create List of Konser Object to Store Konser from Konser Class
    List<Konser> ListKonser = new ArrayList<>();

    // TODO: Create Method to insert Konser to Database
    public void insertKonser(Konser konser) {
        ListKonser.add(konser);
    }

    // TODO: Create Method to Show Konser from Database
    public void showKonser(Konser konser) {
        System.out.println("1. " + bandname.getName());
        System.out.println("Tanggal Konser: " + date.getName());
        System.out.println("Lokasi: " + location.getName());
        System.out.println("Harga Tiket " + ticketprice.getName());

    }

    // TODO: Create Method to Buy Ticket and Show the Total Price

}
