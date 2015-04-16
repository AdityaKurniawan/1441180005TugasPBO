class testTabungan{
	public static void main(String[] args) {
	//instansiasi objek
		//namaClass namaObjek = namaKonstruktor
		Tabungan siji = new Tabungan();
		Tabungan loro = new Tabungan(9000000,"John");
		Tabungan telu = new Tabungan(8000000,"Tamorta",1123456789);
		Tabungan papat = new Tabungan(7000000,"Roy",1234567890,1);

		System.out.println("LAYANAN CANGGIH BANK BCA");
		System.out.println(" ");
        System.out.println("Nama Pemilik : " +siji.getPemilik());
        System.out.println("Nomer Rekening :" +siji.getNorek());
        siji.menabung();
        siji.mengambil();
        siji.transfer();
        siji.menerimatransfer();
        siji.ceksaldo();
        System.out.println("Anda memiliki bunga sebesar "+siji.getBunga()+ " %");
		System.out.println(" ");
		
		loro.setNorek(1123456789);
		loro.setBunga(2);
		System.out.println(" ");
        System.out.println("Nama Pemilik : " +loro.getPemilik());
        System.out.println("Nomer Rekening :" +loro.getNorek());
        loro.menabung();
        loro.mengambil();
        loro.transfer();
        loro.menerimatransfer();
        loro.ceksaldo();
        System.out.println("Anda memiliki bunga sebesar "+loro.getBunga()+" %");

        telu.setBunga(4);
		System.out.println(" ");
        System.out.println("Nama Pemilik : " +telu.getPemilik());
        System.out.println("Nomer Rekening :" +telu.getNorek());
        telu.menabung();
        telu.mengambil();
        telu.transfer();
        telu.menerimatransfer();
        telu.ceksaldo();
        System.out.println("Anda memiliki bunga sebesar "+telu.getBunga()+" %");
        System.out.println(" ");

		System.out.println("Nama Pemilik : " +papat.getPemilik());
        System.out.println("Nomer Rekening :" +papat.getNorek());
        papat.menabung();
        papat.mengambil();
        papat.transfer();
        papat.menerimatransfer();
        papat.ceksaldo();
        System.out.println("Anda memiliki bunga sebesar "+papat.getBunga()+" %");
		
	}
}