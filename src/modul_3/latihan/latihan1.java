package modul_3.latihan;



public class latihan1 {
    public static void main(String[] args) {
        // Membuat array berisi nilai ujian 10 siswa
        int[] nilai = {85, 90, 78, 88, 95, 70, 82, 91, 76, 89};

        int total = 0;
        int tertinggi = nilai[0];
        int terendah = nilai[0];

        // Menghitung total, serta mencari nilai tertinggi dan terendah
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];

            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        // Menghitung rata-rata
        double rataRata = (double) total / nilai.length;

        // Menampilkan hasil
        System.out.println("=== Data Nilai Ujian 10 Siswa ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ": " + nilai[i]);
        }

        System.out.println("\nRata-rata nilai : " + rataRata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
    }
}

