class Lingkaran {
	int jari2;

	public void nilaiProperty(){
		System.out.println("Jari-jari : "+jari2);
	}
	public void ubahProperty(int jari2Input){
		jari2= jari2Input;
	}
	public double hitungLuasLingkaran(){
		double luas;
		luas = Math.PI * jari2 * jari2;
		return luas; 
	}
	public double hitungKelilingLingkaran(){
		double keliling;
		keliling = Math.PI * 2 * jari2;
		return keliling;
	}
	
}