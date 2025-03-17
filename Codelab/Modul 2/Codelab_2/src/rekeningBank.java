class rekeningBank{
    String nomorRekening;
    String nomorPemilik;
    double saldo;

    public rekeningBank(String nomorRekening, String nomorPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.nomorPemilik = nomorPemilik;
        this.saldo = saldo;
    }

    public void tampilkanInfo(){
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nomor Pemilik : " + nomorPemilik);
        System.out.println("Saldo         : Rp. " + saldo);
        System.out.println();
    }

    public void setorUang(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setor: Rp." + jumlah + " Berhasil. Saldo sekarang: Rp." + saldo);
        } else {
            System.out.println("Jumlah Setor harus lebih dari 0");
        }
        System.out.println();
    }

    public void tarikUang(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) { // Perbaikan logika
            saldo -= jumlah;
            System.out.println("Tarik: Rp. " + jumlah + " Berhasil. Saldo tersisa: Rp." + saldo);
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak cukup untuk penarikan!!");
        } else {
            System.out.println("Jumlah tarik harus lebih dari 0!");
        }
        System.out.println();
    }


}


