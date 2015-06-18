package Tugas;

/**
 * Created by user on 6/17/2015.
 */
public class TestUnit {

    public static void main(String[] args) {
        // buat objek rekening

        Rekening aa = new Rekening(20000000.0);
        Nasabah bb =new Nasabah("Ardy",aa);
        System.out.printf(bb.toString());

        //tarik saldo sebesar 10 juta
        aa.tarik(10000000.0);
        //menampilkan saldo sekarang
        System.out.println("Tarik rp.10.000.000");
        System.out.println("Saldo sekarang = " + aa.getSaldo());;
                //setor saldo sebear 5 juta
        aa.setor(5000000.0);
        //tampilkan saldo sekarang
        System.out.println("Setor Rp. 5.000.000");
        System.out.println("Saldo Sekarang = " +aa.getSaldo());
    }
}
