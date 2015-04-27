package Inventaris;
import java.util.Scanner;
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
	
	Scanner scan = new Scanner (System.in);
	
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
		if(JumlahStopKontak >= 4){
			System.out.println("Sesuai");
		}
		else if(JumlahStopKontak <=4){
			System.out.println("Tidak Sesuai");
		}
	}
	public int getJumlahStopKontak() {
		return JumlahStopKontak;
	}
	public void setKondisiStopKontak(String kondisistopkontak) {
		KondisiStopKontak = kondisistopkontak;
		String KK = scan.nextLine();
		if ("Baik".equals(KK))
			System.out.println("Kondisi Sesuai");
		else if("Buruk".equals(KK))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
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
		if(JumlahStopKontak >= 1){
			System.out.println("Sesuai");
		}
		else if(JumlahStopKontak <=1){
			System.out.println("Tidak Sesuai");
		}
	}
	public int getJumlahKabelProyektor() {
		return JumlahKabelProyektor;
	}
	public void setKondisiKableProyektor(String kondisikable) {
		KondisiKableProyektor = kondisikable;
		String KE = scan.nextLine();
		if ("Berfungsi".equals(KE))
			System.out.println("Kondisi Sesuai");
		else if("Tidak Berfungsi".equals(KE))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
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
		if(JumlahStopKontak >= 18){
			System.out.println("Sesuai");
		}
		else if(JumlahStopKontak <=18){
			System.out.println("Tidak Sesuai");
		}
		
	}
	public int getJumlahLampu() {
		return JumlahLampu;
	}
	public void setKondisiLampu(String kondisilampu) {
		KondisiLampu = kondisilampu;
		String KP = scan.nextLine();
		if ("Baik".equals(KP))
			System.out.println("Kondisi Sesuai");
		else if("Rusak".equals(KP))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
	}
	public String getKondisiLampu() {
		return KondisiLampu;
	}
	public void setPosisiLampu(String posisilampu) {
		PosisiLampu = posisilampu;
		String PS = scan.nextLine();
		if ("Atap Ruangan".equals(PS))
			System.out.println("Kondisi Sesuai");
		else if("Bawah Ruangan".equals(PS))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
	}
	public String getPosisiLampu() {
		return PosisiLampu;
	}
	public void setJumlahKipasAngin(int jumlahkipasangin) {
		JumlahKipasAngin = jumlahkipasangin;
		if(JumlahStopKontak >= 2){
			System.out.println("Sesuai");
		}
		else if(JumlahStopKontak <=2){
			System.out.println("Tidak Sesuai");
		}
	}
	public int getJumlahKipasAngin() {
		return JumlahKipasAngin;
	}
	public void setKondisiKipasAngin(String kondisikipasangin) {
		KondisiKipasAngin = kondisikipasangin;
		String KI = scan.nextLine();
		if ("Baik".equals(KI))
			System.out.println("Kondisi Sesuai");
		else if("Rusak".equals(KI))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
	}
	public String getKondisiKipasAngin() {
		return KondisiKipasAngin;
	}
	public void setPosisiKipasAngin(String posisikipasangin) {
		PosisiKipasAngin = posisikipasangin;
		String PI = scan.nextLine();
		if ("Atap Ruangan".equals(PI))
			System.out.println("Kondisi Sesuai");
		else if("Bawah Ruangan".equals(PI))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
	}
	public String getPosisiKipasAngin() {
		return PosisiKipasAngin;
	}
	public void setJumlahAC(int jumlahAC) {
		JumlahAC = jumlahAC;
		if(JumlahStopKontak >= 1){
			System.out.println("Sesuai");
		}
		else if(JumlahStopKontak <=1){
			System.out.println("Tidak Sesuai");
		}
	}
	public int getJumlahAC() {
		return JumlahAC;
	}
	public void setKondisiAC(String kondisiAC) {
		KondisiAC = kondisiAC;
		String KC = scan.nextLine();
		if ("Baik".equals(KC))
			System.out.println("Kondisi Sesuai");
		else if("Buruk".equals(KC))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
	}
	public String getKondisiAC() {
		return KondisiAC;
	}
	public void setPosisiAC(String posisiAC) {
		PosisiAC = posisiAC;
		String PI = scan.nextLine();
		if ("Belakang".equals(PI))
			System.out.println("Kondisi Sesuai");
		else if("Samping".equals(PI))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
	}
	public String getPosisiAC() {
		return PosisiAC;
	}
	public void setSSID(String sSID) {
		SSID = sSID;
		String SD = scan.nextLine();
		if ("UMM".equals(SD))
			System.out.println("Kondisi Sesuai");
		else if("Lainnya".equals(SD))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
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
		if(JumlahStopKontak == 2){
			System.out.println("Sesuai");
		}
		else if(JumlahStopKontak <=2){
			System.out.println("Tidak Sesuai");
		}
	}
	public int getJumlahCCTV() {
		return JumlahCCTV;
	}
	public void setKondisiCCTV(String kondisiCCTV) {
		KondisiCCTV = kondisiCCTV;
		String CT = scan.nextLine();
		if ("Baik".equals(CT))
			System.out.println("Kondisi Sesuai");
		else if("Buruk".equals(CT))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
	}
	public String getKondisiCCTV() {
		return KondisiCCTV;
	}
	public void setPosisiCCTV(String posisiCCTV) {
		PosisiCCTV = posisiCCTV;
		String PC = scan.nextLine();
		if ("Depan".equals(PC))
			System.out.println("Kondisi Sesuai");
		else if("Belakang".equals(PC))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
	}
	public String getPosisiCCTV() {
		return PosisiCCTV;
	}
	public void setKondisiLantai(String kondisilantai) {
		KondisiLantai = kondisilantai;
		String KL = scan.nextLine();
		if("Bersih".equals(KL))
			System.out.println("Sesuai");
		else if("Kotor".equals(KL))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
	}
	public String getKondisiLantai() {
		return KondisiLantai;
	}
	public void setKondisiDinding(String kondisidinding) {
		KondisiDinding = kondisidinding;
		String KD = scan.nextLine();
		if("Bersih".equals(KD))
			System.out.println("Sesuai");
		else if("Kotor".equals(KD))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
	}
	public String getKondisiDinding() {
		return KondisiDinding;
	}
	public void setKondisiAtap(String kondisiatap) {
		KondisiAtap = kondisiatap;
		String KA = scan.nextLine();
		if("Bersih".equals(KA))
			System.out.println("Sesuai");
		else if("Kotor".equals(KA))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
	}
	public String getKondisiAtap() {
		return KondisiAtap;
	}
	public void setKondisiPintu(String kondisipintu) {
		KondisiPintu = kondisipintu;
		String KP = scan.nextLine();
		if("Bersih".equals(KP))
			System.out.println("Sesuai");
		else if("Kotor".equals(KP))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
	}
	public String getKondisiPintu() {
		return KondisiPintu;
	}
	public void setKondisiJendela(String kondisijendela) {
		KondisiJendela = kondisijendela;
		String KJ = scan.nextLine();
		if("Bersih".equals(KJ))
			System.out.println("Sesuai");
		else if("Kotor".equals(KJ))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
	}
	public String getKondisiJendela() {
		return KondisiJendela;
	}
	public void setSirkulasiUdara(String sirkulasiudara) {
		SirkulasiUdara = sirkulasiudara;
		String SU = scan.nextLine();
		if ("Terbuka".equals(SU))
			System.out.println("Sesuai");
		else if ("Tertutup".equals(SU))
			System.out.println("Tidak Sesuai");
		else
			System.out.println("Input Salah");
	}
	public String getSirkulasiUdara() {
		return SirkulasiUdara;
	}
	public void setNilaiPencahayaan(int nilaipencahayaan) {
		NilaiPencahayaan = nilaipencahayaan;
		int NP = scan.nextInt();
		if ((NP >= 250) && (NP<=350))
			System.out.println("Cahaya Sesuai");
		else if ((NP >= 1) && (NP <= 249))
			System.out.println("Cahaya Tidak Sesuai");
		else
			System.out.println("Input Salah");
	}
	public int getNilaiPencahayaan() {
		return NilaiPencahayaan;
	}
	public void setNilaiKelembapan(int nilaikelembapan) {
		NilaiKelembapan = nilaikelembapan;
		int K = scan.nextInt();
		if ((K >= 70) && (K <= 80))
			System.out.println("Lembab Sesuai");
		else if ((K >= 1) && (K <= 69))
			System.out.println("Lembab Tidak Sesuai");
		else
			System.out.println("Input Salah");
	}
	public int getNilaiKelembapan() {
		return NilaiKelembapan;
	}
	public void setNilaiSuhu(int nilaisuhu) {
		NilaiSuhu = nilaisuhu;
		int S = scan.nextInt();
		if ((S >= 25) && (S <= 	35))
			System.out.println("Suhu Sesuai");
		else if ((S >= 1) && (S <= 24))
			System.out.println("Suhu Tidak Sesuai");
		else
			System.out.println("Input Salah");
	}
	public int getNilaiSuhu() {
		return NilaiSuhu;
	}
	public void setKebisingan(String kebisingan) {
		Kebisingan = kebisingan;
		String K = scan.nextLine();
		if ("Tidak Bising".equals(K))
			System.out.println("Kondisi Sesuai");
		else if ("Bising".equals(K))
			System.out.println("Kondisi Tidak Sesuai");
		else
			System.out.println("Input Salah");
	}
	public String getKebisingan() {
		return Kebisingan;
	}
	public void setKebauan(String kebauan) {
		Kebauan = kebauan;
		String B = scan.nextLine();
		if ("Tidak Bau".equals(B))
			System.out.println("Kondisi Sesuai");
		else if ("Bau".equals(B))
			System.out.println("Kondisi Tidak Sesuai");
		else
			System.out.println("Input Salah");
	}
	public String getKebauan() {
		return Kebauan;
	}
	public void setKebocoran(String kebocoran) {
		Kebocoran = kebocoran;
		String C = scan.nextLine();
		if ("Tidak Ada".equals(C))
			System.out.println("Kondisi Sesuai");
		else if ("Ada".equals(C))
			System.out.println("Kondisi Tidak Sesuai");
		else
			System.out.println("Input Salah");
	}
	public String getKebocoran() {
		return Kebocoran;
	}
	public void setKerusakan(String kerusakan) {
		Kerusakan = kerusakan;
		String R = scan.nextLine();
		if ("Tidak Ada".equals(R))
			System.out.println("Kondisi Sesuai");
		else if ("Ada".equals(R))
			System.out.println("Kondisi Tidak Sesuai");
		else 
			System.out.println("Input Salah");
	}
	public String getKerusakan() {
		return Kerusakan;
	}
	public void setKeausan(String keausan) {
		Keausan = keausan;
		String A = scan.nextLine();
		if ("Tidak Ada".equals(A))
			System.out.println("Kondisi Sesuai");
		else if("ada".equals(A))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
	}
	public String getKeausan() {
		return Keausan;
	}
	public void setKekokohan(String kekokohan) {
		Kekokohan = kekokohan;
		String KK = scan.nextLine();
		if ("Kokoh".equals(KK))
			System.out.println("Kondisi Sesuai");
		else if("ada".equals(KK))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
	}
	public String getKekokohan() {
		return Kekokohan;
	}
	public void setKunciPintu(String kuncipintu) {
		KunciPintu = kuncipintu;
		String KP = scan.nextLine();
		if ("Ada".equals(KP))
			System.out.println("Kondisi Sesuai");
		else if("Tidak Ada".equals(KP))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
	}
	public String getKunciPintu() {
		return KunciPintu;
	}
	public void setKunciJendela(String kuncijendela) {
		KunciJendela = kuncijendela;
		String KJ = scan.nextLine();
		if ("Ada".equals(KJ))
			System.out.println("Kondisi Sesuai");
		else if("Tidak Ada".equals(KJ))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
	}
	public String getKunciJendela() {
		return KunciJendela;
	}
	public void setTingkatBahaya(String tingkatbahaya) {
		TingkatBahaya = tingkatbahaya;
		String TB = scan.nextLine();
		if ("Aman".equals(TB))
			System.out.println("Kondisi Sesuai");
		else if("Tidak Aman".equals(TB))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
	}
	public String getTingkatBahaya() {
		return TingkatBahaya;
	}
}