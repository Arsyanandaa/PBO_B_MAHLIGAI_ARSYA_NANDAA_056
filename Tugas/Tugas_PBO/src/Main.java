import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner PBO = new Scanner(System.in);

        System.out.println("Masukkan Pilihan Anda ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("Pilih : ");

        int choice = PBO.nextInt();
        PBO.nextLine();

        if (choice == 1) {
            System.out.println("Masukkan Username");
            String Username = PBO.nextLine();
            System.out.println("Masukkan Password");
            String Password = PBO.nextLine();

            String validUsername = "Arsya";
            String validPassword = "123";

            if (Username.equals(validUsername) && Password.equals(validPassword)) {
                System.out.println("Login Anda Berhasil");
            } else {
                System.out.println("Login Anda gagal, Password anda salah!");
            }
        } else if (choice == 2) {
            System.out.println("Masukkan Nama");
            String Nama = PBO.nextLine();

            System.out.println("Masukkan NIM");
            String NIM = PBO.nextLine();

            String validNama = "Mahligai Arsya Nanda";
            String validNIM = "202410370110056";


            if (Nama.equals(validNama) && NIM.equals(validNIM)) {
                System.out.println("Login Anda Berhasil");
            } else {
                System.out.println("Login anda Gagal,Passsword anda Salah!");
            }
        } else {
            System.out.println("Pilihan tidak Valid!");
        }
        PBO.close();
    }
}
