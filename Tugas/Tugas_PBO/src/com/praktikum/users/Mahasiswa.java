package com.praktikum.users;

import com.praktikum.actions.MahasiswaActions;

import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {
    private String nim;

    // Constructor cuma terima nama & nim
    public Mahasiswa(String nama, String nim) {
        super(nama, ""); // password dikosongin karena nggak dipakai
        this.nim = nim;
    }

    // Override method login
    @Override
    public boolean login() {
        return nama.equals("Mahligai Arsya Nanda") && nim.equals("202410370110056");
    }

    // Override method menu aplikasi
    @Override
    public void displayAppMenu() {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== Menu Mahasiswa =====");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // bersihin newline

            switch (pilihan) {
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItems();
                    break;
                case 0:
                    System.out.println("Logout berhasil.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);
    }


    public void reportItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Barang: ");
        String namabarang = scanner.nextLine();
        System.out.print("Deskripsi Barang: ");
        String deskripsibarang = scanner.nextLine();
        System.out.print("Lokasi Terakhir/Ditemukan: ");
        String lokasiterakhir = scanner.nextLine();

        System.out.println("\nLaporan berhasil dikirim:");
        System.out.println("- Nama Barang: " + namabarang);
        System.out.println("- Deskripsi: " + deskripsibarang);
        System.out.println("- Lokasi: " + lokasiterakhir);
    }

    // Placeholder fitur lihat laporan
    public void viewReportedItems() {
        System.out.println(">> Fitur lihat laporan belum tersedia <<");
    }
}
