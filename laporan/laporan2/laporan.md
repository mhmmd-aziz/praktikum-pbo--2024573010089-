# Laporan Modul 3: Array, Method, dan String pada Java

**Mata Kuliah:** Praktikum Pemrograman Berorientasi Objek  
**Nama:** Muhammad Aziz  
**NIM:** 2024573010089  
**Kelas:** TI 2E

---

## 1. Abstrak

Laporan ini membahas hasil praktikum Modul 3 yang berfokus pada konsep **array**, **method**, dan **string manipulation** dalam bahasa pemrograman Java.  
Tujuannya adalah memahami bagaimana data disimpan, diproses, dan dimanipulasi menggunakan struktur data dasar serta fungsi‐fungsi buatan sendiri.  `
Melalui praktikum ini, mahasiswa belajar membuat program dengan array satu dan dua dimensi, memanfaatkan method untuk modularisasi, serta menerapkan berbagai operasi string seperti pencarian, pembalikan, dan validasi.

---

## 2. Praktikum

### 2.1 Praktikum 1.1 – Penggunaan Array Dasar

#### Dasar Teori
Array digunakan untuk menyimpan beberapa nilai dalam satu variabel dengan tipe data yang sama.

#### Langkah Praktikum
Membuat program `latihan1.java` untuk:
- menyimpan nilai ujian 10 siswa,
- menghitung rata-rata,
- mencari nilai tertinggi dan terendah.

#### Kode Program ArraySatuDimensi sebelum di modifikasi
```java
package modul_3;

public class ArraySatuDimensi {
    public static void main(String[] args) {
        // Langkah 1: Deklarasi dan inisialisasi array
        int[] nilai = {85, 90, 78, 92, 88};
        String[] nama = {"Alice", "Bob", "Charlie", "Diana", "Eva"};

        // Langkah 2: Menampilkan panjang array
        System.out.println("Jumlah siswa: " + nilai.length);

        // Langkah 3: Mengakses elemen array
        System.out.println("Nama siswa pertama: " + nama[0]);

        // Langkah 4: Menampilkan semua data menggunakan loop
        System.out.println("\nData semua siswa:");
        for (int i = 0; i < nama.length; i++) {
            System.out.println((i+1) + ". " + nama[i] + " - Nilai: " + nilai[i]);
        }
    }
}

```
#### Screenshot Hasil arraysatudimensi sebelum di modifikasi
![Hasil latihan1](gambar/arraysatudimensibefore.jpg)

#### Kode Program ArraySatuDimensi sesudah di modifikasi
```java
package modul_3;

public class ArraySatuDimensi {
    public static void main(String[] args) {
        // Langkah 1: Deklarasi dan inisialisasi array
        int[] nilai = {85, 90, 78, 92, 88};
        String[] nama = {"Alice", "Bob", "Charlie", "Diana", "Eva"};

        // Langkah 2: Menampilkan panjang array
        System.out.println("Jumlah siswa: " + nilai.length);

        // Langkah 3: Mengakses elemen array
        System.out.println("Nama siswa pertama: " + nama[0]);

        // Langkah 4: Menampilkan semua data menggunakan loop
        System.out.println("\nData semua siswa:");
        for (int i = 0; i < nama.length; i++) {
            System.out.println((i+1) + ". " + nama[i] + " - Nilai: " + nilai[i]);
        }

        // Langkah 5: Mencari nilai tertinggi dan terendah
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];
        String siswaTertinggi = nama[0];
        String siswaTerendah = nama[0];

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
                siswaTertinggi = nama[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
                siswaTerendah = nama[i];
            }
        }

        // Langkah 6: Menampilkan hasil pencarian
        System.out.println("\nNilai tertinggi: " + nilaiTertinggi + " (oleh " + siswaTertinggi + ")");
        System.out.println("Nilai terendah: " + nilaiTerendah + " (oleh " + siswaTerendah + ")");
    }
}
```
#### Screenshot Hasil arraysatudimensi setelah di modifikasi
![Hasil latihan1](gambar/arraysatudimensiafter.jpg)
#### Kode Program latihan 1

```java
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


```
#### Screenshot Hasil tugas latihan 1
![Hasil latihan1](gambar/tugas1.1.jpg)



#### **Analisa dan Pembahasan: Array Satu Dimensi**

#### **1. Program ArraySatuDimensi (Sebelum dan Sesudah Dimodifikasi)**

#### **Analisa Program**
Program ini menggunakan **array satu dimensi** untuk menyimpan data nilai dan nama siswa.  
Langkah-langkah utamanya:
1. Mendeklarasikan dua array: `nilai` dan `nama`.
2. Menampilkan jumlah siswa menggunakan `array.length`.
3. Mengakses elemen pertama dari array `nama`.
4. Menampilkan seluruh data siswa menggunakan perulangan `for`.

Pada versi **setelah dimodifikasi**, ditambahkan:
- Fitur pencarian **nilai tertinggi dan terendah**.
- Menampilkan **nama siswa** yang memiliki nilai tersebut.
- Penambahan variabel seperti `nilaiTertinggi`, `nilaiTerendah`, `siswaTertinggi`, dan `siswaTerendah`.

#### **Pembahasan**
Perubahan yang dilakukan membuat program lebih lengkap karena tidak hanya menampilkan data, tetapi juga menganalisisnya.  
Program ini menunjukkan cara menggunakan **loop dan kondisi** untuk mencari nilai maksimum dan minimum dalam array.

Konsep yang dipelajari:
- Deklarasi dan inisialisasi array.
- Penggunaan indeks array untuk mengakses data.
- Pencarian data tertinggi dan terendah menggunakan perulangan.

---

#### **2. Program Latihan 1**

#### **Analisa Program**
Program ini memproses **array satu dimensi** yang berisi nilai ujian dari 10 siswa.  
Langkah-langkahnya:
1. Menyimpan nilai ke dalam array `nilai`.
2. Menghitung **total nilai**, **nilai tertinggi**, dan **nilai terendah** menggunakan perulangan.
3. Menghitung **rata-rata** seluruh nilai.
4. Menampilkan hasilnya ke layar.

##### **Pembahasan**
Program ini memanfaatkan array untuk melakukan **pengolahan data statistik sederhana** seperti mencari rata-rata, nilai maksimum, dan minimum.  
Perulangan digunakan untuk menjumlahkan nilai dan melakukan pengecekan kondisi pada setiap elemen array.

Konsep yang dipelajari:
- Pemrosesan data dalam array satu dimensi.
- Penggunaan tipe data `int` dan `double` untuk menghitung rata-rata.
- Logika perbandingan (`if`) untuk menemukan nilai ekstrem.

---



### 2.2 Praktikum 1.2 – Array 2D dan Perhitungan Per Mata Pelajaran

#### Dasar Teori
Array dua dimensi menyimpan data dalam bentuk tabel (baris × kolom).

#### Langkah Praktikum
Membuat program `latihan2.java` untuk:
- menampilkan nilai 10 siswa × 5 mata pelajaran,
- menampilkan mata pelajaran dengan nilai tertinggi tiap siswa,
- menghitung rata-rata tiap mata pelajaran.

#### Kode Program ArrayDuaDimensi
```java
package modul_3;

