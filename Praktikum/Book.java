package Praktikum;

public class Book {
	private String Judul;
	private String Penulis;
	private int JumlahHalaman;
	
	public void setJudul(String judul){
		Judul = judul;
	}
	public String getJudul(){
		return Judul;
	}
	public void setPenulis(String penulis){
		Penulis = penulis;
	}
	public String getPenulis(){
		return Penulis;
	}
	public void setJumlahHalaman(int jumlah){
		JumlahHalaman = jumlah;
	}
	public int getJumlahHalaman(){
		return JumlahHalaman;
	}
}
