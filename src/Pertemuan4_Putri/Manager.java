package Pertemuan4_Putri;

public class Manager extends pegawai {

    public void bonus(int bonus) {
        System.out.println("Pegawai dengan nama " + nama + " " +
                "(" + nip + ") mendapat bonus sebesar Rp " + bonus);
    }

    public void extrainfo() {
        System.out.println("Jabatan Pegawai : Manajer");
    }

    public void bonus() {
        System.out.println("Error : Harap Masukkan Jumlah Bonusnya!");
    }
}