import java.util.Scanner;

public class ArrayDuaDimensi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Langkah 1: Deklarasi array 2D untuk nilai siswa (3 siswa, 4 mata pelajaran)
        int[][] nilaiSiswa = new int[3][4];
        String[] namaSiswa = new String[3];
        String[] mataPelajaran = {"Matematika", "Bahasa Indonesia", "IPA", "IPS"};

        // Langkah 2: Input nilai
        System.out.println("=== INPUT NILAI SISWA ===");
        for (int i = 0; i < 3; i++) {
            System.out.print("Nama siswa ke-" + (i+1) + ": ");
            namaSiswa[i] = input.next();
            for (int j = 0; j < 4; j++) {
                System.out.print(mataPelajaran[j] + ": ");
                nilaiSiswa[i][j] = input.nextInt();
            }
            System.out.println();
        }

        // Langkah 3: Menampilkan data dalam bentuk tabel
        System.out.println("=== TABEL NILAI SISWA ===");
        System.out.printf("%-15s", "Nama");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%-15s", mataPelajaran[i].substring(0, Math.min(7, mataPelajaran[i].length())));
        }
        System.out.printf("%-15s\n", "Rata-rata");

        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s", namaSiswa[i]);
            int total = 0;
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-15d", nilaiSiswa[i][j]);
                total += nilaiSiswa[i][j];
            }
            double rataRata = total / 4.0;
            System.out.printf("%-15.2f\n", rataRata);
        }
    }
}

```
#### Screenshot Hasil arrayduadimensi
![Hasil latihan1](gambar/arrayduadimensi.jpg)
#### Kode Program latihan 2
```java
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

```
#### Screenshot Hasil tugas latihan 2
![Hasil latihan1](gambar/tugas1.2.jpg)

#### **Analisa dan Pembahasan: Array Dua Dimensi**

#### **1. Program ArrayDuaDimensi**

#### **Analisa Program**
Program ini menggunakan **array dua dimensi** untuk menyimpan nilai beberapa siswa pada berbagai mata pelajaran.  
Langkah-langkahnya:
1. Membuat array `nilaiSiswa[3][4]` untuk 3 siswa dan 4 mata pelajaran.
2. Menginput data siswa dan nilai menggunakan `Scanner`.
3. Menampilkan data dalam bentuk tabel menggunakan `System.out.printf()`.
4. Menghitung dan menampilkan **rata-rata nilai per siswa**.

#### **Pembahasan**
Array dua dimensi digunakan untuk merepresentasikan data berbentuk **tabel**, di mana:
- Baris mewakili siswa.
- Kolom mewakili mata pelajaran.

Program ini mengajarkan cara:
- Melakukan input data secara berulang dengan **nested loop**.
- Mengakses dan menampilkan data array dua dimensi dengan indeks `[i][j]`.
- Menghitung rata-rata tiap baris data.

Program ini memperkuat pemahaman tentang **struktur data dua dimensi** dan cara menampilkan data dalam format tabel yang rapi.

---

#### **2. Program Latihan 2**

#### **Analisa Program**
Program ini menampilkan nilai 10 siswa, masing-masing dengan 5 mata pelajaran.  
Langkah-langkahnya:
1. Menyimpan daftar mata pelajaran dan nilai ke dalam array dua dimensi.
2. Menampilkan nilai setiap siswa satu per satu.
3. Mencari **mata pelajaran dengan nilai tertinggi** untuk setiap siswa.
4. Menghitung **rata-rata nilai setiap mata pelajaran**.

#### **Pembahasan**
Program ini menggabungkan konsep array dua dimensi dan analisis data numerik.  
Loop bersarang digunakan untuk mengakses setiap elemen array, sementara logika perbandingan digunakan untuk menentukan nilai tertinggi per siswa.

Selain itu, program juga menghitung rata-rata setiap mata pelajaran dengan cara menjumlahkan nilai seluruh siswa untuk mata pelajaran tertentu, lalu membaginya dengan jumlah siswa.

Konsep yang dipelajari:
- Penggunaan **array dua dimensi** untuk menyimpan data tabel.
- **Perulangan bersarang (nested loop)** untuk mengakses data dua dimensi.
- Penerapan logika **perbandingan dan perhitungan rata-rata** pada setiap kolom data.

---

### 2.4 Praktikum 2.1 – Method/Function

#### Dasar Teori
Method adalah blok kode yang dapat dipanggil untuk menjalankan tugas tertentu. Method memungkinkan kita untuk:

- Menghindari pengulangan kode
- Membuat program lebih terstruktur
- Memudahkan debugging dan maintenance 
#### Jenis Method:
- Static Method: Dapat dipanggil tanpa membuat object
- Non-static Method: Perlu membuat object terlebih dahulu
- Void Method: Tidak mengembalikan nilai
- Return Method: Mengembalikan nilai

#### Syntax Method:
```java
java[access modifier] [static] returnType namaMethod(parameter) {
    // body method
    return value; // jika ada return type
}
```
#### Langkah Praktikum
1. Buat file baru dengan nama MethodDasar.java
2. Ketik kode berikut:



#### Kode Program methodDasar sebelum di modifkasi
```java
package modul_3;

public class MethodDasar {

