package App;

import Perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        // Membuat objek buku
        Buku buku1 = new NonFiksi("Madilog", "Tan Malaka", "Sejarah & Ilmu Pengetahuan");
        Buku buku2 = new Fiksi("Hainuwele: Sang Putri Kelapa", "Lilis Hu", "Dongeng");

        // Menampilkan informasi buku
        buku1.displayInfo();
        buku2.displayInfo();
        System.out.println();

        // Membuat objek anggota
        Anggota anggota1 = new Anggota("Mahligai Arsya Nanda", "Informatika 2B");
        Anggota anggota2 = new Anggota("Farid Al Farizi", "Informatika 2B");

        System.out.println("Anggota: " + anggota1.getNama() + " (ID: " + anggota1.getIdAnggota() + ")");
        System.out.println("Anggota: " + anggota2.getNama() + " (ID: " + anggota2.getIdAnggota() + ")");
        System.out.println();

        // Simulasi peminjaman dan pengembalian buku
        anggota1.pinjamBuku("Madilog");
        anggota2.pinjamBuku("Hainuwele: Sang Putri Kelapa", 7);
        System.out.println();
        anggota1.kembalikanBuku("Madilog");
        anggota2.kembalikanBuku("Hainuwele: Sang Putri Kelapa");
    }
}
