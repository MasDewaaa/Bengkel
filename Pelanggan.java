public class Pelanggan {
    private String nama;
    private String nomorTelepon;

    public Pelanggan(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    @Override
    public String toString() {
        return "Pelanggan: " + nama + " - Nomor Telepon: " + nomorTelepon;
    }
}
