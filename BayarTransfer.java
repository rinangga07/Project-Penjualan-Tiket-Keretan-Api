class BayarTransfer extends Pembayaran {

    @Override
    public void prosesBayar(double jumlah) {
        System.out.println("Pembayaran transfer sebesar: " + jumlah);
    }
}