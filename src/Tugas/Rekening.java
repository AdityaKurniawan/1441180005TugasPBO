package Tugas;

/**
 * Created by user on 6/17/2015.
 */
public class Rekening {
    private Double saldo;

    public Rekening() {
    }

    public Rekening(Double saldo) {

        this.saldo = saldo;
    }

    public Double getSaldo()
    {
        return saldo;
    }

    public void setSaldo(Double saldo)
    {
        this.saldo = saldo;
    }
    public void tarik(Double tarik)
    {
        // untuk mengurangi nilai saldo
        this.saldo = saldo - tarik;
    }
    public void setor(Double setor)
    {
        // untuk meanambah nilai saldo
        this.saldo = saldo + setor;

    }
    @Override
    public String toString() {
        return "Rekening{" +
                "saldo='" + saldo + '\'' +
                '}';
    }
}
