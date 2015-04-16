class Mobil{
		private double kecepatan;
		private String posisi;
		private String pnomor;
		private String merk;
		private String warna;
		private double mesin;

		public Mobil()
		{
			kecepatan	= 350;
			posisi		= "sentul";
			pnomor		= "AD 11 TT";
			merk		= "avanza";
			warna		= "putih";
			mesin		= 2000;
		}
		 public Mobil(double kecepatanInput, String posisiInput, String pnomorInput, String merkInput, String warnaInput, double mesinInput)
		{
			kecepatan 	= kecepatanInput;
			posisi  	= posisiInput; 	
			pnomor 		= pnomorInput;
			merk 		= merkInput;
			warna 		= warnaInput;
			mesin 		= mesinInput;
		}
		public void maju()
		{
		System.out.println("Anda bisa maju");
		}
		public void mundur()
		{
		System.out.println("Anda bisa mundur");
		}
		public void berhenti()
		{
			System.out.println("Anda bisa berhenti");
		}
		public void belok()
		{
			System.out.println("Anda bisa belok");
		}
		public void ngebut()
		{
			System.out.println("Anda bisa ngebut");
		}
		public void ngerem()
		{
			System.out.println("Anda bisa ngerem");
		}
		
		//getter
		public double getKecepatan()
		{
			return kecepatan;
		}
		public String getPosisi()
		{
			return posisi;
		}
		public String getPnomor()
		{
			return pnomor;
		}
		public String getMerk()
		{
			return merk;
		}
		public String getWarna()
		{
			return warna;
		}
		public double getMesin()
		{
			return mesin;
		}
		//setter
		public void setKecepatan(double k)
		{
			kecepatan = k;
		}		
		public void setPosisi(String p)
		{
			posisi  = p;
		}
		public void setPnomor(String n)
		{
			pnomor = n;
		}
		public void setMerk(String m)
		{
			merk = m;
		}
		public void setWarna(String w)
		{
			warna = w;
		}
		public void setMesin(double s)
		{
			mesin = s;
		}
}