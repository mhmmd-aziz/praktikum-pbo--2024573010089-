package modul_3.latihan;

public class latihan2 {
    public static void main(String[] args) {
        // Daftar mata pelajaran
        String[] mapel = {"Matematika", "Bahasa Indonesia", "Bahasa Inggris", "IPA", "IPS"};

        // Nilai 10 siswa, masing-masing punya 5 nilai (untuk 5 mata pelajaran)
        int[][] nilai = {
                {85, 90, 88, 92, 80},
                {78, 85, 82, 79, 88},
                {90, 87, 91, 85, 89},
                {70, 75, 72, 78, 74},
                {95, 92, 96, 90, 94},
                {88, 85, 90, 84, 86},
                {76, 80, 79, 81, 77},
                {89, 91, 85, 88, 90},
                {84, 82, 86, 80, 83},
                {93, 95, 97, 92, 96}
        };

        // ===== Menampilkan nilai setiap siswa =====
        System.out.println("=== Nilai Ujian 10 Siswa ===\n");

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ":");
            for (int j = 0; j < mapel.length; j++) {
                System.out.println("  " + mapel[j] + " : " + nilai[i][j]);
            }

            // Cari mata pelajaran dengan nilai tertinggi per siswa
            int nilaiTertinggi = nilai[i][0];
            int indeksTertinggi = 0;
            for (int j = 1; j < mapel.length; j++) {
                if (nilai[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[i][j];
                    indeksTertinggi = j;
                }
            }

            System.out.println("→ Nilai tertinggi pada mata pelajaran: "
                    + mapel[indeksTertinggi] + " (" + nilaiTertinggi + ")");
            System.out.println();
        }

        // ===== Hitung rata-rata tiap mata pelajaran =====
        System.out.println("=== Rata-Rata Nilai Tiap Mata Pelajaran ===");
        for (int j = 0; j < mapel.length; j++) {
            int total = 0;
            for (int i = 0; i < nilai.length; i++) {
                total += nilai[i][j];
            }
            double rataMapel = (double) total / nilai.length;
            System.out.println(mapel[j] + " : " + rataMapel);
        }
    }
}