    // Langkah 1: Method void tanpa parameter
    public static void tampilkanHeader() {
        System.out.println("===================================");
        System.out.println("     PROGRAM KALKULATOR SEDERHANA");
        System.out.println("===================================");
    }

    // Langkah 2: Method void dengan parameter
    public static void tampilkanHasil(String operasi, double a, double b, double hasil) {
        System.out.printf("%.2f %s %.2f = %.2f%n", a, operasi, b, hasil);
    }

    // Langkah 3: Method dengan return value
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
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol!");
            return 0;
        }
    }

    // Langkah 4: Method dengan validasi input
    public static boolean validasiAngka(double angka) {
        return !Double.isNaN(angka) && Double.isFinite(angka);
    }

    public static void main(String[] args) {
        // Langkah 5: Menggunakan semua method
        tampilkanHeader();

        double x = 15.5;
        double y = 4.2;

        if (validasiAngka(x) && validasiAngka(y)) {
            double hasilTambah = tambah(x, y);
            double hasilKurang = kurang(x, y);
            double hasilKali = kali(x, y);
            double hasilBagi = bagi(x, y);

            tampilkanHasil("+", x, y, hasilTambah);
            tampilkanHasil("-", x, y, hasilKurang);
            tampilkanHasil("*", x, y, hasilKali);
            tampilkanHasil("/", x, y, hasilBagi);
        }
    }
}


```
#### Screenshot Hasil methoddasr sebelum di modifikasi 
![Hasil latihan1](gambar/methoddasarbefore.jpg)
#### Kode Program methodDasar setelah di modifkasi
```java
package modul_3;

public class MethodDasar {

    // Langkah 1: Method void tanpa parameter
    public static void tampilkanHeader() {
        System.out.println("===================================");
        System.out.println("     PROGRAM KALKULATOR SEDERHANA");
        System.out.println("===================================");
    }

    // Langkah 2: Method void dengan parameter
    public static void tampilkanHasil(String operasi, double a, double b, double hasil) {
        System.out.printf("%.2f %s %.2f = %.2f%n", a, operasi, b, hasil);
    }

    // Langkah 3: Method dengan return value
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
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol!");
            return 0;
        }
    }

    // Langkah 4: Method dengan validasi input
    public static boolean validasiAngka(double angka) {
        return !Double.isNaN(angka) && Double.isFinite(angka);
    }

    public static void main(String[] args) {
        // Langkah 5: Menggunakan semua method
        tampilkanHeader();

        double x = 10.5;
        double y = 1.2;

        if (validasiAngka(x) && validasiAngka(y)) {
            double hasilTambah = tambah(x, y);
            double hasilKurang = kurang(x, y);
            double hasilKali = kali(x, y);
            double hasilBagi = bagi(x, y);

            tampilkanHasil("+", x, y, hasilTambah);
            tampilkanHasil("-", x, y, hasilKurang);
            tampilkanHasil("*", x, y, hasilKali);
            tampilkanHasil("/", x, y, hasilBagi);
        }
    }
}


```
#### Screenshot Hasil methoddasar setelah di modifikasi
![Hasil latihan1](gambar/methoddasarafter.jpg)
#### kode program latihan 3 
```java
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


```
#### Screenshot Hasil tugas latihan 3
![Hasil latihan1](gambar/tugas2.1.jpg)
#### **Analisa Program**
Program ini merupakan versi pengembangan dari versi sebelumnya.  
Perbedaan utamanya terdapat pada:
- Nilai variabel `x` dan `y` diubah menjadi `10.5` dan `1.2`.
- Tidak ada perubahan signifikan dalam logika, tetapi dilakukan **penyempurnaan nilai input** untuk menampilkan hasil berbeda.

Struktur program tetap sama, meliputi:
- Method void untuk menampilkan header.
- Method dengan parameter untuk menampilkan hasil.
- Method return untuk operasi matematika.
- Validasi angka agar input tetap aman.

#### **Pembahasan**
Meskipun perubahannya sederhana, program ini menekankan **pemahaman modularisasi dan fleksibilitas method**.  
Dengan struktur yang sudah modular, perubahan pada nilai input atau penambahan operasi lain tidak perlu mengubah keseluruhan logika program.

Penerapan prinsip **reusability** sangat terlihat karena setiap fungsi dapat digunakan kembali tanpa duplikasi kode.  
Program ini juga tetap menjaga keamanan data melalui validasi angka dan pembagian.

---

#### **3. Program Latihan 3**

#### **Analisa Program**
Program `latihan3` merupakan versi lanjutan dari `MethodDasar`, di mana fitur-fitur baru ditambahkan agar menjadi **kalkulator yang lebih lengkap dan interaktif**.

Struktur dan fungsionalitasnya meliputi:
1. **Header program** – ditampilkan dengan method `tampilkanHeader()`.
2. **Operasi dasar** – terdiri dari `tambah()`, `kurang()`, `kali()`, dan `bagi()`.
3. **Operasi tambahan** – seperti `pangkat()` dan `akarKuadrat()` untuk memperluas kemampuan kalkulator.
4. **Validasi angka dan pembagian** – memastikan input valid dan tidak membagi dengan nol.
5. **Output hasil** – menggunakan `tampilkanHasil()` dan `printf` agar tampilannya rapi.

Alur eksekusi:
- Program menampilkan judul kalkulator.
- Menginisialisasi variabel `x = 9` dan `y = 3`.
- Mengecek validasi angka.
- Melakukan enam operasi matematika: tambah, kurang, kali, bagi, pangkat, dan akar kuadrat.
- Menampilkan hasil dengan format yang jelas.

#### **Pembahasan**
Program ini menunjukkan penerapan **konsep overloading logika method**, **validasi data**, serta **penggunaan method tambahan** untuk memperluas fungsionalitas.

### Praktikum 2.1 – Array/Method

#### **Dasar Teori**
Dalam pemrograman Java, **array** digunakan untuk menyimpan sekumpulan nilai dengan tipe data yang sama, sedangkan **method** berfungsi untuk membagi program menjadi bagian-bagian kecil agar lebih terstruktur dan mudah dikelola.  
Dengan menggabungkan keduanya, kita dapat membangun program yang mampu melakukan **analisis data** secara modular.

**Konsep penting yang digunakan:**
- **Array satu dimensi** untuk menampung data input.
- **Loop for dan for-each** untuk iterasi data.
- **Method** untuk memisahkan logika perhitungan seperti maksimum, minimum, rata-rata, dan pengurutan.
- **Algoritma Bubble Sort** untuk mengurutkan data dari kecil ke besar.

---

#### **Langkah Praktikum**
1. **Buka IDE Java** (seperti NetBeans atau VS Code).
2. **Buat file baru bernama `ArrayMethod.java`.**
3. **Buat beberapa method utama:**
    - `inputArray(int ukuran)` untuk menerima input dari pengguna.
    - `tampilkanArray(int[] array)` untuk menampilkan isi array.
    - `cariMaksimum(int[] array)` dan `cariMinimum(int[] array)` untuk analisis nilai ekstrem.
    - `hitungRataRata(int[] array)` untuk menghitung nilai rata-rata.
    - `urutkanArray(int[] array)` untuk mengurutkan array secara ascending.
4. **Panggil semua method tersebut di dalam `main()`** agar hasil dapat ditampilkan secara lengkap.
5. **Jalankan program** dan amati output hasil analisis.

#### kode program arraymethod
```java
package modul_3;

