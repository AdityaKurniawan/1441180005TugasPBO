class testMobil{
	public static void main(String[] args) {
	//instansiasi objek
		//namaClass namaObjek = namaKonstruktor
		Mobil siji = new Mobil();
		Mobil loro = new Mobil(400,"sentul","NN 90 PI","carnival","pink",1500);
		

		System.out.println("MOBIL - MOBIL TERLARIS");
		System.out.println(" ");
        System.out.println("Merk Mobil  :" +siji.getMerk());
        System.out.println("Lokasi      :" +siji.getPosisi());
        System.out.println("Nopol       :" +siji.getPnomor());
        System.out.println("Warna       :" +siji.getWarna());
        System.out.println("Kecepatan mampu mencapai :" +siji.getKecepatan()+ " KMH");
        siji.maju();
        siji.mundur();
        siji.berhenti();
        siji.belok();
        siji.ngebut();
        siji.ngerem();
        System.out.println("Mesin mobil sebesar "+siji.getMesin()+ " cc");
		System.out.println(" ");

        System.out.println("Merk Mobil  :" +loro.getMerk());
        System.out.println("Lokasi      :" +loro.getPosisi());
        System.out.println("Nopol       :" +loro.getPnomor());
        System.out.println("warna       :" +loro.getWarna());
        System.out.println("Kecepatan mampu mencapai :" +loro.getKecepatan()+" KMH");
        loro.maju();
        loro.mundur();
        loro.berhenti();
        loro.belok();
        loro.ngebut();
        loro.ngerem();
        System.out.println("Mesin Mobil sebesar "+loro.getMesin()+ " cc");
                System.out.println(" ");
		
		

	}
}