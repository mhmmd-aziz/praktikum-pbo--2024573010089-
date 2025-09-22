package modul_2;

import java.util.Scanner;

public class NestedIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        if (umur >= 0) {
            if (umur <= 5) {
                System.out.println("Kategori: Bayi");
            } else if (umur <= 11) {
                System.out.println("Kategori: Anak-anak");
            } else if (umur <= 17) {
                System.out.println("Kategori: Remaja");
            } else if (umur <= 30) {
                System.out.println("Kategori: Anak-anak");
            } else if (umur <= 60) {
                System.out.println("Kategori: Dewasa");
            } else {
                System.out.println("Kategori: Lansia");
            }
        } else {
            System.out.println("Umur tidak valid!");
        }

        input.close();
    }
}
