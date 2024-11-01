public class Mobil extends Kendaraan {
    private final int kapasitasMesin;

    public Mobil(String nomorPlat, String merk, int kapasitasMesin) {
        super(nomorPlat, merk);
        this.kapasitasMesin = kapasitasMesin;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Mobil " + getMerk() + " - Plat: " + getNomorPlat() + " - Kapasitas Mesin: " + kapasitasMesin + " cc");
    }
}