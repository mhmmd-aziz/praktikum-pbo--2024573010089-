package modul_4;

public class Mahasiswa {
    // Atribut/Field (private untuk encapsulation)
    private String nama;
    private String nim;
    private String jurusan;

    // Constructor dengan parameter
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim; // Sepertinya ada typo di gambar, seharusnya nim
        this.jurusan = jurusan;
    }

    // Getter methods
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }
}
