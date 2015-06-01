package Inventaris;

abstract public class KondisiRuang extends Sistem{

	public KondisiRuang(){
		super();
	}
	
	@Override
	double HitungLuasRuang(int HitungLuasRuang) {
		System.out.println("Luas Ruangan = " + HitungLuasRuang());
		HitungLuasRuang = getPanjangRuang() * getLebarRuang();
		return 0;
	}

	@Override
	double BentukRuang() {
		System.out.println("Bentuk Ruangan = " + BentukRuang());
		String PJ = "Persegi Panjang";
		if ((getPanjangRuang()) != (HitungLuasRuang())){
			System.out.println(PJ);}
		else if((getPanjangRuang())==(HitungLuasRuang())){
			System.out.println("Tidak persegi panjang");
			System.out.println("Tidak Sesuai");
			}
		else {
			System.out.println("Bentuk Ruangan Absurd");
			}
		
		return 0;
	}

	@Override
	double HitungRasioRuangan(double HitungRasioLuas) {
		System.out.println("Rasio Luas Ruangan = " + HitungRasioRuangan());
		HitungRasioLuas = HitungLuasRuang() / getJumlahKursi();
		if (HitungRasioLuas >= 0.5){
			System.out.println("Sesuai");
		}
		else if(HitungRasioLuas <= 0.5){
			System.out.println("Input Salah");
		}
		return 0;
	}

	@Override
	String AnalisisPdanJ() {
		System.out.println("Analisis Pintu dan Jendela = " + AnalisisPdanJ());
		if ((getJumlahPintu() >= 2) && ((getJumlahJendela() >= 1))){
			System.out.println("Sesuai");
		}
		else if ((getJumlahPintu() <= 1) && ((getJumlahJendela() <= 1))){
			System.out.println("Tidak Sesuai");
		}
		return null;
	}	
}
