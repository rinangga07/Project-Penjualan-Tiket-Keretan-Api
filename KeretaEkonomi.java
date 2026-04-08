class KeretaEkonomi extends KeretaApi {

    public KeretaEkonomi(String namaKereta) {
        super(namaKereta, "Ekonomi"); //manggil konstruktor dari class parent
    }

    @Override
    public double hitungHarga(double hargaDasar) {
        return hargaDasar + 7000;
    }
}