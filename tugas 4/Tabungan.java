class Tabungan{
		private double simpanan;
		private String pemilik;
		private double norek;
		private int bunga;

		public Tabungan()
		{
			simpanan	= 10000000;
			pemilik		= "aditya kurniawan";
			norek		= 1441180005;
			bunga		= 1;
		}
		
		public Tabungan(double simpananInput, String pemilikInput)
		{
			simpanan 	= simpananInput;
			pemilik 	= pemilikInput; 	

		}
		public Tabungan(double simpananInput, String pemilikInput, double norekInput) 
		{
			simpanan 	= simpananInput;
			pemilik 	= pemilikInput;
			norek 		= norekInput;
		}
		public Tabungan(double simpananInput, String pemilikInput, double norekInput, int bungaInput ) 
		{
			simpanan 	= simpananInput;
			pemilik 	= pemilikInput;
			norek 		= norekInput;
			bunga 		= bungaInput;
		}
		public void menabung()
		{
		System.out.println("anda telah menabung sebesar 	:");
		}
		public void mengambil()
		{
		System.out.println("anda telah mengambil sebesar 	:");
		}
		public void transfer()
		{
			System.out.println("anda telah mentransfer sebesar 	:");
		}
		public void menerimatransfer()
		{
			System.out.println("anda telah menerimatransfer sebesar		:");
		}
		public void ceksaldo()
		{
			System.out.println("anda mempunyai saldo sebesar 	:"+getSimpanan());
		}
		//getter
		public double getSimpanan()
		{
			return simpanan;
		}
		public String getPemilik()
		{
			return pemilik;
		}
		public double getNorek()
		{
			return norek;
		}
		public int getBunga()
		{
			return bunga;
		}
		//setter
		public void setSimpanan(double s)
		{
			simpanan = s;
		}		
		public void setPemilik(String p)
		{
			pemilik  = p;
		}
		public void setNorek(double n)
		{
			norek = n;
		}
		public void setBunga(int b)
		{
			bunga = b;
		}
}