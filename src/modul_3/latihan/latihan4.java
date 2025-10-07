package modul_3.latihan;

import java.util.Scanner;

public class latihan4 {

    // Method untuk input array
    public static int[] inputArray(int ukuran) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[ukuran];

        System.out.println("Masukkan " + ukuran + " angka:");
        for (int i = 0; i < ukuran; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        return array;
    }

    // Method untuk menampilkan array
    public static void tampilkanArray(int[] array) {
        System.out.print("Array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    // Method untuk mencari nilai maksimum
    public static int cariMaksimum(int[] array) {
        int maks = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maks) maks = array[i];
        }
        return maks;
    }

    // Method untuk mencari nilai minimum
    public static int cariMinimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    // Method untuk menghitung rata-rata
    public static double hitungRataRata(int[] array) {
        int total = 0;
        for (int nilai : array) total += nilai;
        return (double) total / array.length;
    }

    // Method untuk mengurutkan array (Bubble Sort)
    public static int[] urutkanArray(int[] array) {
        int[] arrayBaru = array.clone();
        for (int i = 0; i < arrayBaru.length - 1; i++) {
            for (int j = 0; j < arrayBaru.length - 1 - i; j++) {
                if (arrayBaru[j] > arrayBaru[j + 1]) {
                    int temp = arrayBaru[j];
                    arrayBaru[j] = arrayBaru[j + 1];
                    arrayBaru[j + 1] = temp;
                }
            }
        }
        return arrayBaru;
    }

    // 🔹 Method baru: mencari nilai tertentu dalam array
    public static int cariNilai(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // mengembalikan indeks nilai yang ditemukan
            }
        }
        return -1; // jika tidak ditemukan
    }

    // 🔹 Method baru: menghitung median dari array yang sudah diurutkan
    public static double hitungMedian(int[] array) {
        int[] urut = urutkanArray(array); // pastikan array sudah diurutkan
        int n = urut.length;

        if (n % 2 == 1) {
            // Jika jumlah data ganjil → ambil nilai tengah
            return urut[n / 2];
        } else {
            // Jika genap → rata-rata dari dua nilai tengah
            return (urut[n / 2 - 1] + urut[n / 2]) / 2.0;
        }
    }

    // Main program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==== PROGRAM ANALISIS ARRAY LANJUTAN ====");
        System.out.print("Masukkan jumlah data: ");
        int n = input.nextInt();

        int[] data = inputArray(n);

        System.out.println("\n==== HASIL ANALISIS ====");
        tampilkanArray(data);

        System.out.println("Nilai Maksimum : " + cariMaksimum(data));
        System.out.println("Nilai Minimum  : " + cariMinimum(data));
        System.out.printf("Rata-rata      : %.2f%n", hitungRataRata(data));
        System.out.printf("Median         : %.2f%n", hitungMedian(data));

        // Fitur pencarian nilai
        System.out.print("\nMasukkan nilai yang ingin dicari: ");
        int target = input.nextInt();

        int indeks = cariNilai(data, target);
        if (indeks != -1) {
            System.out.println(" Nilai " + target + " ditemukan pada indeks ke-" + indeks);
        } else {
            System.out.println(" Nilai " + target + " tidak ditemukan dalam array.");
        }

        // Tampilkan array setelah diurutkan
        System.out.print("\nArray setelah diurutkan: ");
        tampilkanArray(urutkanArray(data));
    }
}

