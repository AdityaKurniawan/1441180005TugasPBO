public class Laptop{
	// merk = string
	// warna = string
	// wifi = string
	// baterai = int
	private String merk;
	private String warna;
	private String wifi;
	private int baterai; 

	public Laptop()
	{
		merk	= "Toshiba"; 
		warna	= "Hitam";
		wifi	= "Terhubung";
		baterai	= 50;

	}
	public Laptop(String merkInput, String warnaInput)
	{
		merk	= merkInput; 
		warna	= warnaInput;
	}
	public Laptop(String merkInput, String warnaInput, String wifiInput)
	{

		merk	= merkInput; 
		warna	= warnaInput;
		wifi	= wifiInput;
	}

	public Laptop(String merkInput, String warnaInput, String wifiInput, int bateraiInput)
	{
		merk	= merkInput; 
		warna	= warnaInput;
		wifi	= wifiInput;
		baterai	= bateraiInput;
	}

	public void menyala()
	{
		System.out.println("Welcome to Laptop");
	}

	public void mati()
	{
		System.out.println("Thankyou have nice day");
	}

	public void indikatorBaterai()
	{
		System.out.println("Baterai tinggal : "+ baterai+ "%");
	}
	
	public void indikatorWifi()
	{
		System.out.println("wifinya :"+wifi);
	}

	//getter
	public String getMerk()
	{
		return merk;
	}

	public String getWarna()
	{
		return warna;
	}

	public String getWifi()
	{
		return wifi;
	}

	public int getBaterai()
	{
		return baterai;
	}

	//setter
	public String setMerk(String merk)
	{
		return this.merk = merk;
	}

	public String setWarna(String warna)
	{
		return this.warna = warna;
	}

	public String setWifi(String wifi)
	{
		return this.wifi = wifi;
	}

	public int setBaterai(int baterai)
	{
		return this.baterai = baterai;
	}
}