import java.util.Scanner;

public class ArrayMethod {

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
            if (i < array.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    // Method untuk mencari nilai maksimum
    public static int cariMaksimum(int[] array) {
        int maks = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maks) {
                maks = array[i];
            }
        }
        return maks;
    }

    // Method untuk mencari nilai minimum
    public static int cariMinimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Method untuk menghitung rata-rata
    public static double hitungRataRata(int[] array) {
        int total = 0;
        for (int nilai : array) {
            total += nilai;
        }
        return (double) total / array.length;
    }

    // Method untuk mengurutkan array (Bubble Sort)
    public static int[] urutkanArray(int[] array) {
        int[] arrayBaru = array.clone(); // Membuat copy array

        for (int i = 0; i < arrayBaru.length - 1; i++) {
            for (int j = 0; j < arrayBaru.length - 1 - i; j++) {
                if (arrayBaru[j] > arrayBaru[j + 1]) {
                    // Tukar posisi
                    int temp = arrayBaru[j];
                    arrayBaru[j] = arrayBaru[j + 1];
                    arrayBaru[j + 1] = temp;
                }
            }
        }
        return arrayBaru;
    }

    public static void main(String[] args) {
        System.out.println("==== PROGRAM ANALISIS ARRAY ====");

        int[] data = inputArray(5);

        System.out.println("\n==== HASIL ANALISIS ====");
        tampilkanArray(data);

        System.out.println("Nilai Maksimum: " + cariMaksimum(data));
        System.out.println("Nilai Minimum: " + cariMinimum(data));
        System.out.printf("Rata-rata: %.2f%n", hitungRataRata(data));

        int[] dataUrut = urutkanArray(data);
        System.out.print("Array setelah diurutkan: ");
        tampilkanArray(dataUrut);
    }
}


```
#### Screenshot Hasil arraymethod
![Hasil latihan1](gambar/arraymethod.jpg)
#### kode program latihan 4
```java
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


