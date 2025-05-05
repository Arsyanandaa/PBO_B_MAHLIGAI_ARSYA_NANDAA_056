package com.praktikum.main;

import com.praktikum.users.*;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = null;
        boolean continueLogin = true;

        while (continueLogin) {
            System.out.println("Login sebagai?");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Buang enter

            if (pilihan == 1) {
                System.out.print("Username: ");
                String username = scanner.nextLine();
                System.out.print("Password: ");
                String password = scanner.nextLine();
                user = new Admin(username, password);
            } else if (pilihan == 2) {
                System.out.print("Nama: ");
                String nama = scanner.nextLine();
                System.out.print("NIM: ");
                String nim = scanner.nextLine();
                user = new Mahasiswa(nama, nim);
            } else if (pilihan == 3) {
                System.out.println("Keluar...");
                continueLogin = false;
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
                continue;
            }

            if (user.login()) {
                System.out.println("Login berhasil!");
                user.displayAppMenu();
            } else {
                System.out.println("Login gagal!");
            }
        }

        scanner.close();
    }
}
