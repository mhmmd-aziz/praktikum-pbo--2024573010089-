package modul_4;

// Simpan sebagai KartuRencanaStudi.java
public class KartuRencanaStudi {
    private Mahasiswa mahasiswa;
    private Matakuliah[] daftarMatakuliah;
    private int jumlahMatkul;
    private int maxMatkul;
   
    private static final int MAX_SKS = 24;

    public KartuRencanaStudi(Mahasiswa mahasiswa, int maxMatkul) {
        this.mahasiswa = mahasiswa;
        this.maxMatkul = maxMatkul;
        this.daftarMatakuliah = new Matakuliah[maxMatkul];
        this.jumlahMatkul = 0;
    }

    
    public boolean tambahMatakuliah(Matakuliah matkul) {
        if (jumlahMatkul >= maxMatkul) {
            System.out.println("\n[GAGAL] Note: KRS sudah penuh! Maksimal " + maxMatkul + " mata kuliah.");
            return false;
        }

        if (hitungTotalSKS() + matkul.getSks() > MAX_SKS) {
            System.out.println("\n[GAGAL] Note: Total SKS akan melebihi batas " + MAX_SKS + " SKS.");
            return false;
        }

        daftarMatakuliah[jumlahMatkul] = matkul;
        jumlahMatkul++;
        System.out.println("\n[BERHASIL] Note: Mata kuliah " + matkul.getNama() + " berhasil ditambahkan.");
        return true;
    }

  
    public boolean hapusMatakuliah(String kode) {
        int indexHapus = -1;
        for (int i = 0; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getKode().equalsIgnoreCase(kode)) {
                indexHapus = i;
                break;
            }
        }

        if (indexHapus == -1) {
            System.out.println("\n[GAGAL] Note: Mata kuliah dengan kode " + kode + " tidak ditemukan.");
            return false;
        }

        for (int i = indexHapus; i < jumlahMatkul - 1; i++) {
            daftarMatakuliah[i] = daftarMatakuliah[i + 1];
        }

        daftarMatakuliah[jumlahMatkul - 1] = null;
        jumlahMatkul--;
        System.out.println("\n[BERHASIL] Note: Mata kuliah dengan kode " + kode + " berhasil dihapus.");
        return true;
    }

    public int hitungTotalSKS() {
        int totalSks = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            totalSks += daftarMatakuliah[i].getSks();
        }
        return totalSks;
    }

    public double hitungIPK() {
        if (jumlahMatkul == 0) return 0.0;
        double totalBobot = 0.0;
        int totalSKS = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            totalBobot += (daftarMatakuliah[i].getBobotNilai() * daftarMatakuliah[i].getSks());
            totalSKS += daftarMatakuliah[i].getSks();
        }
        return totalSKS > 0 ? totalBobot / totalSKS : 0.0;
    }

    public void tampilkanKRS() {
        System.out.println("\n---------------------------------------------------------");
        System.out.println("                  KARTU RENCANA STUDI (KRS)              ");
        System.out.println("---------------------------------------------------------");
        System.out.println("Nama Mahasiswa : " + mahasiswa.getNama());
        System.out.println("NIM            : " + mahasiswa.getNim());
        System.out.println("Jurusan        : " + mahasiswa.getJurusan());
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-10s %-30s %-5s %-5s\n", "KODE", "MATA KULIAH", "SKS", "NILAI");
        System.out.println("---------------------------------------------------------");

        if (jumlahMatkul == 0) {
            System.out.println("          Belum ada mata kuliah yang diambil.          ");
        } else {
            for (int i = 0; i < jumlahMatkul; i++) {
                Matakuliah mk = daftarMatakuliah[i];
                System.out.printf("%-10s %-30s %-5d %-5s\n", mk.getKode(), mk.getNama(), mk.getSks(), mk.getNilaiHuruf());
            }
        }

        System.out.println("---------------------------------------------------------");
        System.out.println("Total SKS Semester: " + hitungTotalSKS());
        System.out.printf("IPK Semester      : %.2f\n", hitungIPK());
        System.out.println("---------------------------------------------------------");
    }

    public Matakuliah cariMatakuliah(String kode) {
        for (int i = 0; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getKode().equalsIgnoreCase(kode)) {
                return daftarMatakuliah[i];
            }
        }
        return null;
    }

    // MODIFIKASI: Method baru untuk menampilkan mata kuliah terbaik
    public void tampilkanMatakuliahTerbaik() {
        if (jumlahMatkul == 0) {
            System.out.println("\nNote: Belum ada mata kuliah untuk dinilai.");
            return;
        }
        Matakuliah terbaik = null;
        for (int i = 0; i < jumlahMatkul; i++) {
            if(daftarMatakuliah[i].getNilai() > 0) {
                terbaik = daftarMatakuliah[i];
                break;
            }
        }
        if (terbaik == null) {
            System.out.println("\nNote: Belum ada mata kuliah yang diberi nilai.");
            return;
        }
        for (int i = 1; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getNilai() > terbaik.getNilai()) {
                terbaik = daftarMatakuliah[i];
            }
        }
        System.out.println("\n----------- MATA KULIAH NILAI TERBAIK -------------");
        terbaik.tampilkanInfo();
        System.out.println("---------------------------------------------------");
    }

    // MODIFIKASI: Method baru untuk menampilkan mata kuliah terburuk
    public void tampilkanMatakuliahTerburuk() {
        if (jumlahMatkul == 0) {
            System.out.println("\nNote: Belum ada mata kuliah untuk dinilai.");
            return;
        }
        Matakuliah terburuk = null;
        for (int i = 0; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getNilai() > 0) {
                terburuk = daftarMatakuliah[i];
                break;
            }
        }
        if (terburuk == null) {
            System.out.println("\nNote: Belum ada mata kuliah yang diberi nilai.");
            return;
        }
        for (int i = 1; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getNilai() > 0 && daftarMatakuliah[i].getNilai() < terburuk.getNilai()) {
                terburuk = daftarMatakuliah[i];
            }
        }
        System.out.println("\n----------- MATA KULIAH NILAI TERBURUK ------------");
        terburuk.tampilkanInfo();
        System.out.println("---------------------------------------------------");
    }
}