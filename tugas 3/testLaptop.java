class testLaptop{
	public static void main(String[] args) {
	//instansiasi objek
		//namaClass namaObjek = namaKonstruktor
		Laptop siji = new Laptop();
		Laptop loro = new Laptop("Dell","Merah");
		Laptop telu = new Laptop("Lenovo","Hitam","Terputus");
		Laptop papat = new Laptop("Asus","Putih","Terhubung",80);

		siji.menyala();
		System.out.println("Laptop Kesatu : Merk ="+siji.getMerk()+"Warna = "+siji.getWarna()+"Wifi ="+siji.getWifi()+"Baterai"+siji.getBaterai());
		siji.indikatorBaterai();
		siji.indikatorWifi();
		loro.menyala();
		System.out.println("Laptop Kedua : Merk ="+loro.getMerk()+"Warna = "+loro.getWarna()+"Wifi ="+loro.getWifi()+"Baterai"+loro.getBaterai());
		loro.mati();
		loro.indikatorBaterai();
		loro.indikatorWifi();
		telu.menyala();
		System.out.println("Laptop Ketiga : Merk ="+telu.getMerk()+"Warna = "+telu.getWarna()+"Wifi ="+telu.getWifi()+"Baterai"+telu.getBaterai());
		telu.mati();
		telu.indikatorBaterai();
		telu.indikatorWifi();
		papat.menyala();
		System.out.println("Laptop Keempat : Merk ="+papat.getMerk()+"Warna = "+papat.getWarna()+"Wifi ="+papat.getWifi()+"Baterai"+papat.getBaterai());
		papat.mati();
		papat.indikatorBaterai();
		papat.indikatorWifi();

		//setter
		System.out.println("Setelah Setter");
		siji.setMerk("Toshiba"); siji.setWarna("Hijau"); siji.setWifi("Terputus"); siji.setBaterai(100);
		siji.menyala();
		System.out.println("Laptop Kesatu : Merk = "+siji.getMerk()+"Wifi = "+siji.getWifi()+"Baterai ="+siji.getBaterai());
		siji.indikatorBaterai();
		siji.indikatorWifi();
		siji.mati();
		papat.setBaterai(100);
		papat.menyala();
		System.out.println("Laptop Keempat : Merk = "+papat.getMerk()+"Wifi = "+papat.getWifi()+"Baterai ="+papat.getBaterai());
		papat.indikatorBaterai();
		papat.indikatorWifi();
		papat.mati();
}	}
