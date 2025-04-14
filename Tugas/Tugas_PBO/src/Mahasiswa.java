public class Mahasiswa {//atribut buat nyimpan Nama dan Nim nya
    String Nama;
    String Nim;

    public Mahasiswa(String Nama, String Nim) {//constructor buat inisialisasi Nama dan Nim nya
    this.Nama = Nama;
    this.Nim = Nim;
    }
    //untuk mengecek apakah input login sesuai dengan data Mahasiswa
    public boolean login(String inputNama, String inputNim) {
        return Nama.equals(inputNama) && Nim.equals(inputNim);
    }
    public void displayInfo(){
        System.out.println("===DATA MAHASISWA===");
        System.out.println("Nama : "+Nama);
        System.out.println("Nim : "+Nim);
    }
}
