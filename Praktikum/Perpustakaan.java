
public class Perpustakaan {
	public static void main(final String[]args){
		Buku [] arrb;
		arrb = new Buku[5];
		
		arrb[0] = new Buku();
		arrb[1] = new Buku();
		arrb[2] = new Buku();
		arrb[3]	= new Buku();
		
		arrb[0].setJudulBuku("Aljabar Linear");
		arrb[0].setNamaPengarang("Kiriza");
		arrb[0].setJumlahHalaman(1909);
		arrb[0].setTahunTerbit(2014);
		
		System.out.println("Judul Buku " + arrb[0].getJudulBuku());
		System.out.println("Nama Pengarang " + arrb[0].getNamaPengarang());
		System.out.println("Jumlah Halaman " + arrb[0].getJumlahHalaman());
		System.out.println("Tahun Terbit " + arrb[0].getTahunTerbit());
		System.out.println("  ");
		
		arrb[1].setJudulBuku("Belajar Memasak Orang");
		arrb[1].setNamaPengarang("Anon");
		arrb[1].setJumlahHalaman(150);
		arrb[1].setTahunTerbit(2019);
		
		System.out.println("Judul Buku " + arrb[1].getJudulBuku());
		System.out.println("Nama Pengarang " + arrb[1].getNamaPengarang());
		System.out.println("Jumlah Halaman " + arrb[1].getJumlahHalaman());
		System.out.println("Tahun Terbit " + arrb[1].getTahunTerbit());
		System.out.println("  ");
		
		arrb[2].setJudulBuku("2000 Leagues Under The Sea");
		arrb[2].setNamaPengarang("Jules Verne");
		arrb[2].setJumlahHalaman(258);
		arrb[2].setTahunTerbit(1999);
		
		System.out.println("Judul Buku"+arrb [2].getJudulBuku());
		System.out.println("Nama Pengarang"+ arrb [2].getNamaPengarang());
		System.out.println("Jumlah Halaman"+ arrb [2].getJumlahHalaman());
		System.out.println("Tahun Terbit"+ arrb[2].getTahunTerbit());
		System.out.println("  ");
		
		arrb[3].setJudulBuku("Topologi Jaringan");
		arrb[3].setNamaPengarang("Ali Sofyan");
		arrb[3].setJumlahHalaman(107);
		arrb[3].setTahunTerbit(2015);
		
		System.out.println("Judul Buku"+ arrb[3].getJudulBuku());
		System.out.println("Nama Pengarang"+ arrb [2].getNamaPengarang());
		System.out.println("Jumlah Halaman"+ arrb [2].getJumlahHalaman());
		System.out.println("Tahun Terbit"+ arrb[2].getTahunTerbit());
		System.out.println("  ");
	}
}
