package Inventaris;

public class Declaration {
	private String NamaRuang;
	private String LokasiRuang;
	private String ProgramStudi;
	private String Fakultas;
	private int PanjangRuang;
	private int LebarRuang;
	private int LuasRuang;
	private String BentukRuang;
	private int JumlahKursi;
	private int RasioLuas;
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
	
	
	private void setNamaRuang(String nama) {
		NamaRuang = nama;
	}
	private String getNamaRuang() {
		return NamaRuang;
	}
	private void setLokasiRuang(String lokasi) {
		LokasiRuang = lokasi;
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
	private void setPanjangRuang(int panjang) {
		PanjangRuang = panjang;
	}
	private int getPanjangRuang() {
		return PanjangRuang;
	}
	private void setLebarRuang(int lebar) {
		LebarRuang = lebar;
	}
	private int getLebarRuang() {
		return LebarRuang;
	}
	private void setLuasRuang(int luas) {
		LuasRuang = luas;
	}
	private int getLuasRuang() {
		return LuasRuang;
	}
	private void setBentukRuang(String bentuk) {
		BentukRuang = bentuk;
	}
	private String getBentukRuang() {
		return BentukRuang;
	}
	private void setJumlahKursi(int jumlah) {
		JumlahKursi = jumlah;
	}
	private int getJumlahKursi() {
		return JumlahKursi;
	}
	private void setRasioLuas(int rasio) {
		RasioLuas = rasio;
	}
	private int getRasioLuas() {
		return RasioLuas;
	}
	private void setJumlahPintu(int pintu) {
		JumlahPintu = pintu;
	}
	private int getJumlahPintu() {
		return JumlahPintu;
	}
	private void setJumlahJendela(int jendela) {
		JumlahJendela = jendela;
	}
	private int getJumlahJendela() {
		return JumlahJendela;
	}
	private void setJumlahStopKontak(int stopkontak) {
		JumlahStopKontak = stopkontak;
	}
	private int getJumlahStopKontak() {
		return JumlahStopKontak;
	}
	private void setKondisiStopKontak(String kstopkontak) {
		KondisiStopKontak = kstopkontak;
	}
	private String getKondisiStopKontak() {
		return KondisiStopKontak;
	}
	private void setPosisiStopKontak(String postopkontak) {
		PosisiStopKontak = postopkontak;
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
	private void setKondisiKableProyektor(String kkable) {
		KondisiKableProyektor = kkable;
	}
	private String getKondisiKableProyektor() {
		return KondisiKableProyektor;
	}
	private void setPosisiKabelProyektor(String poskabel) {
		PosisiKabelProyektor = poskabel;
	}
	private String getPosisiKabelProyektor() {
		return PosisiKabelProyektor;
	}
	private void setJumlahLampu(int lampu) {
		JumlahLampu = lampu;
	}
	private int getJumlahLampu() {
		return JumlahLampu;
	}
	private void setKondisiLampu(String klampu) {
		KondisiLampu = klampu;
	}
	private String getKondisiLampu() {
		return KondisiLampu;
	}
	private void setPosisiLampu(String poslampu) {
		PosisiLampu = poslampu;
	}
	private String getPosisiLampu() {
		return PosisiLampu;
	}
	private void setJumlahKipasAngin(int kipasangin) {
		JumlahKipasAngin = kipasangin;
	}
	private int getJumlahKipasAngin() {
		return JumlahKipasAngin;
	}
	private void setKondisiKipasAngin(String kkipasangin) {
		KondisiKipasAngin = kkipasangin;
	}
	private String getKondisiKipasAngin() {
		return KondisiKipasAngin;
	}
	private void setPosisiKipasAngin(String poskipasangin) {
		PosisiKipasAngin = poskipasangin;
	}
	private String getPosisiKipasAngin() {
		return PosisiKipasAngin;
	}
	private void setJumlahAC(int jAC) {
		JumlahAC = jAC;
	}
	private int getJumlahAC() {
		return JumlahAC;
	}
	private void setKondisiAC(String kAC) {
		KondisiAC = kAC;
	}
	private String getKondisiAC() {
		return KondisiAC;
	}
	private void setPosisiAC(String posAC) {
		PosisiAC = posAC;
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
	private void setKondisiLantai(String klantai) {
		KondisiLantai = klantai;
	}
	private String getKondisiLantai() {
		return KondisiLantai;
	}
	private void setKondisiDinding(String kdinding) {
		KondisiDinding = kdinding;
	}
	private String getKondisiDinding() {
		return KondisiDinding;
	}
	private void setKondisiAtap(String katap) {
		KondisiAtap = katap;
	}
	private String getKondisiAtap() {
		return KondisiAtap;
	}
	private void setKondisiPintu(String kpintu) {
		KondisiPintu = kpintu;
	}
	private String getKondisiPintu() {
		return KondisiPintu;
	}
	private void setKondisiJendela(String kjendela) {
		KondisiJendela = kjendela;
	}
	private String getKondisiJendela() {
		return KondisiJendela;
	}
	private void setSirkulasiUdara(String sirkudara) {
		SirkulasiUdara = sirkudara;
	}
	private String getSirkulasiUdara() {
		return SirkulasiUdara;
	}
	private void setNilaiPencahayaan(int npencahayaan) {
		NilaiPencahayaan = npencahayaan;
	}
	private int getNilaiPencahayaan() {
		return NilaiPencahayaan;
	}
	private void setNilaiKelembapan(int nkelembapan) {
		NilaiKelembapan = nkelembapan;
	}
	private int getNilaiKelembapan() {
		return NilaiKelembapan;
	}
	private void setNilaiSuhu(int nsuhu) {
		NilaiSuhu = nsuhu;
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
	private void setKebauan(String bau) {
		Kebauan = bau;
	}
	private String getKebauan() {
		return Kebauan;
	}
	private void setKebocoran(String bocor) {
		Kebocoran = bocor;
	}
	private String getKebocoran() {
		return Kebocoran;
	}
	private void setKerusakan(String rusak) {
		Kerusakan = rusak;
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