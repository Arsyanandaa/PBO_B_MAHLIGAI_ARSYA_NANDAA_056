public class Admin {//ini atribut nya buat nyimpan Username sama password nya
    String Username;
    String Password;

    public Admin(String Usename, String Password) {//ini constructor nya buat inisialisasi Username sama Password nya
        this.Username = Usename;
        this.Password = Password;
        }
        //boolean mengembalikan nilai true dan false, jadi ini tuh sebagai method apakah input login sesuai atau tidak

        public boolean login(String inputUsername, String inputPassword) {
            System.out.println(inputUsername.equals(Username) && inputPassword.equals(Password));
        return inputUsername.equals(Username) && inputPassword.equals(Password);
    }
}
