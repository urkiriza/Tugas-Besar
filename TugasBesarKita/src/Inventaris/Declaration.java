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
		if (RasioLuas >= 0.5){
			System.out.println("Sesuai");
		}
		else if(RasioLuas <= 0.5){
			System.out.println("Input Salah");
		}
		System.out.println("Rasio Luas = " + RasioLuas);
		return RasioLuas;
	}
		
	public void setNamaRuang(String namaruang) {
		NamaRuang = namaruang;
	}
	public String getNamaRuang() {
		return NamaRuang;
	}
	
	public void setLokasiRuang(String lokasiruang) {
		LokasiRuang = lokasiruang;
	}
	public String getLokasiRuang() {
		return LokasiRuang;
	}
	public void setProgramStudi(String program) {
		ProgramStudi = program;
	}
	public String getProgramStudi() {
		return ProgramStudi;
	}
	public void setFakultas(String fakultas) {
		Fakultas = fakultas;
	}
	public String getFakultas() {
		return Fakultas;
	}
	public void setPanjangRuang(int panjangruang) {
		PanjangRuang = panjangruang;
	}
	public int getPanjangRuang() {
		return PanjangRuang;
	}
	public void setLebarRuang(int lebarruang) {
		LebarRuang = lebarruang;
	}
	public int getLebarRuang() {
		return LebarRuang;
	}
	public void setLuasRuang(double luasruang) {
		LuasRuang = luasruang;
	}
	public double getLuasRuang() {
		return LuasRuang;
	}
	public void setBentukRuang(String bentukruang) {
		BentukRuang = bentukruang;
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
	public String getBentukRuang() {
		return BentukRuang;
	}
	public void setJumlahKursi(int jumlahkursi) {
		JumlahKursi = jumlahkursi;
	}
	public int getJumlahKursi() {
		return JumlahKursi;
	}
	public void setRasioLuas(double rasioluas) {
		RasioLuas = rasioluas;
	}
	public double getRasioLuas() {
		return RasioLuas;
	}
	public void setJumlahPintu(int jumlahpintu) {
		JumlahPintu = jumlahpintu;
		if (JumlahPintu >= 2){
			System.out.println("Sesuai");
		}
		else if (JumlahPintu <= 1){
			System.out.println("Tidak Sesuai");
		}
	}
	public int getJumlahPintu() {
		return JumlahPintu;
			}
	public void setJumlahJendela(int jumlahjendela) {
		JumlahJendela = jumlahjendela;
		if (JumlahJendela >= 1){
			System.out.println("Sesuai");
		}
		else if(JumlahJendela <= 1){
			System.out.println("Tidak Sesuai");
		}
	}
	public int getJumlahJendela() {
		return JumlahJendela;
	}
	public void setJumlahStopKontak(int jumlahstopkontak) {
		JumlahStopKontak = jumlahstopkontak;
	}
	public int getJumlahStopKontak() {
		return JumlahStopKontak;
	}
	public void setKondisiStopKontak(String kondisistopkontak) {
		KondisiStopKontak = kondisistopkontak;
	}
	public String getKondisiStopKontak() {
		return KondisiStopKontak;
	}
	public void setPosisiStopKontak(String posisitopkontak) {
		PosisiStopKontak = posisitopkontak;
	}
	public String getPosisiStopKontak() {
		return PosisiStopKontak;
	}
	public void setJumlahKabelProyektor(int jumlahkabel) {
		JumlahKabelProyektor = jumlahkabel;
	}
	public int getJumlahKabelProyektor() {
		return JumlahKabelProyektor;
	}
	public void setKondisiKableProyektor(String kondisikable) {
		KondisiKableProyektor = kondisikable;
	}
	public String getKondisiKableProyektor() {
		return KondisiKableProyektor;
	}
	public void setPosisiKabelProyektor(String posisikabel) {
		PosisiKabelProyektor = posisikabel;
	}
	public String getPosisiKabelProyektor() {
		return PosisiKabelProyektor;
	}
	public void setJumlahLampu(int jumlahlampu) {
		JumlahLampu = jumlahlampu;
	}
	public int getJumlahLampu() {
		return JumlahLampu;
	}
	public void setKondisiLampu(String kondisilampu) {
		KondisiLampu = kondisilampu;
	}
	public String getKondisiLampu() {
		return KondisiLampu;
	}
	public void setPosisiLampu(String posisilampu) {
		PosisiLampu = posisilampu;
	}
	public String getPosisiLampu() {
		return PosisiLampu;
	}
	public void setJumlahKipasAngin(int jumlahkipasangin) {
		JumlahKipasAngin = jumlahkipasangin;
	}
	public int getJumlahKipasAngin() {
		return JumlahKipasAngin;
	}
	public void setKondisiKipasAngin(String kondisikipasangin) {
		KondisiKipasAngin = kondisikipasangin;
	}
	public String getKondisiKipasAngin() {
		return KondisiKipasAngin;
	}
	public void setPosisiKipasAngin(String posisikipasangin) {
		PosisiKipasAngin = posisikipasangin;
	}
	public String getPosisiKipasAngin() {
		return PosisiKipasAngin;
	}
	public void setJumlahAC(int jumlahAC) {
		JumlahAC = jumlahAC;
	}
	public int getJumlahAC() {
		return JumlahAC;
	}
	public void setKondisiAC(String kondisiAC) {
		KondisiAC = kondisiAC;
	}
	public String getKondisiAC() {
		return KondisiAC;
	}
	public void setPosisiAC(String posisiAC) {
		PosisiAC = posisiAC;
	}
	public String getPosisiAC() {
		return PosisiAC;
	}
	public void setSSID(String sSID) {
		SSID = sSID;
	}
	public String getSSID() {
		return SSID;
	}
	public void setBandwith(Double bandwith) {
		Bandwith = bandwith;
	}
	public Double getBandwith() {
		return Bandwith;
	}
	public void setJumlahCCTV(int jumlahCCTV) {
		JumlahCCTV = jumlahCCTV;
	}
	public int getJumlahCCTV() {
		return JumlahCCTV;
	}
	public void setKondisiCCTV(String kondisiCCTV) {
		KondisiCCTV = kondisiCCTV;
	}
	public String getKondisiCCTV() {
		return KondisiCCTV;
	}
	public void setPosisiCCTV(String posisiCCTV) {
		PosisiCCTV = posisiCCTV;
	}
	public String getPosisiCCTV() {
		return PosisiCCTV;
	}
	public void setKondisiLantai(String kondisilantai) {
		KondisiLantai = kondisilantai;
	}
	public String getKondisiLantai() {
		return KondisiLantai;
	}
	public void setKondisiDinding(String kondisidinding) {
		KondisiDinding = kondisidinding;
	}
	public String getKondisiDinding() {
		return KondisiDinding;
	}
	public void setKondisiAtap(String kondisiatap) {
		KondisiAtap = kondisiatap;
	}
	public String getKondisiAtap() {
		return KondisiAtap;
	}
	public void setKondisiPintu(String kondisipintu) {
		KondisiPintu = kondisipintu;
	}
	public String getKondisiPintu() {
		return KondisiPintu;
	}
	public void setKondisiJendela(String kondisijendela) {
		KondisiJendela = kondisijendela;
	}
	public String getKondisiJendela() {
		return KondisiJendela;
	}
	public void setSirkulasiUdara(String sirkulasiudara) {
		SirkulasiUdara = sirkulasiudara;
	}
	public String getSirkulasiUdara() {
		return SirkulasiUdara;
	}
	public void setNilaiPencahayaan(int nilaipencahayaan) {
		NilaiPencahayaan = nilaipencahayaan;
	}
	public int getNilaiPencahayaan() {
		return NilaiPencahayaan;
	}
	public void setNilaiKelembapan(int nilaikelembapan) {
		NilaiKelembapan = nilaikelembapan;
	}
	public int getNilaiKelembapan() {
		return NilaiKelembapan;
	}
	public void setNilaiSuhu(int nilaisuhu) {
		NilaiSuhu = nilaisuhu;
	}
	public int getNilaiSuhu() {
		return NilaiSuhu;
	}
	public void setKebisingan(String kebisingan) {
		Kebisingan = kebisingan;
	}
	public String getKebisingan() {
		return Kebisingan;
	}
	public void setKebauan(String kebauan) {
		Kebauan = kebauan;
	}
	public String getKebauan() {
		return Kebauan;
	}
	public void setKebocoran(String kebocoran) {
		Kebocoran = kebocoran;
	}
	public String getKebocoran() {
		return Kebocoran;
	}
	public void setKerusakan(String kerusakan) {
		Kerusakan = kerusakan;
	}
	public String getKerusakan() {
		return Kerusakan;
	}
	public void setKeausan(String keausan) {
		Keausan = keausan;
	}
	public String getKeausan() {
		return Keausan;
	}
	public void setKekokohan(String kekokohan) {
		Kekokohan = kekokohan;
	}
	public String getKekokohan() {
		return Kekokohan;
	}
	public void setKunciPintu(String kuncipintu) {
		KunciPintu = kuncipintu;
	}
	public String getKunciPintu() {
		return KunciPintu;
	}
	public void setKunciJendela(String kuncijendela) {
		KunciJendela = kuncijendela;
	}
	public String getKunciJendela() {
		return KunciJendela;
	}
	public void setTingkatBahaya(String tingkatbahaya) {
		TingkatBahaya = tingkatbahaya;
	}
	public String getTingkatBahaya() {
		return TingkatBahaya;
	}
}