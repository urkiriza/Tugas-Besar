package Inventaris;

abstract public class IdentitasRuang extends Sistem implements Masukkan{
	
	public IdentitasRuang() {
		super();
	}
	
	@Override
	String Ruangan() {
		System.out.println("Nama Ruang : "+getNamaRuang());
		
		return null;
	}
}