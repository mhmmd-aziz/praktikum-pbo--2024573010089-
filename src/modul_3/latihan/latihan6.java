package modul_3.latihan;



import java.util.Scanner;

public class latihan6 {

    // Method untuk memvalidasi nama (tidak boleh mengandung angka atau simbol)
    public static boolean validasiNama(String nama) {
        // Hanya boleh huruf dan spasi
        return nama.matches("[a-zA-Z ]+");
    }

    // Method untuk membuat email berdasarkan nama
    public static String buatEmail(String nama) {
        // Ubah ke huruf kecil, hilangkan spasi di awal/akhir
        nama = nama.trim().toLowerCase();

        // Pisahkan nama menjadi bagian-bagian
        String[] bagian = nama.split(" ");

        String email = "";
        if (bagian.length == 1) {
            // Jika hanya 1 kata
            email = bagian[0];
        } else {
            // Jika lebih dari 1 kata → ambil nama depan + nama belakang
            email = bagian[0] + "." + bagian[bagian.length - 1];
        }

        // Tambahkan domain (bisa disesuaikan)
        email += "@student.pnl.ac.id";

        return email;
    }

    // Method untuk mengubah string menjadi PascalCase (setiap kata huruf awal besar)
    public static String ubahKePascalCase(String teks) {
        String[] kata = teks.toLowerCase().split(" ");
        StringBuilder hasil = new StringBuilder();

        for (String k : kata) {
            if (k.length() > 0) {
                hasil.append(Character.toUpperCase(k.charAt(0)))
                        .append(k.substring(1))
                        .append(" ");
            }
        }
        return hasil.toString().trim();
    }

    // Method untuk menghitung jumlah konsonan
    public static int hitungKonsonan(String teks) {
        teks = teks.toLowerCase();
        int count = 0;
        for (char c : teks.toCharArray()) {
            if (c >= 'a' && c <= 'z' && "aeiou".indexOf(c) == -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM PRAKTIKUM 3.2 ===");
        System.out.print("Masukkan nama lengkap: ");
        String nama = input.nextLine();

        // Validasi nama terlebih dahulu
        if (!validasiNama(nama)) {
            System.out.println(" Nama tidak valid! Tidak boleh mengandung angka atau karakter khusus.");
            return;
        }

        // Tampilkan hasil
        System.out.println("\n=== HASIL ===");
        System.out.println("Nama asli         : " + nama);
        System.out.println("Pascal Case       : " + ubahKePascalCase(nama));
        System.out.println("Jumlah konsonan   : " + hitungKonsonan(nama));
        System.out.println("Email address     : " + buatEmail(nama));
    }
}

