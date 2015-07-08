package tugas8;

/**
 * Created by user on 6/24/2015.
 */
public class Test {
    public static void main(String[] args) {
        // objek
        Liga germany = new Liga("Germany");

        Divisi bundesliga1 = new Divisi("Bundesliga 1");
        Divisi bundesliga2 = new Divisi("Bundesliga 2");

        Klub bayerMunich = new Klub("Bayer Munich",bundesliga1,germany);
        Klub dortmund = new Klub("Dortmund",bundesliga1,germany);

        Klub shalke = new Klub("Shalke",bundesliga2,germany);
        Klub berlin = new Klub("Berlin",bundesliga2,germany);

        germany.setDaftarDivisi(bundesliga1);
        germany.setDaftarDivisi(bundesliga2);

        bundesliga1.setDaftarKlub(bayerMunich);
        bundesliga1.setDaftarKlub(dortmund);

        bundesliga2.setDaftarKlub(shalke);
        bundesliga2.setDaftarKlub(berlin);


        //1 get daftar divisi by nama liga
        System.out.println(germany.getDaftarDivisi());
        System.out.println("");

        //2 get daftar klib by nama liga
        germany.setDaftarKlub(bayerMunich);
        System.out.println(germany.getDaftarKlub());
        System.out.println("");

        //3 get daftar klub by nama divisi
        System.out.println(bundesliga1.getDaftarKlub());
        System.out.println("");

        //4 get klub ini berada di divisi mana by nama klub
        bayerMunich.setNamaKlub("Bayer Munich");
        bayerMunich.setDivisi(bundesliga1);
        System.out.println(bayerMunich.getNamaKlub());
        System.out.println(bayerMunich.getDivisi());
        System.out.println("");

        //5 get klub ini berada di liga apa by nama klub
        dortmund.setLiga(germany);
        dortmund.setNamaKlub("Dortmund");
        System.out.println(dortmund.getNamaKlub());
        System.out.println(dortmund.getLiga());
    }
}
