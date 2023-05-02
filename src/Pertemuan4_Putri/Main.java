package Pertemuan4_Putri;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        pegawai pegawai = new pegawai();

        manager.nip  = 21102217;
        manager.nama = "Putri";

        pegawai.nip = 123456789;
        pegawai.nama = "Mutia";

        manager.showinfo();
        manager.extrainfo();
        manager.bonus(1000000);

        pegawai.showinfo();
        pegawai.extrainfo();

    }
}
