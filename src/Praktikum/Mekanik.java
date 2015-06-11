package Praktikum;

/**
 * Created by user on 6/11/2015.
 */
public class Mekanik {
    private String namaMekanik;
    private String alamatMekanik;
    private char jenisKelaminMekanik;
    private Motor servis;

    public Mekanik() {
    }

    public Mekanik(String namaMekanik, String alamatMekanik, char jenisKelaminMekanik, Motor servis) {
        this.namaMekanik = namaMekanik;
        this.alamatMekanik = alamatMekanik;
        this.jenisKelaminMekanik = jenisKelaminMekanik;
        this.servis = servis;
    }

    public String getNamaMekanik() {
        return namaMekanik;
    }

    public void setNamaMekanik(String namaMekanik) {
        this.namaMekanik = namaMekanik;
    }

    public String getAlamatMekanik() {
        return alamatMekanik;
    }

    public void setAlamatMekanik(String alamatMekanik) {
        this.alamatMekanik = alamatMekanik;
    }

    public char getJenisKelaminMekanik() {
        return jenisKelaminMekanik;
    }

    public void setJenisKelaminMekanik(char jenisKelaminMekanik) {
        this.jenisKelaminMekanik = jenisKelaminMekanik;
    }

    public Motor getServis() {
        return servis;
    }

    public void setServis(Motor servis) {
        this.servis = servis;
    }

    @Override
    public String toString() {
        return "Mekanik{" +
                "namaMekanik='" + namaMekanik + '\'' +
                ", alamatMekanik='" + alamatMekanik + '\'' +
                ", jenisKelaminMekanik=" + jenisKelaminMekanik +
                ", servis=" + servis +
                '}';
    }
}
