package Inventaris;
import java.util.Scanner;
public abstract class Masukkan implements Inter {
	Scanner in = new Scanner(System.in);
	
	public void Face(){
		Pengguna DD = new Pengguna();
		System.out.print("Masukkan Nama Ruangan : ");
		String Nama = in.nextLine();
		DD.setNamaRuang(Nama);
		System.out.println("Masukkan Lokasi Ruangan : ");
		String Lokasi = in.nextLine();
		DD.setLokasiRuang(Lokasi);
		System.out.println("Masukkan Program Studi : ");
		String ProDi = in.nextLine();
		DD.setProgramStudi(ProDi);
		System.out.println("Masukkan Fakultas : ");
		String Fak = in.nextLine();
		DD.setFakultas(Fak);
		System.out.println("Masukkan Panjang Ruangan : ");
		int PR = in.nextInt();
		DD.setPanjangRuang(PR);
		System.out.println("Masukkan Lebar Ruangan : ");
		int LR = in.nextInt();
		DD.setLebarRuang(LR);
		System.out.println("Masukkan Jumlah Kursi : ");
		int JK = in.nextInt();
		DD.setJumlahKursi(JK);
		System.out.println("Masukkan Jumlah pintu : ");
		int JP = in.nextInt();
		DD.setJumlahPintu(JP);
		System.out.println("Masukkan Jumlah Jendela : ");
		int JJ = in.nextInt();
		DD.setJumlahJendela(JJ);
		System.out.println("Masukkan Jumlah Stop Kontak : ");
		int JSK = in.nextInt();
		DD.setJumlahStopKontak(JSK);
		System.out.println("Masukkan Kondisi Stop kontak : ");
		String KSK = in.nextLine();
		DD.setKondisiStopKontak(KSK);
		System.out.println("Masukkan Posisi Stop Kontak : ");
		String PSK = in.nextLine();//nggak ada kamsut apa2 kok singkatan doang
		DD.setPosisiStopKontak(PSK);
		System.out.println("Masukkan Jumlah Kabel Proyektor : ");
		int JKP = in.nextInt();
		DD.setJumlahKabelProyektor(JKP);
		System.out.println("Masukkan Kondisi Kabel Proyektor : ");
		String KKP = in.nextLine();
		DD.setKondisiKableProyektor(KKP);
		System.out.println("Masukkan Posisi Kabel Proyektor : ");
		String PKP = in.nextLine();
		DD.setPosisiKabelProyektor(PKP);
		System.out.println("Masukkan Jumlah Lampu : ");
		int JL = in.nextInt();
		DD.setJumlahLampu(JL);
		System.out.println("Masukkan Kondisi Lampu : ");
		String KL = in.nextLine();
		DD.setKondisiLampu(KL);
		System.out.println("Masukkan Posisi Lampu : ");
		String PL = in.nextLine();
		DD.setPosisiLampu(PL);
		System.out.println("Masukkan Jumlah Kipas Angin : ");
		int JKA = in.nextInt();
		DD.setJumlahKipasAngin(JKA);
		System.out.println("Masukkan Kondisi Kiipas Angin : "); 
		String KKA = in.nextLine();
		DD.setKondisiKipasAngin(KKA);
		System.out.println("Masukkan Posisi Kipas Angin : ");
		String PKA = in.nextLine();
		DD.setPosisiKipasAngin(PKA);
		System.out.println("Masukkan Jumlah AC : ");
		int JAC = in.nextInt();
		DD.setJumlahAC(JAC);
		System.out.println("Masukkan Kondisi AC : ");
		String KAC = in.nextLine();
		DD.setKondisiAC(KAC);
		System.out.println("Masukkan Posisi AC : ");
		String PAC = in.nextLine();
		DD.setPosisiAC(PAC);
		System.out.println("Masukkan SSID : ");
		String SSID = in.nextLine();
		DD.setSSID(SSID);
		System.out.println("Masukkan Banwidth : ");
		double BAN = in.nextDouble();
		DD.setBandwith(BAN);
		System.out.println("Masukkan Jumlah CCTV : ");
		int JCCTV = in.nextInt();
		DD.setJumlahCCTV(JCCTV);
		System.out.println("Masukkan Kondisi CCTV : ");
		String KCCTV = in.nextLine();
		DD.setKondisiCCTV(KCCTV);
		System.out.println("Masukkan Posisi CCTV : ");
		String PCCTV = in.nextLine();
		DD.setPosisiCCTV(PCCTV);
		System.out.println("Masukkan kondisi lantai : ");
		String KLL = in.nextLine();
		DD.setKondisiLantai(KLL);
		System.out.println("Masukkan Kondisi Dinding : ");
		String KDD = in.nextLine();
		DD.setKondisiDinding(KDD);
		System.out.println("Masukkan Kondisi Atap : ");
		String KAA = in.nextLine();
		DD.setKondisiAtap(KAA);
		System.out.println("Masukkan kondisi pintu : ");
		String KPP = in.nextLine();
		DD.setKondisiPintu(KPP);
		System.out.println("Masukkan kondisi jendela : ");
		String KJJ = in.nextLine();
		DD.setKondisiJendela(KJJ);
		System.out.println("Masukkan Sirkulasi udara : ");
		String SSU = in.nextLine();
		DD.setSirkulasiUdara(SSU);
		System.out.println("Masukkan Nilai Pencahayaan : ");
		int NP = in.nextInt();
		DD.setNilaiPencahayaan(NP);
		System.out.println("Masukkan Nilai Kelambapan : ");
		int NK = in.nextInt();
		DD.setNilaiKelembapan(NK);
		System.out.println("Masukkan Nilai Suhu : ");
		int NS = in.nextInt();
		DD.setNilaiSuhu(NS);
		System.out.println("Masukkan Kebisingan : ");
		String KBS = in.nextLine();
		DD.setKebisingan(KBS);
		System.out.println("Masukkan Kebauan : ");
		String KBU = in.nextLine();
		DD.setKebauan(KBU);
		System.out.println("Masukkan Kebocoran : ");
		String KBC = in.nextLine();
		DD.setKebocoran(KBC);
		System.out.println("Masukkan Kerusakan : ");
		String KRS = in.nextLine();
		DD.setKerusakan(KRS);
		System.out.println("Masukkan Keausan : ");
		String KAU = in.nextLine();
		DD.setKeausan(KAU);
		System.out.println("Masukkan Kekokohan : ");
		String KKH = in.nextLine();
		DD.setKekokohan(KKH);
		System.out.println("Masukkan Kunci Pintu :");
		String KPI = in.nextLine();
		DD.setKunciPintu(KPI);
		System.out.println("Masukkan Kunci Jendela : ");
		String KJA = in.nextLine();
		DD.setKunciJendela(KJA);
		System.out.println("Masukkan tingkat bahaya : ");
		String TBH = in.nextLine();
		DD.setTingkatBahaya(TBH);
		
				
		return Face();
		
	}
	
}
