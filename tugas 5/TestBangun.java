class TestBangun {
	public static void main(String[] args) {
		Segitiga tiga 	= new Segitiga();
		Lingkaran ling 	= new Lingkaran();
		System.out.println("::: SEGITIGA :::"); 
		tiga.tinggi 	= 10;
		tiga.alas		= 5;
		tiga.sisia		= 7;
		tiga.sisib 		= 8;
		tiga.sisic		= 9;

		tiga.nilaiProperty();

		System.out.println("Luas :"+tiga.hitungLuas());
		System.out.println("Keliling :"+tiga.hitungKeliling());

		System.out.println("\n");

		System.out.println("::: LINGKARAN :::");
		ling.jari2 = 8;
		ling.nilaiProperty();

		System.out.println("Luas :"+ling.hitungLuasLingkaran());
		System.out.println("Keliling :"+ling.hitungKelilingLingkaran());
	}
	
}