```
#### Screenshot Hasil tugas latihan 4
![Hasil latihan1](gambar/tugas2.2.jpg)
#### **Analisa dan Pembahasan Modul 3: Array dan Method**

#### **1. Program ArrayMethod**

#### **Analisa Program**
Program `ArrayMethod` menggabungkan dua konsep utama dalam Java, yaitu **array** dan **method**, untuk melakukan analisis sederhana terhadap sekumpulan data numerik.  
Program meminta pengguna menginput beberapa angka, kemudian menghitung hasil statistik dasar seperti **nilai maksimum, minimum, rata-rata, dan pengurutan data**.

Struktur program terdiri dari beberapa method:
1. `inputArray(int ukuran)` → menerima input sejumlah data dari pengguna.
2. `tampilkanArray(int[] array)` → menampilkan isi array dengan format `[x, y, z]`.
3. `cariMaksimum(int[] array)` → mencari nilai tertinggi dalam array.
4. `cariMinimum(int[] array)` → mencari nilai terendah.
5. `hitungRataRata(int[] array)` → menghitung rata-rata nilai.
6. `urutkanArray(int[] array)` → mengurutkan array secara **ascending** menggunakan **Bubble Sort**.

Pada method `main()`:
- Program menampilkan judul.
- Memanggil method `inputArray()` untuk menerima 5 angka dari pengguna.
- Menampilkan hasil analisis: nilai maksimum, minimum, rata-rata, serta hasil pengurutan.

#### **Pembahasan**
Program ini menunjukkan penerapan **fungsi modularisasi dengan method** agar setiap tugas memiliki tanggung jawab tersendiri.  
Konsep utama yang diterapkan:
- **Array satu dimensi** untuk menyimpan data numerik.
- **Loop for** dan **for-each** untuk melakukan iterasi data.
- **Bubble Sort** sebagai algoritma pengurutan sederhana.
- **Reusability** method agar bisa digunakan kembali tanpa menulis ulang logika.

Keunggulan dari pendekatan ini:
- Kode menjadi **lebih rapi dan mudah dibaca**.
- Proses analisis data seperti mencari maksimum/minimum dapat dilakukan secara terpisah.
- Struktur program mudah dikembangkan dengan fitur tambahan (misalnya median atau pencarian nilai).

Dengan demikian, `ArrayMethod` menjadi pondasi yang kuat untuk memahami interaksi antara array dan method dalam Java.

---

#### **2. Program Latihan 4**

#### **Analisa Program**
Program `latihan4` merupakan versi **lanjutan dari `ArrayMethod`** yang menambahkan beberapa fitur analisis tambahan agar lebih lengkap dan interaktif.

Struktur program:
1. **Input dan tampilan data**
    - `inputArray()` → meminta pengguna memasukkan sejumlah angka.
    - `tampilkanArray()` → menampilkan seluruh isi array dalam format yang rapi.
2. **Analisis dasar**
    - `cariMaksimum()` dan `cariMinimum()` → mencari nilai tertinggi dan terendah.
    - `hitungRataRata()` → menghitung rata-rata dari seluruh data.
3. **Analisis lanjutan**
    - `urutkanArray()` → mengurutkan array dengan **Bubble Sort**.
    - `cariNilai()` → mencari posisi suatu nilai dalam array (mengembalikan indeks).
    - `hitungMedian()` → menghitung median dari array (menggunakan array yang sudah diurutkan).
4. **Bagian utama (`main`)**
    - Pengguna menentukan jumlah data.
    - Program menampilkan hasil analisis: maksimum, minimum, rata-rata, median.
    - Menyediakan fitur pencarian nilai dalam array.
    - Menampilkan array setelah diurutkan.

#### **Pembahasan**
Program ini memperluas konsep **array satu dimensi dan modularisasi** dengan menambahkan dua fitur baru: **pencarian nilai (searching)** dan **perhitungan median**.  
Konsep-konsep penting yang digunakan:
- **Cloning array** agar data asli tidak berubah ketika diurutkan.
- **Bubble Sort** untuk pengurutan.
- **Logika median**:
    - Jika jumlah data ganjil → median = elemen tengah.
    - Jika jumlah data genap → median = rata-rata dua nilai tengah.
- **Validasi hasil pencarian**:
    - Mengembalikan indeks jika nilai ditemukan.
    - Mengembalikan `-1` jika tidak ditemukan.

Program ini mengajarkan prinsip:
- Modularisasi lanjutan menggunakan banyak method.
- Implementasi **algoritma pencarian dan pengurutan sederhana**.
- Pengolahan data statistik dasar dari array.

#### **Perbandingan dengan ArrayMethod**
| Aspek | ArrayMethod | Latihan 4 |
|-------|--------------|-----------|
| Jumlah method | 6 | 8 |
| Fitur tambahan | - | Pencarian nilai dan median |
| Input data | Tetap (5 data) | Dinamis (bebas jumlahnya) |
| Kompleksitas | Dasar | Menengah |
| Tujuan | Dasar penggunaan array dan method | Pengembangan fitur analisis array |

---

### 2.5 Praktikum 3.1 – Manipulasi String

#### 1. Dasar Teori

Manipulasi string merupakan salah satu konsep penting dalam pemrograman karena hampir semua aplikasi memerlukan pengolahan teks. Di Java, string merupakan objek dari kelas `String` yang bersifat **immutable**, artinya nilainya tidak dapat diubah setelah dibuat. Namun, berbagai operasi dapat dilakukan dengan membuat string baru sebagai hasil manipulasi.

Beberapa operasi umum pada string antara lain:
- **Menghitung panjang string** menggunakan `.length()`.
- **Mengambil karakter tertentu** dengan `.charAt(index)`.
- **Mengubah huruf besar/kecil** menggunakan `.toUpperCase()` dan `.toLowerCase()`.
- **Memisahkan string menjadi array kata** dengan `.split(" ")` atau ekspresi reguler seperti `split("\\s+")`.
- **Membalik string** menggunakan `StringBuilder` dan method `.reverse()`.
- **Mendeteksi palindrome**, yaitu string yang sama jika dibaca dari depan dan belakang.
- **Menghitung jumlah vokal dan konsonan**, dengan membandingkan karakter terhadap kumpulan huruf vokal atau alfabet.
- **Mengubah string menjadi Pascal Case**, yaitu format di mana setiap kata dimulai dengan huruf kapital (contoh: “saya belajar java” → “Saya Belajar Java”).

Dalam praktikum ini, konsep-konsep tersebut diterapkan melalui beberapa method, antara lain:
- `hitungVokal()` untuk menghitung jumlah huruf vokal.
- `hitungKonsonan()` untuk menghitung jumlah huruf konsonan.
- `reverseString()` untuk membalik urutan karakter.
- `isPalindrome()` untuk mengecek apakah string merupakan palindrome.
- `toPascalCase()` untuk mengubah string menjadi format Pascal Case.

---

#### 2. Langkah Praktikum

1. **Membuat Package dan Class**
    - Buat package bernama `modul_3.latihan`.
    - Tambahkan file `latihan5.java`.

2. **Menulis Kode Program**
    - Tambahkan method-method berikut:
        - `analisisString(String teks)` → menampilkan informasi dasar string.
        - `hitungVokal(String teks)` → menghitung huruf vokal.
        - `hitungKonsonan(String teks)` → menghitung huruf konsonan.
        - `reverseString(String teks)` → membalik urutan karakter string.
        - `isPalindrome(String teks)` → mengecek apakah string merupakan palindrome.
        - `toPascalCase(String teks)` → mengubah string menjadi Pascal Case.

3. **Input dari Pengguna**
    - Program meminta pengguna memasukkan sebuah kalimat.

4. **Analisis String**
    - Menampilkan panjang string, karakter pertama dan terakhir, huruf besar/kecil, jumlah kata, jumlah vokal, dan jumlah konsonan.

5. **Menampilkan Manipulasi Tambahan**
    - String terbalik.
    - Hasil pengecekan palindrome.
    - Hasil konversi ke Pascal Case.

6. **Pencarian Substring**
    - Pengguna memasukkan kata yang ingin dicari dalam kalimat.
    - Program menampilkan apakah kata tersebut ditemukan dan posisinya dalam kalimat.

7. **Menjalankan Program**
    - Jalankan dan uji dengan berbagai kalimat, misalnya:
      ```
      Masukkan sebuah kalimat: Saya suka belajar Java
      ```

---

#### Kode Program string dasar
```java
package modul_3;

import java.util.Scanner;

public class StringDasar {

    public static void analisisString(String teks) {
        System.out.println("\n=== ANALISIS STRING ===");
        System.out.println("Teks asli: \"" + teks + "\"");
        System.out.println("Panjang string: " + teks.length());
        System.out.println("Karakter pertama: " + teks.charAt(0));
        System.out.println("Karakter terakhir: " + teks.charAt(teks.length() - 1));
        System.out.println("Uppercase: " + teks.toUpperCase());
        System.out.println("Lowercase: " + teks.toLowerCase());

        // Menghitung jumlah kata
        String[] kata = teks.trim().split("\\s+");
        System.out.println("Jumlah kata: " + kata.length);

        // Menghitung jumlah vokal
        int jumlahVokal = hitungVokal(teks);
        System.out.println("Jumlah vokal: " + jumlahVokal);
    }

