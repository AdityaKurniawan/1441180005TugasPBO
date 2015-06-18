package Praktikum;

/**
 * Created by user on 6/11/2015.
 */
public class Test {
    public static void main(String[] args) {

        Motor vegaZr = new Motor("Vega Zr","Hitam",45.000000,"Lampu mati");
        Motor newVixion = new Motor("New Vixion", "Putih",17.000000,"Klep rusak");
        Motor ninja = new Motor("Ninja", "Hitam", 55.000000,"Mesin rusak");

        Mekanik beat = new Mekanik("aditya","Madiun",'l',vegaZr);
        System.out.println(beat.toString());

    }







}
