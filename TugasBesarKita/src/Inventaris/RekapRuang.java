package Inventaris;


abstract public class RekapRuang extends Sistem{
	
	public RekapRuang(){
		super();
	}
	
	@Override
	String Review() {
		// TODO Auto-generated method stub
		Ruangan();
		HitungLuasRuang();
		HitungRasioRuangan();
		AnalisisPdanJ();
		AnalisisListrik();
		AnalisisProyektor();
		AnalisisLampu();
		AnalisisKipasAngin();
		AnalisisAC();
		AnalisisInternet();
		AnalisisCCTV();
		AnalisisKondisiLantai();
		AnalisisKondisiDinding();
		AnalisisKondisiAtap();
		AnalisisKondisiPintu();
		AnalisisKondisiJendela();
		AnalisisSirUdara();
		AnalisisPencahayaan();
		AnalisisKelmabapan();
		AnalisisSuhu();
		AnalisisKebisingan();
		AnalisisBau();
		AnalisisKebocoran();
		AnalisisKerusakan();
		AnalisisKeausan();
		AnalisisKekokohan();
		AnalisisKunciPintu();
		AnalisisKunciJendela();
		AnalisisKeamananRuang();
		
		
		return null;
	}
}