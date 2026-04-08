class Transaksi {
    private Penumpang penumpang;
    private Tiket tiket;
    private KeretaApi kereta;

    public Transaksi(Penumpang penumpang, Tiket tiket, KeretaApi kereta) {
        this.penumpang = penumpang;
        this.tiket = tiket;
        this.kereta = kereta;
    }
 
    public void munculkanDetailTransaksi() {
        double hargaAwal = kereta.hitungHarga(tiket.getHarga());
        double hargaAkhir = hargaAwal;

        System.out.println("=== CATATAN TRANSAKSI ===");
        System.out.println("Nama: " + penumpang.getNama());
        System.out.println("No Identitas: " + penumpang.getNoIdentitas());
        System.out.println("Kereta: " + kereta.namaKereta);
        System.out.println("Jenis: " + kereta.jenisKereta);
        System.out.println("Tujuan: " + tiket.getTujuan());
        System.out.println("=== DETAIL PEMBAYARAN ===");
        System.out.println("Harga sebelum diskon: " + hargaAwal);
  
        // TiketPromo
        if (tiket instanceof TiketPromo) {
            TiketPromo tp = (TiketPromo) tiket;
            hargaAkhir = tp.hitungHargaSetelahDiskon(hargaAwal);

            System.out.println("Diskon: " + tp.getDiskon() + "%");
            System.out.println("Harga setelah diskon: " + hargaAkhir);
        }
    }

    public double getTotalHarga() {
        double hargaAwal = kereta.hitungHarga(tiket.getHarga());

        if (tiket instanceof TiketPromo) {
            TiketPromo tp = (TiketPromo) tiket;
            return tp.hitungHargaSetelahDiskon(hargaAwal);
        }

        return hargaAwal;
    }
}