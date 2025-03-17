//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        rekeningBank rekening1 = new rekeningBank("202410370110056", "Mahligai Arsya Nanda", 150000);
        rekeningBank rekening2 = new rekeningBank("202410370110002", "Muhammad Robi Ardita", 2000000);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        rekening1.setorUang(1000000);
        rekening1.tarikUang(50000);

        rekening2.setorUang(2000000);
        rekening2.tarikUang(200000);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}