package modul_4;

public class Motor {

    int plat;
    String merk;
    String type;
    int tahun;

    Motor(){
        System.out.println("motor bagus");

    }

    void menghidupkanMotor(){
        System.out.println("menghidupkan motor");
    }

}

class Awal{
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.menghidupkanMotor();
    }
}