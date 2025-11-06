package modul_7.praktikum_1;

public class Calculator {
    // methode untuk menjumlahkan dua integer
    public  int add(int a, int b) {
        System.out.println("memanngil add (int , int)");
        return a + b;
    }

    // overload method untuk menjummlahkan tiga integer
    public  int add (int a, int b, int c){
        System.out.println("memanggil add (int, int, int)");
        return  a + b + c;
    }

    // menjumlah kan dua variabel yang tipe datanya double
    public double add(double a, double b){
        System.out.println("memanggil add (double, double, int)");
        return  a + b;
    }

    // function untuk menjumlahkan dua array yang tipe datanya array
    public int add(int[] numbers){
        System.out.println("memanggil add (int[])");
        int sum = 0;
        for (int num : numbers){
            sum += num;
        }
        return  sum;
    }

    public String add (String a, String b){
        System.out.println("memanggil add(string, string)");
        return  a + b;
    }
}