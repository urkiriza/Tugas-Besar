package Inventaris;

abstract public class Sistem extends Pengguna {
	abstract String Ruangan();
	abstract double HitungLuasRuang();
	abstract double BentukRuang();
	abstract double HitungRasioRuangan();
	abstract String AnalisisPdanJ();
	abstract String AnalisisListrik();
	abstract String AnalisisProyektor();
	abstract String AnalisisLampu();
	abstract String AnalisisKipasAngin();
	abstract String AnalisisAC();
	abstract String AnalisisInternet();
	abstract String AnalisisCCTV();
	abstract String AnalisisKebersihan();
	abstract String AnalisisSirUdara();
	abstract String AnalisisPencahayaan();
	abstract String AnalisisKelmabapan();
	abstract String AnalisisSuhu();
	abstract String AnalisisKebisingan();
	abstract String AnalisisBau();
	abstract String AnalisisKebocoran();
	abstract String AnalisisKerusakan();
	abstract String AnalisisKeausan();
	abstract String AnalisisKekokohan();
	abstract String AnalisisKunciPintu();
	abstract String AnalisisKunciJendela();
	abstract String AnalisisKeamananRuang();
	abstract String Review();
	
	double HitungLuasRuang(int HitungLuasRuang) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	double HitungRasioRuangan(double HitungRasioLuas) {
		// TODO Auto-generated method stub
		return 0;
	}
}
