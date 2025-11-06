package modul_4;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---------------------------------------------------------");
        System.out.println("           SISTEM KARTU RENCANA STUDI (KRS)              ");
        System.out.println("---------------------------------------------------------");

        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("NIM           : ");
        String nim = input.nextLine();
        System.out.print("Jurusan       : ");
        String jurusan = input.nextLine();

        Mahasiswa mhs = new Mahasiswa(nama, nim, jurusan, 0.0);
        KartuRencanaStudi krs = new KartuRencanaStudi(mhs, 10);

        boolean running = true;
        while (running) {
            System.out.println("\n---------------------------------------------------------");
            System.out.println("                         MENU KRS                        ");
            System.out.println("---------------------------------------------------------");
            System.out.println("| 1. Tambah Mata Kuliah                                 |");
            System.out.println("| 2. Input Nilai Mata Kuliah                            |");
            System.out.println("| 3. Hapus Mata Kuliah dari KRS                         |");
            System.out.println("| 4. Tampilkan KRS                                      |");
            System.out.println("| 5. Tampilkan Mata Kuliah Nilai Terbaik                |");
            System.out.println("| 6. Tampilkan Mata Kuliah Nilai Terburuk               |");
            System.out.println("| 7. Keluar                                             |");
            System.out.println("---------------------------------------------------------");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n----------------- TAMBAH MATA KULIAH ----------------");
                    System.out.print("Kode Mata Kuliah: ");
                    String kode = input.nextLine();
                    System.out.print("Nama Mata Kuliah: ");
                    String namaMK = input.nextLine();
                    System.out.print("Jumlah SKS      : ");
                    int sks = input.nextInt();
                    input.nextLine();

                    Matakuliah mk = new Matakuliah(kode, namaMK, sks);
                    krs.tambahMatakuliah(mk);
                    break;
                case 2:
                    System.out.println("\n------------------- INPUT NILAI ---------------------");
                    System.out.print("Masukkan Kode Mata Kuliah: ");
                    String kodeCari = input.nextLine();
                    Matakuliah mkCari = krs.cariMatakuliah(kodeCari);
                    if (mkCari != null) {
                        System.out.print("Masukkan Nilai (0-100): ");
                        double nilai = input.nextDouble();
                        input.nextLine();
                        mkCari.setNilai(nilai);
                    } else {
                        System.out.println("Mata kuliah tidak ditemukan!");
                    }
                    break;
                case 3:
                    System.out.println("\n----------------- HAPUS MATA KULIAH -----------------");
                    System.out.print("Masukkan Kode Mata Kuliah yang akan dihapus: ");
                    String kodeHapus = input.nextLine();
                    krs.hapusMatakuliah(kodeHapus);
                    break;
                case 4:
                    krs.tampilkanKRS();
                    break;
                case 5:
                    krs.tampilkanMatakuliahTerbaik();
                    break;
                case 6:
                    krs.tampilkanMatakuliahTerburuk();
                    break;
                case 7:
                    running = false;
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        input.close();
    }
}