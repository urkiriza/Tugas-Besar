package Inventaris;

public class KondisiRuangKelas extends Declaration {
	
	public void LuasRuang(){
			LuasRuang = PanjangRuang * LebarRuang;
	}
	public void BentukRuang(){
		BentukRuang = getBentukRuang();
		String PJ = "Persegi Panjang";
		if ((PanjangRuang) != (LuasRuang)){
			System.out.println(PJ);}
		else if((PanjangRuang)==(LuasRuang)){
			System.out.println("Tidak persegi panjang");
			System.out.println("Tidak Sesuai");
			}
		else {
			System.out.println("Bentuk Ruangan Absurd");
			}
	}
	public void RasioLuas(){
		RasioLuas = LuasRuang / JumlahKursi;
		if (RasioLuas >= 0.5){
			System.out.println("Sesuai");
		}
		else if(RasioLuas <= 0.5){
			System.out.println("Input Salah");
		}
	}
	public void JumlahPintudanJendela(){
		JumlahPintu = getJumlahPintu();
		if (JumlahPintu >= 2){
			System.out.println("Sesuai");
		}
		else if (JumlahPintu <= 1){
			System.out.println("Tidak Sesuai");
		}
		JumlahJendela = getJumlahJendela();
		if (JumlahJendela >= 1){
			System.out.println("Sesuai");
		}
		else if(JumlahJendela <= 1){
			System.out.println("Tidak Sesuai");
		}
	}
}