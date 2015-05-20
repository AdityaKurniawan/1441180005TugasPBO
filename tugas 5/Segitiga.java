class Segitiga {
	int tinggi;
	int alas;
	int sisia;
	int sisib;
	int sisic;

	public void nilaiProperty(){
		System.out.println("Tinggi 	: "+tinggi);
		System.out.println("Alas 	: "+alas);
		System.out.println("Sisi1 	: "+sisia);
		System.out.println("Sisi2 	: "+sisib);
		System.out.println("Sisi3 	: "+sisic);	
	}
	public void ubahProperty(int tinggiInput, int alasInput, int sisiaInput, int sisibInput, int sisicInput){
	tinggi 	= tinggiInput;
	alas 	= alasInput;
	sisia 	= sisiaInput;
	sisib 	= sisibInput;
	sisic 	= sisicInput;
		
	}
	public int hitungLuas(){
		int luas;
		luas = (alas * tinggi) / 2;
		return luas;
	}
	public int hitungKeliling(){
		int keliling;
		keliling = sisia + sisib + sisic;
		return keliling;
	}
}