    public static int hitungVokal(String teks) {
        String vokal = "aeiouAEIOU";
        int count = 0;
        for (int i = 0; i < teks.length(); i++) {
            if (vokal.contains(String.valueOf(teks.charAt(i)))) {
                count++;
            }
        }
        return count;
    }

    public static String reverseString(String teks) {
        StringBuilder reversed = new StringBuilder();
        for (int i = teks.length() - 1; i >= 0; i--) {
            reversed.append(teks.charAt(i));
        }
        return reversed.toString();
    }

    public static boolean isPalindrome(String teks) {
        String clean = teks.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = reverseString(clean);
        return clean.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM MANIPULASI STRING ===");
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine();

        // Analisis dasar
        analisisString(kalimat);

        // String terbalik
        System.out.println("\nString terbalik: \"" + reverseString(kalimat) + "\"");

        // Cek palindrome
        if (isPalindrome(kalimat)) {
            System.out.println("String ini adalah palindrome!");
        } else {
            System.out.println("String ini bukan palindrome.");
        }

        // Pencarian substring
        System.out.print("\nMasukkan kata yang ingin dicari: ");
        String cari = input.nextLine();

        if (kalimat.toLowerCase().contains(cari.toLowerCase())) {
            System.out.println("Kata \"" + cari + "\" ditemukan dalam kalimat.");
            int posisi = kalimat.toLowerCase().indexOf(cari.toLowerCase());
            System.out.println("Posisi pertama: " + posisi);
        } else {
            System.out.println("Kata \"" + cari + "\" tidak ditemukan dalam kalimat.");
        }
    }
}


```
#### Screenshot Hasil stringdasar input "aziz"
![Hasil latihan1](gambar/stringdasarbefore.jpg)

#### Screenshot Hasil stringdasar input "kasur rusak"
![Hasil latihan1](gambar/stringdasarinput.jpg)

#### kode program latihan 5
```java
package modul_3.latihan;


import java.util.Scanner;

public class latihan5 {

    // Method untuk menganalisis string
    public static void analisisString(String teks) {
        System.out.println("\n=== ANALISIS STRING ===");
        System.out.println("Teks asli: \"" + teks + "\"");
        System.out.println("Panjang string: " + teks.length());
        System.out.println("Karakter pertama: " + teks.charAt(0));
        System.out.println("Karakter terakhir: " + teks.charAt(teks.length() - 1));
        System.out.println("Uppercase: " + teks.toUpperCase());
        System.out.println("Lowercase: " + teks.toLowerCase());

        // Hitung jumlah kata
        String[] kata = teks.trim().split("\\s+");
        System.out.println("Jumlah kata: " + kata.length);

        // Hitung jumlah vokal dan konsonan
        int jumlahVokal = hitungVokal(teks);
        int jumlahKonsonan = hitungKonsonan(teks);
        System.out.println("Jumlah vokal: " + jumlahVokal);
        System.out.println("Jumlah konsonan: " + jumlahKonsonan);
    }

    // Method untuk menghitung jumlah huruf vokal
    public static int hitungVokal(String teks) {
        String vokal = "aeiouAEIOU";
        int count = 0;
        for (int i = 0; i < teks.length(); i++) {
            if (vokal.contains(String.valueOf(teks.charAt(i)))) {
                count++;
            }
        }
        return count;
    }

    // Method untuk menghitung jumlah konsonan
    public static int hitungKonsonan(String teks) {
        String huruf = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String vokal = "aeiouAEIOU";
        int count = 0;
        for (int i = 0; i < teks.length(); i++) {
            char c = teks.charAt(i);
            if (huruf.contains(String.valueOf(c)) && !vokal.contains(String.valueOf(c))) {
                count++;
            }
        }
        return count;
    }

    // Method untuk membalik string
    public static String reverseString(String teks) {
        StringBuilder reversed = new StringBuilder();
        for (int i = teks.length() - 1; i >= 0; i--) {
            reversed.append(teks.charAt(i));
        }
        return reversed.toString();
    }

    // Method untuk cek palindrome
    public static boolean isPalindrome(String teks) {
        String clean = teks.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = reverseString(clean);
        return clean.equals(reversed);
    }

    // Method untuk mengubah string menjadi Pascal Case
    public static String toPascalCase(String teks) {
        String[] kata = teks.trim().toLowerCase().split("\\s+");
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

    // MAIN PROGRAM
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM MANIPULASI STRING ===");
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine();

        // Analisis dasar
        analisisString(kalimat);

        // String terbalik
        System.out.println("\nString terbalik: \"" + reverseString(kalimat) + "\"");

        // Cek palindrome
        if (isPalindrome(kalimat)) {
            System.out.println("String ini adalah palindrome!");
        } else {
            System.out.println("String ini bukan palindrome.");
        }

        // Pascal Case
        System.out.println("\nKalimat dalam Pascal Case: \"" + toPascalCase(kalimat) + "\"");

        // Pencarian substring
        System.out.print("\nMasukkan kata yang ingin dicari: ");
        String cari = input.nextLine();

        if (kalimat.toLowerCase().contains(cari.toLowerCase())) {
            System.out.println("Kata \"" + cari + "\" ditemukan dalam kalimat.");
            int posisi = kalimat.toLowerCase().indexOf(cari.toLowerCase());
            System.out.println("Posisi pertama: " + posisi);
        } else {
            System.out.println("Kata \"" + cari + "\" tidak ditemukan dalam kalimat.");
        }
    }
}


```
#### Screenshot Hasil tugas latihan 5
![Hasil latihan1](gambar/tugas3.1.jpg)
#### 3. Analisa dan Pembahasan

Program **latihan5.java** ini merupakan pengembangan dari kode sebelumnya dengan penambahan fitur **perhitungan konsonan** dan **konversi ke Pascal Case**.

#### a. Analisis Fitur
1. **Perhitungan Vokal dan Konsonan**
    - Program menggunakan dua string pembanding: `vokal = "aeiouAEIOU"` dan `huruf = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"`.
    - Tiap karakter dalam string diperiksa:
        - Jika termasuk vokal → tambah `countVokal`.
        - Jika huruf tapi bukan vokal → tambah `countKonsonan`.

