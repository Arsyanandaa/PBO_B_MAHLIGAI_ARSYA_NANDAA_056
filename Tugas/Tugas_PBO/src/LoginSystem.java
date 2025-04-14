import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner PBO = new Scanner(System.in);
        //Loop utama program (akan terus berjalan sampai user pilih '3. Keluar')
        do {
            System.out.println("Masukkan Pilihan Anda ");//ini adalah menu login nya
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Keluar");
            System.out.println("Pilih : ");

            int choice = PBO.nextInt();//Input pilihan dari user
            PBO.nextLine();

            if (choice == 1) {
                System.out.println("Masukkan Username");// Login sebagai Admin
                String Username = PBO.nextLine();
                System.out.println("Masukkan Password");
                String Password = PBO.nextLine();

                //membuat objek admin dengan username dan password valid
                Admin admin = new Admin("Admin056", "Password056");

                //cek login admin
                if (admin.login(Username, Password)) {
                    System.out.println("Login Admin Berhasil");
                } else {
                    System.out.println("Login Admin Gagal");
                }
                //login sebagai mahasiswa
            } else if (choice == 2) {
                System.out.println("Masukkan Nama");
                String Nama = PBO.nextLine();

                System.out.println("Masukkan NIM");
                String NIM = PBO.nextLine();

                // Membuat objek Mahasiswa dengan nama & NIM valid
                Mahasiswa mhs = new Mahasiswa("Mahligai Arsya Nanda", "202410370110056");

                //cek login mahasiswa
                if (mhs.login(Nama, NIM)) {
                    System.out.println("Login Mahasiswa Berhasil");
                    mhs.displayInfo();
                } else {
                    System.out.println("Login Mahasiswa Gagal");
                }
                //keluar dari program
            } else if (choice == 3) {
                 System.out.println("Terima kasih, Program berhenti");
                 break;
            } else {
            System.out.println("Pilihan tidak Valid!");
        }
    }while (true);//bakal keulang terus klo belum milih keluar
        PBO.close();//tutup scanner
    }
}
