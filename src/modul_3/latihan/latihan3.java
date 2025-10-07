package modul_3.latihan;

public class latihan3 {

    // Method 1: Header program
    public static void tampilkanHeader() {
        System.out.println("======================================");
        System.out.println("   PROGRAM KALKULATOR LENGKAP");
        System.out.println("======================================");
    }

    // Method 2: Menampilkan hasil operasi
    public static void tampilkanHasil(String operasi, double a, double b, double hasil) {
        System.out.printf("%.2f %s %.2f = %.2f%n", a, operasi, b, hasil);
    }

    // Method 3: Operasi dasar
    public static double tambah(double a, double b) {
        return a + b;
    }

    public static double kurang(double a, double b) {
        return a - b;
    }

    public static double kali(double a, double b) {
        return a * b;
    }

    public static double bagi(double a, double b) {
        if (validasiPembagian(b)) {
            return a / b;
        } else {
            System.out.println(" Error: Pembagian dengan nol tidak diperbolehkan!");
            return 0;
        }
    }

    // Method 4: Operasi tambahan
    public static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }

    public static double akarKuadrat(double a) {
        if (a >= 0) {
            return Math.sqrt(a);
        } else {
            System.out.println(" Error: Akar kuadrat dari bilangan negatif tidak valid!");
            return 0;
        }
    }

    // Method 5: Validasi angka
    public static boolean validasiAngka(double angka) {
        return !Double.isNaN(angka) && Double.isFinite(angka);
    }

    // Method 6: Validasi pembagian
    public static boolean validasiPembagian(double pembagi) {
        return pembagi != 0;
    }

    // Main Program
    public static void main(String[] args) {
        tampilkanHeader();

        double x = 9;
        double y = 3;

        if (validasiAngka(x) && validasiAngka(y)) {
            double hasilTambah = tambah(x, y);
            double hasilKurang = kurang(x, y);
            double hasilKali = kali(x, y);
            double hasilBagi = bagi(x, y);
            double hasilPangkat = pangkat(x, y);
            double hasilAkar = akarKuadrat(x);

            tampilkanHasil("+", x, y, hasilTambah);
            tampilkanHasil("-", x, y, hasilKurang);
            tampilkanHasil("*", x, y, hasilKali);
            tampilkanHasil("/", x, y, hasilBagi);
            tampilkanHasil("^", x, y, hasilPangkat);
            System.out.printf("√%.2f = %.2f%n", x, hasilAkar);
        }
    }
}

