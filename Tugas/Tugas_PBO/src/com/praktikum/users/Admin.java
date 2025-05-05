package com.praktikum.users;

import com.praktikum.actions.AdminActions;

import java.util.Scanner;

public class Admin extends User implements AdminActions {
    private String username;

    // Konstruktor Admin
    public Admin(String username, String password) {
        super("Admin", password);  // Menyimpan nama 'Admin' dan password yang diterima
        this.username = username;   // Menyimpan username yang diterima dari parameter
    }

    // Fitur kelola barang
    public void manageItems() {
        System.out.println(">> Fitur Kelola Barang Belum Tersedia <<");
    }

    // Fitur kelola data mahasiswa
    public void manageUsers() {
        System.out.println(">> Fitur Kelola Mahasiswa Belum Tersedia <<");
    }

    // Proses login, membandingkan username dan password
    public boolean login() {
        return username.equals("Admin056") && password.equals("Password056");
    }

    // Menampilkan menu aplikasi
    public void displayAppMenu() {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== Menu Admin =====");
            System.out.println("1. Kelola Laporan Barang");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    manageItems();
                    break;
                case 2:
                    manageUsers();
                    break;
                case 0:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);
    }
}