2. **Pembalikan String (Reverse)**
    - Dengan `StringBuilder`, string dibalik dari indeks terakhir ke 0.

3. **Cek Palindrome**
    - Menghapus karakter non-alfanumerik dengan regex.
    - Membandingkan versi normal dan terbalik.

4. **Pascal Case**
    - Semua kata diubah ke huruf kecil, kemudian huruf pertama tiap kata diubah ke huruf besar.
    - Implementasi menggunakan loop dan `Character.toUpperCase()`.


### 2.5 Praktikum 3.2 – textprocessing/validasi


#### 1. Dasar Teori

**Text Processing** atau pengolahan teks adalah proses membaca, menganalisis, dan memodifikasi data berbentuk teks agar dapat diolah secara sistematis oleh komputer. Dalam bahasa pemrograman Java, pengolahan teks dilakukan dengan memanfaatkan class `String` serta berbagai method pendukung seperti `split()`, `trim()`, `replaceAll()`, `toUpperCase()`, dan `toLowerCase()`.

Konsep penting dalam text processing antara lain:

1. **Pemecahan String (`split`)**  
   Method `.split()` digunakan untuk memisahkan teks menjadi array berdasarkan pemisah tertentu. Contohnya, kalimat yang dipisahkan dengan koma akan dipecah menjadi beberapa bagian yang lebih mudah diolah.

2. **Pembersihan Data (`trim`)**  
   Method `.trim()` digunakan untuk menghapus spasi di awal dan akhir string agar data lebih rapi dan mudah diproses.

3. **Validasi Input (Regular Expression / Regex)**  
   Validasi teks dapat dilakukan dengan ekspresi reguler seperti `[a-zA-Z ]+` untuk memastikan teks hanya mengandung huruf dan spasi tanpa angka atau simbol.

4. **Analisis Teks**  
   Operasi seperti menghitung jumlah kata, huruf vokal, huruf konsonan, atau menentukan panjang karakter dapat dilakukan dengan loop dan kondisi sederhana.

5. **Pemformatan Huruf (Case Formatting)**
    - **Pascal Case / Title Case:** Huruf pertama tiap kata dikapitalisasi.
    - **Lower Case / Upper Case:** Semua huruf diubah menjadi kecil atau besar seluruhnya.

6. **Pengurutan Alfabetis (`compareToIgnoreCase`)**  
   Method ini digunakan untuk mengurutkan teks tanpa membedakan huruf besar dan kecil.

Pengolahan teks penting dalam berbagai aplikasi seperti sistem input pengguna, validasi data, pengolahan nama, pembuatan email otomatis, dan sistem administrasi.

---

#### 2. Langkah Praktikum

1. Membuat package `modul_3` dan `modul_3.latihan` pada project Java.
2. Menambahkan dua file program:
    - **`TextProcessing.java`** untuk mengolah daftar nama mahasiswa.
    - **`latihan6.java`** untuk memvalidasi dan memformat satu nama mahasiswa.
3. Menjalankan program pertama untuk menganalisis daftar nama yang dipisahkan koma.
4. Menjalankan program kedua untuk menguji validasi nama, konversi Pascal Case, dan pembuatan email otomatis.
5. Mencatat hasil keluaran dan membandingkannya dengan teori manipulasi string.

---

#### kode program textprocessing
```java
package modul_3;

import java.util.Scanner;

public class TextProcessing {

    public static void prosesDataMahasiswa(String data) {
        System.out.println("\n=== PENGOLAHAN DATA MAHASISWA ===");

        // Memisahkan data berdasarkan koma
        String[] dataMahasiswa = data.split(",");

        System.out.println("Data yang dimasukkan:");
        for (int i = 0; i < dataMahasiswa.length; i++) {
            dataMahasiswa[i] = dataMahasiswa[i].trim(); // Menghilangkan spasi
            System.out.println((i + 1) + ". " + dataMahasiswa[i]);
        }

        // Analisis data
        System.out.println("\n=== ANALISIS DATA ===");
        System.out.println("Jumlah mahasiswa: " + dataMahasiswa.length);

        // Mencari nama terpanjang dan terpendek
        String namaTerpanjang = dataMahasiswa[0];
        String namaTerpendek = dataMahasiswa[0];

        for (String nama : dataMahasiswa) {
            if (nama.length() > namaTerpanjang.length()) {
                namaTerpanjang = nama;
            }
            if (nama.length() < namaTerpendek.length()) {
                namaTerpendek = nama;
            }
        }

        System.out.println("Nama terpanjang: " + namaTerpanjang + " (" + namaTerpanjang.length() + " karakter)");
        System.out.println("Nama terpendek: " + namaTerpendek + " (" + namaTerpendek.length() + " karakter)");

        // Mengurutkan nama secara alfabetis
        String[] namaUrut = dataMahasiswa.clone();
        for (int i = 0; i < namaUrut.length - 1; i++) {
            for (int j = i + 1; j < namaUrut.length; j++) {
                if (namaUrut[i].compareToIgnoreCase(namaUrut[j]) > 0) {
                    String temp = namaUrut[i];
                    namaUrut[i] = namaUrut[j];
                    namaUrut[j] = temp;
                }
            }
        }

        System.out.println("\nNama mahasiswa (urutan alfabetis):");
        for (int i = 0; i < namaUrut.length; i++) {
            System.out.println((i + 1) + ". " + namaUrut[i]);
        }
    }

    public static void formatNama(String[] nama) {
        System.out.println("\n=== FORMAT NAMA ===");
        for (String n : nama) {
            String namaFormatted = formatTitleCase(n.trim());
            String inisial = buatInisial(namaFormatted);
            System.out.println("Nama lengkap: " + namaFormatted);
            System.out.println("Inisial: " + inisial);
            System.out.println("Username: " + buatUsername(namaFormatted));
            System.out.println("---");
        }
    }

    public static String formatTitleCase(String teks) {
        String[] kata = teks.toLowerCase().split(" ");
        StringBuilder result = new StringBuilder();

        for (String k : kata) {
            if (k.length() > 0) {
                result.append(Character.toUpperCase(k.charAt(0)))
                        .append(k.substring(1))
                        .append(" ");
            }
        }
        return result.toString().trim();
    }

    public static String buatInisial(String nama) {
        String[] kata = nama.split(" ");
        StringBuilder inisial = new StringBuilder();

        for (String k : kata) {
            if (k.length() > 0) {
                inisial.append(Character.toUpperCase(k.charAt(0))).append(".");
            }
        }
        return inisial.toString();
    }

    public static String buatUsername(String nama) {
        return nama.toLowerCase().replaceAll(" ", "").replaceAll("[^a-zA-Z0-9]", "");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM PENGOLAHAN DATA TEKS ===");
        System.out.println("Masukkan nama-nama mahasiswa (pisahkan dengan koma):");
        System.out.print("Contoh: Alice Johnson, bob smith, CHARLIE BROWN\n> ");

        String dataNama = input.nextLine();

        // Proses data
        prosesDataMahasiswa(dataNama);

        // Format nama
        String[] arrayNama = dataNama.split(",");
        formatNama(arrayNama);
    }
}


```
#### Screenshot Hasil textprocessing
![Hasil latihan1](gambar/textprosesing.jpg)
#### kode program latihan 6
```java
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


```
#### Screenshot Hasil tugas latihan 6
![Hasil latihan1](gambar/tugas3.2.jpg)

