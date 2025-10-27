package modul_4;

public class Mobil {
    String merek;
    String Warna;
    int tahunProduksi;

    Mobil() {
        System.out.println("Merek Mobil");
    }

    void menghidupkanMesin( ){
        System.out.println("Menghidupkan mesin");
    }
}
class Utama{
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.menghidupkanMesin();
    }
}

