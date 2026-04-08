class Tiket {
    private String idTiket;
    private String tujuan;
    private double harga;

    public Tiket(String idTiket, String tujuan, double harga) {
        this.idTiket = idTiket;
        this.tujuan = tujuan;
        this.harga = harga;
    }

    public String getIdTiket() {
        return idTiket;
    }

    public void setIdTiket(String idTiket) {
        this.idTiket = idTiket;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}