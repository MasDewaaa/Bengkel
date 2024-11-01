import java.util.ArrayList;

public class Servis {
    private Kendaraan kendaraan;
    private Pelanggan pelanggan;
    private ArrayList<Layanan> layananList;

    public Servis(Kendaraan kendaraan, Pelanggan pelanggan) {
        this.kendaraan = kendaraan;
        this.pelanggan = pelanggan;
        this.layananList = new ArrayList<>();
    }

    public void tambahLayanan(Layanan layanan) {
        layananList.add(layanan);
    }

    @Override
    public String toString() {
        StringBuilder hasil = new StringBuilder("Servis Kendaraan: " + kendaraan.getMerk() + " - Plat: " + kendaraan.getNomorPlat() + "\n" + pelanggan + "\nLayanan:");
        for (Layanan layanan : layananList) {
            hasil.append("\n - ").append(layanan);
        }
        return hasil.toString();
    }
}