#### 3. Analisa dan Pembahasan

####  Program TextProcessing

Program ini menerima **daftar nama mahasiswa** dalam satu baris dengan pemisah koma. Setelah itu dilakukan beberapa proses:
- Memisahkan nama menjadi array menggunakan `split()`.
- Menghapus spasi berlebih dengan `trim()`.
- Menentukan jumlah mahasiswa.
- Mencari nama dengan panjang karakter terpendek dan terpanjang.
- Mengurutkan nama secara alfabetis dengan `compareToIgnoreCase()`.
- Memformat nama ke **Title Case**, membuat **inisial**, serta menghasilkan **username** otomatis.

Hasil pengujian menunjukkan bahwa program mampu menampilkan data mahasiswa dengan format yang rapi, menampilkan jumlah total mahasiswa, serta menampilkan daftar nama dalam urutan alfabetis. Program ini juga membantu dalam membentuk nama yang seragam sesuai kaidah penulisan.

---

####  Program Latihan6

Program ini berfokus pada **validasi dan formatting nama tunggal**.  
Langkah-langkah yang dilakukan program meliputi:
1. Memastikan nama yang dimasukkan tidak mengandung angka atau karakter khusus melalui regex `[a-zA-Z ]+`.
2. Mengubah setiap kata menjadi huruf besar di awalnya (**Pascal Case**).
3. Menghitung jumlah huruf konsonan pada nama.
4. Membentuk alamat email otomatis dengan format:  
   `namadepan.namabelakang@student.pnl.ac.id`.

Dari hasil uji coba, program dapat menolak input tidak valid seperti “Budi123” dan menampilkan hasil akhir dengan format nama serta email yang sesuai.

---

####  Pembahasan 

Kedua program memiliki fungsi berbeda namun saling berkaitan.
- `TextProcessing` digunakan untuk pengolahan data teks dalam jumlah banyak (list nama).
- `latihan6` digunakan untuk validasi dan pemrosesan data nama tunggal.

Keduanya mengimplementasikan konsep penting dalam **String Manipulation** seperti pemisahan data, konversi huruf, validasi, perhitungan karakter, dan pembuatan format teks otomatis.  
Dengan memahami metode-metode seperti `split()`, `trim()`, `toLowerCase()`, dan regex, mahasiswa dapat mengolah data teks dengan lebih efektif dan profesional.

---


***

### **3. Kesimpulan**

Berdasarkan praktikum Modul 3 yang telah dilaksanakan, dapat ditarik beberapa kesimpulan utama:

1.  **Array**: Praktikum ini berhasil menunjukkan penggunaan array sebagai struktur data fundamental untuk menyimpan sekumpulan nilai dengan tipe yang sama. Mahasiswa mampu mengimplementasikan array satu dimensi untuk menyimpan dan mengolah data sekuensial (seperti nilai siswa), serta melakukan operasi dasar seperti menghitung rata-rata, mencari nilai maksimum, dan minimum. Selain itu, pemahaman tentang array dua dimensi juga tercapai, yang terbukti efektif untuk merepresentasikan data dalam bentuk tabel (baris dan kolom), seperti daftar nilai beberapa siswa di berbagai mata pelajaran.

2.  **Method**: Konsep modularisasi program menggunakan *method* berhasil diterapkan dengan baik. Melalui pembuatan program kalkulator dan analisis array, mahasiswa memahami cara memecah fungsionalitas kompleks menjadi method-method yang lebih kecil dan spesifik. Hal ini tidak hanya membuat kode lebih terstruktur dan mudah dibaca, tetapi juga meningkatkan *reusability* (kemampuan untuk digunakan kembali) dan menyederhanakan proses *debugging*. Praktikum ini mencakup implementasi method `void` (tanpa nilai kembalian) dan method dengan `return value`.

3.  **String Manipulation**: Mahasiswa berhasil mempraktikkan berbagai teknik manipulasi string yang esensial dalam pengolahan teks. Operasi-operasi seperti menghitung panjang, mengakses karakter, mengubah format huruf (*case conversion*), memecah string menjadi kata-kata (`split`), membalik urutan karakter, hingga validasi input menggunakan ekspresi reguler (`regex`) telah dipahami. Penerapan praktisnya terlihat pada program analisis kalimat, pembuatan format nama, dan pembuatan email otomatis, yang menunjukkan kemampuan mengolah data teks secara efektif.

Secara keseluruhan, praktikum Modul 3 memberikan landasan yang kuat bagi mahasiswa dalam mengelola data menggunakan array, menstrukturkan logika program dengan method, dan memanipulasi data teks menggunakan kelas String di Java.

### **4. Referensi**

1.  Deitel, P. J., & Deitel, H. M. (2017). *Java: How to Program* (11th Edition). Pearson.
2.  Bloch, J. (2018). *Effective Java* (3rd Edition). Addison-Wesley Professional.
3.  Oracle. (2025). *Java Platform, Standard Edition Documentation*. Diakses dari [https://docs.oracle.com/javase/](https://docs.oracle.com/javase/)