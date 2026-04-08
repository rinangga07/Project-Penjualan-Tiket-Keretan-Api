public class TiketPromo extends Tiket implements Diskon {

    private double diskon;

    @Override
    public double hitungDiskon(double harga) {
        return harga * (diskon / 100);
    }

    public TiketPromo(String id, String tujuan, double harga, double diskon) {
        super(id, tujuan, harga);
        this.diskon = diskon;
    }

    public double hitungHargaSetelahDiskon(double hargaAwal) {
        return hargaAwal - (hargaAwal * diskon / 100);
    }

    public double getDiskon() {
        return diskon;
    }
}