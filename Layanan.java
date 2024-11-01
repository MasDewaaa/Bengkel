public abstract class Layanan {
    private final String namaLayanan;

    public Layanan(String namaLayanan) {
        this.namaLayanan = namaLayanan;
    }

    public String getNamaLayanan() {
        return namaLayanan;
    }

    public abstract double hitungBiaya();
}

class PerbaikanMesin extends Layanan {
    private final double biaya;

    public PerbaikanMesin(double biaya) {
        super("Perbaikan Mesin");
        this.biaya = biaya;
    }

    @Override
    public double hitungBiaya() {
        return biaya;
    }

    @Override
    public String toString() {
        return getNamaLayanan() + " - Biaya: Rp" + biaya;
    }
}

class PenggantianOli extends Layanan {
    private final double biayaOli;
    private final double biayaServis;

    public PenggantianOli(double biayaOli, double biayaServis) {
        super("Penggantian Oli");
        this.biayaOli = biayaOli;
        this.biayaServis = biayaServis;
    }

    public PenggantianOli(double biayaOli, double biayaServis, String namaLayanan) {
        super(namaLayanan);
        this.biayaOli = biayaOli;
        this.biayaServis = biayaServis;
    }

    @Override
    public double hitungBiaya() {
        return biayaOli + biayaServis;
    }

    @Override
    public String toString() {
        return getNamaLayanan() + " - Biaya Total: Rp" + hitungBiaya();
    }

    public double getBiayaServis() {
        return biayaServis;
    }
}
