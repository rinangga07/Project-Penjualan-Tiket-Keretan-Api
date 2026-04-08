abstract class Pembayaran {

    public abstract void prosesBayar(double jumlah); //harus dipakai di semua kelas turunannya

    // method konkrit
    public void cetakStruk(double jumlah) {
        System.out.println("Total bayar: " + jumlah);
    }
}