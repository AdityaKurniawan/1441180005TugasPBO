package tugas8;

import java.util.ArrayList;

/**
 * Created by user on 6/24/2015.
 */
public class Liga {
    private String namaLiga;
    ArrayList<Divisi> daftarDivisi = new ArrayList<Divisi>();
    private Klub daftarKlub;
    public Liga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public Liga(Klub daftarKlub) {
        this.daftarKlub = daftarKlub;
    }

    public String getNamaLiga() {
        return namaLiga;
    }

    public void setNamaLiga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public Klub getDaftarKlub() {
        return daftarKlub;
    }

    public void setDaftarKlub(Klub daftarKlub) {
        this.daftarKlub = daftarKlub;
    }

    public ArrayList<Divisi> getDaftarDivisi() {
        System.out.println("Daftar Divisi");
        return daftarDivisi;
    }

    public void setDaftarDivisi(Divisi divisi) {
        this.daftarDivisi.add(divisi);
    }

    @Override
    public String toString() {
        return "Liga{" +
                "namaLiga='" + namaLiga + '\'' +
                '}';
    }
}
