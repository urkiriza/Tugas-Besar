package Inventaris;

public class Kebersihan extends Declaration {
	
	public void SirkulasiUdara(){
		SirkulasiUdara = getSirkulasiUdara();
		String SU = "Terbuka";
		if ("Terbuka".equals(SU))
			System.out.println("Sesuai");
		else if ("Tertutup".equals(SU))
			System.out.println("Tidak Sesuai");
		else
			System.out.println("Input Salah");
	}
	public void Pencahayaan(){
		NilaiPencahayaan = getNilaiPencahayaan();
		int NP = 250;
		if ((NP >= 250) && (NP<=350))
			System.out.println("Cahaya Sesuai");
		else if ((NP >= 1) && (NP <= 249))
			System.out.println("Cahaya Tidak Sesuai");
		else
			System.out.println("Input Salah");
	}
	public void Kelembapan(){
		NilaiKelembapan = getNilaiKelembapan();
		int K = 70;
		if ((K >= 70) && (K <= 80))
			System.out.println("Lembab Sesuai");
		else if ((K >= 1) && (K <= 69))
			System.out.println("Lembab Tidak Sesuai");
		else
			System.out.println("Input Salah");
	}
	public void Suhu(){
		NilaiSuhu = getNilaiSuhu();
		int S = 25;
		if ((S >= 25) && (S <= 	35))
			System.out.println("Suhu Sesuai");
		else if ((S >= 1) && (S <= 24))
			System.out.println("Suhu Tidak Sesuai");
		else
			System.out.println("Input Salah");
	}
}