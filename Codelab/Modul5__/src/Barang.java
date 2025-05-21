public class Barang {
    private String nama;
    private int stok;

    // Constructor untuk inisialisasi nama dan stok
    public Barang(String nama, int stok) {
        this.nama = nama;
        this.stok = stok;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk stok
    public int getStok() {
        return stok;
    }

    // Setter untuk stok
    public void setStok(int stok) {
        this.stok = stok;
    }
}


