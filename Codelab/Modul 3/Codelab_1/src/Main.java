public class Main {
    public static void main(String[] args) {
        Pahlawan pahlawan = new Pahlawan("Naruto", 150);
        Musuh musuh = new Musuh("Sasuke", 200);

        System.out.println("Status awal:");
        System.out.println(pahlawan.getNama() + " memiliki kesehatan: " + pahlawan.getKesehatan());
        System.out.println(musuh.getNama() + " memiliki kesehatan: " + musuh.getKesehatan());
        System.out.println();

        pahlawan.serang(musuh);
        musuh.serang(pahlawan);
    }
}