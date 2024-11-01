public class Main {
    public static void main(String[] args) {
        Bengkel bengkel = new Bengkel();

        Pelanggan pelanggan1 = new Pelanggan("Dewa Fitriansyah", "085878069549");
        Mobil mobil1 = new Mobil("AB 841 ZB", "Yamaha", 5000);

        bengkel.tambahPelanggan(pelanggan1);
        bengkel.tambahKendaraan(mobil1);

        Servis servis1 = new Servis(mobil1, pelanggan1);
        servis1.tambahLayanan(new PerbaikanMesin(250000));
        servis1.tambahLayanan(new PenggantianOli(75000, 80000));

        bengkel.catatServis(servis1);
        bengkel.tampilkanRiwayatServis();
    }
}
