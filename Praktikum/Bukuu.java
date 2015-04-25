
public class Bukuu {
	public class AdminBuku {

	}
	private String JudulBuku;
	private String Penulis;
	private String JumlahHalaman;
	private String TahunTerbit;
	
	
	public void setJudulBuku(String judul){
		this.JudulBuku = judul;
	}
	public String getJudulBuku(){
		return this.JudulBuku;
	}
	
	public void setPenulis(String penulis){
		this.Penulis = penulis;
	}
	public String getPenulis(){
		return this.Penulis;
	}
	
	public void setJumlahHalaman(String Halaman){
		this.JumlahHalaman = Halaman;
	} 
	public String getJumlahHalaman(){
		return this.JumlahHalaman;
	}
	
	public void setTahunTerbit (String Tahun){
		this.TahunTerbit = Tahun;
	}
	public String getTahunTerbit(){
		return this.TahunTerbit;
		
	}
	
}
