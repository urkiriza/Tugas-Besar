import java.util.Scanner;
public class AdminBuku {
	Buku kertas = new Buku();
	Buku batu = new Buku();
	Buku gunting = new Buku();
	Buku petir = new Buku();
	Buku gajah = new Buku();
	Scanner scan = new Scanner (System.in);
	
	public void insertDataBuku(){
		
		System.out.println("Masukkan Judul Buku >> ");
		kertas.setJudul(scan.nextLine());
		System.out.println("Masukkan Penulis Buku >> ");
		kertas.setPenulis(scan.nextLine());
		System.out.println("Masukkan Jumlah Halaman Buku >> ");
		kertas.setHalaman(scan.nextLine());
		
		System.out.println("Masukkan Judul Buku >> ");
		batu.setJudul(scan.nextLine());
		System.out.println("Masukkan Penulis Buku >> ");
		batu.setPenulis(scan.nextLine());
		System.out.println("Masukkan Jumlah Halaman Buku >> ");
		batu.setHalaman(scan.nextLine());
		
		System.out.println("Masukkan Judul Buku >> ");
		gunting.setJudul(scan.nextLine());
		System.out.println("Masukkan Penulis Buku >> ");
		gunting.setPenulis(scan.nextLine());
		System.out.println("Masukkan Jumlah Halaman Buku >> ");
		gunting.setHalaman(scan.nextLine());
		
		System.out.println("Masukkan Judul Buku >> ");
		petir.setJudul(scan.nextLine());
		System.out.println("Masukkan Penulis Buku >> ");
		petir.setPenulis(scan.nextLine());
		System.out.println("Masukkan Jumlah Halaman Buku >> ");
		petir.setHalaman(scan.nextLine());
		
		System.out.println("Masukkan Judul Buku >> ");
		gajah.setJudul(scan.nextLine());
		System.out.println("Masukkan Penulis Buku >> ");
		gajah.setPenulis(scan.nextLine());
		System.out.println("Masukkan Jumlah Halaman Buku >> ");
		gajah.setHalaman(scan.nextLine());
	}
	public void cetakDataBuku(){
		System.out.println("Buku "+kertas.getJudul()+" Dikarang Oleh "+kertas.getPenulis()+"Dengan Jumlah Halaman Sebanyak "+kertas.getHalaman());
		
		System.out.println("Buku "+batu.getJudul()+" Dikarang Oleh "+batu.getPenulis()+"Dengan Jumlah Halaman Sebanyak "+batu.getHalaman());
		
		System.out.println("Buku "+gunting.getJudul()+" Dikarang Oleh "+gunting.getPenulis()+"Dengan Jumlah Halaman Sebanyak "+gunting.getHalaman());
		
		System.out.println("Buku "+petir.getJudul()+" Dikarang Oleh "+petir.getPenulis()+"Dengan Jumlah Halaman Sebanyak "+petir.getHalaman());
		
		System.out.println("Buku "+gajah.getJudul()+" Dikarang Oleh "+gajah.getPenulis()+"Dengan Jumlah Halaman Sebanyak "+gajah.getHalaman());
	}
}
