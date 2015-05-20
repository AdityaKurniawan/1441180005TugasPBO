class Mahasiswa {
	//
		public String nama;
		public int umur;

		public Mahasiswa()
		{
			nama	="Ridwan Rismanto";
			umur	= 20;
		}
		
		public void tampilkanBiodata(){
			System.out.println("::: Biodata :::");
			System.out.println("Nama  	: "+nama);
			System.out.println("umur 	: "+umur);
		}
		public Mahasiswa(String namaInput, int umurInput) 
		{
			nama = namaInput;
			umur = umurInput;
		}
		//getter
		public String getNama()
		{
			return nama;
		}
		public int getUmur()
		{
			return umur;
		}
		//setter
		public void setNama(String n)
		{
			nama = n;
		}		
		public void setUmur(int u)
		{
			umur  = u;
		}
}		