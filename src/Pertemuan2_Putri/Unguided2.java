package Pertemuan2_Putri;

import java.util.Scanner;

public class Unguided2 {

    public static void main(String[] args) {

        System.out.println("NAMA : Putri Perbina Sitepu");
        System.out.println("NIM  : 21102217");

        Scanner input=new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("PROGRAM MENENTUKAN BILANGAN GENAP");
        System.out.println("=================================");

        System.out.print("Masukkan Batas Bilangan : ");
        int bilangan = input.nextInt();

        for (int i = 1; i <=bilangan; i++){
            if (i%2==0){
                System.out.println("Angka-" +i);
            }
            input.close();
        }
    }
}
