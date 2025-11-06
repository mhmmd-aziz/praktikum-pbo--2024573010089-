package modul_7.praktikum_1;

public class OverloadingTest {

    public static  void main (String [] args){
        Calculator calc = new Calculator();

        System.out.println(" hasil : " + calc.add(5, 10));
        System.out.println();

        System.out.println(" hasil : " + calc.add(10, 5, 4));
        System.out.println();

        System.out.println(" hasil : " + calc.add("muhammad", "aziz"));
        System.out.println();

        int[] numbers = {1, 1, 2, 8, 9};
        System.out.println(" hasil : " + calc.add(numbers));
        System.out.println();

        System.out.println(" hasil : " + calc.add(15.5, 12.5));
        System.out.println();


        System.out.println("automatic type promotion");
        System.out.println(" hasil : " + calc.add(5, 15.5));

    }

}