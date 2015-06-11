package Percobaan;

/**
 * Created by user on 6/11/2015.
 */
public class TestClass {
    public static void main(String[] args) {
        Penulis adityaDika = new Penulis("Aditya Dika","Madiun",'l',"Perjaka",19);
        Penulis KurniawanDika = new Penulis("Kurniawan Dika","Malang",'l',"Duda",45);

        Buku kambingJantan = new Buku("Kambing Jantan",45.000,"Gramedia",adityaDika);
        System.out.println(kambingJantan.toString());


    }
}
