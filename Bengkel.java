import java.util.ArrayList;

public class Bengkel {
    private final ArrayList<Kendaraan> kendaraanList;
    private final ArrayList<Pelanggan> pelangganList;
    private final ArrayList<Servis> riwayatServis;

    public Bengkel() {
        kendaraanList = new ArrayList<>();
        pelangganList = new ArrayList<>();
        riwayatServis = new ArrayList<>();
    }

    public void tambahKendaraan(Kendaraan kendaraan) {
        kendaraanList.add(kendaraan);
    }

    public void tambahPelanggan(Pelanggan pelanggan) {
        pelangganList.add(pelanggan);
    }

    public void catatServis(Servis servis) {
        riwayatServis.add(servis);
    }

    public void tampilkanRiwayatServis() {
        for (Servis servis : riwayatServis) {
            System.out.println(servis);
        }
    }
}
