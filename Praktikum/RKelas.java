
public class RKelas {
	public static void main (String[] args){
		
		RuangKelas[] arrkls;
		arrkls = new RuangKelas [1];
		
		arrkls [0] = new RuangKelas();
					
		arrkls [0].setPanjang(100);
		arrkls [0].setLebar(60);
		arrkls [0].setJumlahKursi(20);
		arrkls [0].setJumlahPintu(2);
		arrkls [0].setJumlahJendela(6);
		
		arrkls[0].hitungrasioluas(arrkls[0].getPanjang(), arrkls[0].getLebar(), arrkls[0].getJumlahKursi());
		arrkls[0].hitungluas(arrkls[0].getPanjang(), arrkls[0].getLebar());
	}

}
