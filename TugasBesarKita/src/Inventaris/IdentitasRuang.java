package Inventaris;

abstract public class IdentitasRuang extends Sistem implements Masukkan{
	
	public IdentitasRuang() {
		super();
	}
	
	@Override
	String Ruangan() {
		System.out.println("Nama Ruang : "+getNamaRuang());
		System.out.println("Lokasi Ruang : "+getLokasiRuang());
		System.out.println("Program Studi : "+getProgramStudi());
		System.out.println("Fakultas :"+getFakultas());
		
		return null;
	}
}