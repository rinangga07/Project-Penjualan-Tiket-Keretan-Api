class KeretaBisnis extends KeretaApi {

    public KeretaBisnis(String namaKereta) {
        super(namaKereta, "Kereta Bisnis"); //manggil konstruktor dari class parent
    }

    @Override
    public double hitungHarga(double hargaDasar) {
        return hargaDasar + 50000; // buat gaji gibran
    }
}