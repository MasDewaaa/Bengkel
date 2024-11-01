public abstract class Kendaraan {
    private final String nomorPlat;
    private final String merk;

    public Kendaraan(String nomorPlat, String merk) {
        this.nomorPlat = nomorPlat;
        this.merk = merk;
    }

    public String getNomorPlat() {
        return nomorPlat;
    }

    public String getMerk() {
        return merk;
    }

    public abstract void tampilkanInfo();
}
