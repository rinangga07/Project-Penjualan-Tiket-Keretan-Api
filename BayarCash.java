class BayarCash extends Pembayaran {

    @Override
    public void prosesBayar(double jumlah) {
        System.out.println("Pembayaran cash sebesar: " + jumlah);
    }
}