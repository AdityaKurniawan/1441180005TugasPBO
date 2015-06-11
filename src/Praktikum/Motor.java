package Praktikum;

/**
 * Created by user on 6/11/2015.
 */
public class Motor {
    private String merkMotor;
    private String warnaMotor;
    private Double hargaMotor;
    private String kendalaMotor;

    public Motor() {
    }
    public Motor(String merkMotor, String warnaMotor, Double hargaMotor, String kendalaMotor) {
        this.merkMotor = merkMotor;
        this.warnaMotor = warnaMotor;
        this.hargaMotor = hargaMotor;
        this.kendalaMotor = kendalaMotor;
    }

    public String getMerkMotor() {
        return merkMotor;
    }

    public void setMerkMotor(String merkMotor) {
        this.merkMotor = merkMotor;
    }

    public String getWarnaMotor() {
        return warnaMotor;
    }

    public void setWarnaMotor(String warnaMotor) {
        this.warnaMotor = warnaMotor;
    }
    public Double getHargaMotor() {
        return hargaMotor;
    }

    public void setHargaMotor(Double hargaMotor) {
        this.hargaMotor = hargaMotor;
    }

    public String getKendalaMotor() {
        return kendalaMotor;
    }

    public void setKendalaMotor(String kendalaMotor) {
        this.kendalaMotor = kendalaMotor;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "merkMotor='" + merkMotor + '\'' +
                ", warnaMotor='" + warnaMotor + '\'' +
                ", hargaMotor=" + hargaMotor +
                ", kendalaMotor='" + kendalaMotor + '\'' +
                '}';
    }
}
