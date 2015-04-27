package Inventaris;

public class Declaration {
	private String NamaRuang;
	private String LokasiRuang;
	private String ProgramStudi;
	private String Fakultas;
	private int PanjangRuang;
	private int LebarRuang;
	private double LuasRuang, RasioLuas;
	private String BentukRuang;
	private int JumlahKursi;
	private int JumlahPintu;
	private int JumlahJendela;
	private int JumlahStopKontak;
	private String KondisiStopKontak;
	private String PosisiStopKontak;
	private int JumlahKabelProyektor;
	private String KondisiKableProyektor;
	private String PosisiKabelProyektor;
	private int JumlahLampu;
	private String KondisiLampu;
	private String PosisiLampu;
	private int JumlahKipasAngin;
	private String KondisiKipasAngin;
	private String PosisiKipasAngin;
	private int JumlahAC;
	private String KondisiAC;
	private String PosisiAC;
	private String SSID;
	private Double Bandwith;
	private int JumlahCCTV;
	private String KondisiCCTV;
	private String PosisiCCTV;
	private String KondisiLantai;
	private String KondisiDinding;
	private String KondisiAtap;
	private String KondisiPintu;
	private String KondisiJendela;
	private String SirkulasiUdara;
	private int NilaiPencahayaan;
	private int NilaiKelembapan;
	private int NilaiSuhu;
	private String Kebisingan;
	private String Kebauan;
	private String Kebocoran;
	private String Kerusakan;
	private String Keausan;
	private String Kekokohan;
	private String KunciPintu;
	private String KunciJendela;
	private String TingkatBahaya;
	
	double hitungLuasRuang (int PanjangRuang, int LebarRuang){
		LuasRuang = PanjangRuang * LebarRuang;
		System.out.println("Luas Ruang = " + LuasRuang);
		return LuasRuang;
	}
	
	double hitungRasioLuas (double LuasRuang, int JumlahKursi){
		RasioLuas = LuasRuang / JumlahKursi;
		System.out.println("Rasio Luas = " + RasioLuas);
		return RasioLuas;
	}
		
	private void setNamaRuang(String namaruang) {
		NamaRuang = namaruang;
	}
	private String getNamaRuang() {
		return NamaRuang;
	}
	
