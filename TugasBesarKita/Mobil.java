package TugasBesarKita;

public class Mobil {
 private String Nama;
 private String Warna;
 private int JumlahPintu;
 private String Jenis;
 
 public String getNama() {
	return Nama;
	}
 
 public void setNama(String nama) {
	Nama = nama;
	}
 
 public String getWarna() {
	return Warna;
	}
 
 public void setWarna(String warna) {
	Warna = warna;
	}
 
 public int getJumlahPintu() {
	return JumlahPintu;
	}
 
 public void setJumlahPintu(int jumlahPintu) {
	JumlahPintu = jumlahPintu;
	}
 
 public String getJenis() {
	return Jenis;
	}
 
 public void setJenis(String jenis) {
	Jenis = jenis;
	} 
 
 public void InputData(String N, String W, String J, int JP){
	 
	 setNama(N);
	 setWarna(W);
	 setJenis(J);
	 setJumlahPintu(JP);
	}
 
 public void ShowData(){
	System.out.println("Nama Mobil : " + getNama());
	System.out.println("Warna Mobil : " + getWarna());
	System.out.println("Jumlah Pintu Mobil : " + getJumlahPintu());
	System.out.println("Jenis Mobil : " + getJenis());
 	}
}