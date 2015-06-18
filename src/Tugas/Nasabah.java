package Tugas;

/**
 * Created by user on 6/17/2015.
 */
public class Nasabah {
    private String namaNasabah;
    private Rekening saldo;

    public Nasabah() {
    }

    public Nasabah(String namaNasabah, Rekening saldo) {
        this.namaNasabah = namaNasabah;
        this.saldo = saldo;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public void setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
    }

    public Rekening getSaldo() {
        return saldo;
    }

    public void setSaldo(Rekening saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Nasabah{" +
                "namaNasabah='" + namaNasabah + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
