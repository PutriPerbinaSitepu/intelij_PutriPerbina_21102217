package Pertemuan2_Putri;

public class Break {

    public static void main(String[] args) {
        int p = 0;
        while (p <=100) {
            System.out.println("Perulanan ke-" +p);
            if (p == 50) {
                System.out.println("Capek Cuyy !");
                break;
            }
            p +=10;
        }
    }
}