	private void setLokasiRuang(String lokasiruang) {
		LokasiRuang = lokasiruang;
	}
	private String getLokasiRuang() {
		return LokasiRuang;
	}
	private void setProgramStudi(String program) {
		ProgramStudi = program;
	}
	private String getProgramStudi() {
		return ProgramStudi;
	}
	private void setFakultas(String fakultas) {
		Fakultas = fakultas;
	}
	private String getFakultas() {
		return Fakultas;
	}
	private void setPanjangRuang(int panjangruang) {
		PanjangRuang = panjangruang;
	}
	private int getPanjangRuang() {
		return PanjangRuang;
	}
	private void setLebarRuang(int lebarruang) {
		LebarRuang = lebarruang;
	}
	private int getLebarRuang() {
		return LebarRuang;
	}
	private void setLuasRuang(double luasruang) {
		LuasRuang = luasruang;
	}
	private double getLuasRuang() {
		return LuasRuang;
	}
	private void setBentukRuang(String bentukruang) {
		BentukRuang = bentukruang;
	}
	private String getBentukRuang() {
		return BentukRuang;
	}
	private void setJumlahKursi(int jumlahkursi) {
		JumlahKursi = jumlahkursi;
	}
	private int getJumlahKursi() {
		return JumlahKursi;
	}
	private void setRasioLuas(double rasioluas) {
		RasioLuas = rasioluas;
	}
	private double getRasioLuas() {
		return RasioLuas;
	}
	private void setJumlahPintu(int jumlahpintu) {
		JumlahPintu = jumlahpintu;
	}
	private int getJumlahPintu() {
		return JumlahPintu;
	}
	private void setJumlahJendela(int jumlahjendela) {
		JumlahJendela = jumlahjendela;
	}
	private int getJumlahJendela() {
		return JumlahJendela;
	}
	private void setJumlahStopKontak(int jumlahstopkontak) {
		JumlahStopKontak = jumlahstopkontak;
	}
	private int getJumlahStopKontak() {
		return JumlahStopKontak;
	}
	private void setKondisiStopKontak(String kondisistopkontak) {
		KondisiStopKontak = kondisistopkontak;
	}
	private String getKondisiStopKontak() {
		return KondisiStopKontak;
	}
	private void setPosisiStopKontak(String posisitopkontak) {
		PosisiStopKontak = posisitopkontak;
	}
	private String getPosisiStopKontak() {
		return PosisiStopKontak;
	}
	private void setJumlahKabelProyektor(int jumlahkabel) {
		JumlahKabelProyektor = jumlahkabel;
	}
	private int getJumlahKabelProyektor() {
		return JumlahKabelProyektor;
	}
	private void setKondisiKableProyektor(String kondisikable) {
		KondisiKableProyektor = kondisikable;
	}
	private String getKondisiKableProyektor() {
		return KondisiKableProyektor;
	}
	private void setPosisiKabelProyektor(String posisikabel) {
		PosisiKabelProyektor = posisikabel;
	}
	private String getPosisiKabelProyektor() {
		return PosisiKabelProyektor;
	}
	private void setJumlahLampu(int jumlahlampu) {
		JumlahLampu = jumlahlampu;
	}
	private int getJumlahLampu() {
		return JumlahLampu;
	}
	private void setKondisiLampu(String kondisilampu) {
		KondisiLampu = kondisilampu;
	}
	private String getKondisiLampu() {
		return KondisiLampu;
	}
	private void setPosisiLampu(String posisilampu) {
		PosisiLampu = posisilampu;
	}
	private String getPosisiLampu() {
		return PosisiLampu;
	}
	private void setJumlahKipasAngin(int jumlahkipasangin) {
		JumlahKipasAngin = jumlahkipasangin;
	}
	private int getJumlahKipasAngin() {
		return JumlahKipasAngin;
	}
	private void setKondisiKipasAngin(String kondisikipasangin) {
		KondisiKipasAngin = kondisikipasangin;
	}
	private String getKondisiKipasAngin() {
		return KondisiKipasAngin;
	}
	private void setPosisiKipasAngin(String posisikipasangin) {
		PosisiKipasAngin = posisikipasangin;
	}
	private String getPosisiKipasAngin() {
		return PosisiKipasAngin;
	}
	private void setJumlahAC(int jumlahAC) {
		JumlahAC = jumlahAC;
	}
	private int getJumlahAC() {
		return JumlahAC;
	}
	private void setKondisiAC(String kondisiAC) {
		KondisiAC = kondisiAC;
	}
	private String getKondisiAC() {
		return KondisiAC;
	}
	private void setPosisiAC(String posisiAC) {
		PosisiAC = posisiAC;
	}
	private String getPosisiAC() {
		return PosisiAC;
	}
	private void setSSID(String sSID) {
		SSID = sSID;
	}
	private String getSSID() {
		return SSID;
	}
	private void setBandwith(Double bandwith) {
		Bandwith = bandwith;
	}
	private Double getBandwith() {
		return Bandwith;
	}
	private void setJumlahCCTV(int jumlahCCTV) {
		JumlahCCTV = jumlahCCTV;
	}
	private int getJumlahCCTV() {
		return JumlahCCTV;
	}
	private void setKondisiCCTV(String kondisiCCTV) {
		KondisiCCTV = kondisiCCTV;
	}
	private String getKondisiCCTV() {
		return KondisiCCTV;
	}
	private void setPosisiCCTV(String posisiCCTV) {
		PosisiCCTV = posisiCCTV;
	}
	private String getPosisiCCTV() {
		return PosisiCCTV;
	}
	private void setKondisiLantai(String kondisilantai) {
		KondisiLantai = kondisilantai;
	}
	private String getKondisiLantai() {
		return KondisiLantai;
	}
	private void setKondisiDinding(String kondisidinding) {
		KondisiDinding = kondisidinding;
	}
	private String getKondisiDinding() {
		return KondisiDinding;
	}
	private void setKondisiAtap(String kondisiatap) {
		KondisiAtap = kondisiatap;
	}
	private String getKondisiAtap() {
		return KondisiAtap;
	}
	private void setKondisiPintu(String kondisipintu) {
		KondisiPintu = kondisipintu;
	}
	private String getKondisiPintu() {
		return KondisiPintu;
	}
	private void setKondisiJendela(String kondisijendela) {
		KondisiJendela = kondisijendela;
	}
	private String getKondisiJendela() {
		return KondisiJendela;
	}
	private void setSirkulasiUdara(String sirkulasiudara) {
		SirkulasiUdara = sirkulasiudara;
	}
	private String getSirkulasiUdara() {
		return SirkulasiUdara;
	}
	private void setNilaiPencahayaan(int nilaipencahayaan) {
		NilaiPencahayaan = nilaipencahayaan;
	}
	private int getNilaiPencahayaan() {
		return NilaiPencahayaan;
	}
	private void setNilaiKelembapan(int nilaikelembapan) {
		NilaiKelembapan = nilaikelembapan;
	}
	private int getNilaiKelembapan() {
		return NilaiKelembapan;
	}
	private void setNilaiSuhu(int nilaisuhu) {
		NilaiSuhu = nilaisuhu;
	}
	private int getNilaiSuhu() {
		return NilaiSuhu;
	}
	private void setKebisingan(String kebisingan) {
		Kebisingan = kebisingan;
	}
	private String getKebisingan() {
		return Kebisingan;
	}
	private void setKebauan(String kebauan) {
		Kebauan = kebauan;
	}
	private String getKebauan() {
		return Kebauan;
	}
	private void setKebocoran(String kebocoran) {
		Kebocoran = kebocoran;
	}
	private String getKebocoran() {
		return Kebocoran;
	}
	private void setKerusakan(String kerusakan) {
		Kerusakan = kerusakan;
	}
	private String getKerusakan() {
		return Kerusakan;
	}
	private void setKeausan(String keausan) {
		Keausan = keausan;
	}
	private String getKeausan() {
		return Keausan;
	}
	private void setKekokohan(String kekokohan) {
		Kekokohan = kekokohan;
	}
	private String getKekokohan() {
		return Kekokohan;
	}
	private void setKunciPintu(String kuncipintu) {
		KunciPintu = kuncipintu;
	}
	private String getKunciPintu() {
		return KunciPintu;
	}
	private void setKunciJendela(String kuncijendela) {
		KunciJendela = kuncijendela;
	}
	private String getKunciJendela() {
		return KunciJendela;
	}
	private void setTingkatBahaya(String tingkatbahaya) {
		TingkatBahaya = tingkatbahaya;
	}
	private String getTingkatBahaya() {
		return TingkatBahaya;
	}
}