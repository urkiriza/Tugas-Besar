
public class RuangKelas {
	private int Panjang;
	private int Lebar;
	private int JumlahPintu;
	private int JumlahJendela;
	private int JumlahKursi;
	private int Luas;
	private double L,RasioLuas;
	
	double hitungluas(int Panjang, int Lebar){
		this.L = Panjang * Lebar;
		System.out.println("Luas ruang kelas adalah : "+L);
		return L;
	}
	
	double hitungrasioluas(int Panjang, int Lebar, int JumlahKursi){
		RasioLuas= Panjang*Lebar/JumlahKursi;
		System.out.println("Luas Rasio ruang kelas adalah : "+RasioLuas);
		return RasioLuas;
	}
	
	public void setLuas(int luas){
		this.Luas= luas;
	}
	
	public int getLuas(){
		return this.Luas;
	}
	
	public void setPanjang(int panjang){
		this.Panjang = panjang;
	}
	
	public int getPanjang(){
		return this.Panjang;
	}
	
	public void setLebar(int lebar){
		this.Lebar= lebar;
	}
	
	public int getLebar(){
		return this.Lebar;
	}
	
	public void setJumlahPintu(int pintu){
		this.JumlahPintu= pintu;
	}
	
	public int getJumlahPintu(){
		return this.JumlahPintu;
	}
	
	public void setJumlahJendela(int jendela){
		this.JumlahJendela = jendela;
	}
	
	public int getJumlahJendela(){
		return this.JumlahJendela;
	}
	
	public void setJumlahKursi(int kursi){
		this.JumlahKursi= kursi;
	}
	
	public int getJumlahKursi(){
		return this.JumlahKursi;
	}
	


}
