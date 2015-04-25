package PBO_II;

public class RekamMedis {
	private String Nama;
	private int BeratBadan;
	private int Tinggi;
	private int Pria = 100;
	private int Wanita = 110;
	private int Jumlah = 10;
	private String JenisKelamin;
	private double KurangiTinggi,  Penjumlahan;
	
	double setKurangiTinggi(int Tinggi , int Pria ){
		KurangiTinggi = Tinggi - Pria;
		return KurangiTinggi;
	}
	
	double setPenjumlahan(int KurangiTinggi , int Jumlah){
		Penjumlahan = KurangiTinggi / 10;
		return Penjumlahan;
	}
	
	public void setNama(String nama){
		Nama = nama;
	}
	
	public String getNama(){
		return Nama;
	}
	
	public void setBeratBadan(int berat){
		BeratBadan = berat;
	}
	
	public int getBeratBadan(){
		return BeratBadan;
	}
	
	public void setTinggi(int tinggi){
		Tinggi = tinggi;
	}
	
	public int getTinggi(){
		return Tinggi;
	}
	
	public void setJenisKelamin(String jenis){
		JenisKelamin = jenis;
	}
	
	public String getJenisKelamin(){
		return JenisKelamin;
	}

}
