package Inventaris;

abstract public class KebersihanRuang extends Sistem implements Masukkan{

	public KebersihanRuang(){
		super();
	}
	
	@Override
	String AnalisisSirUdara() {
		System.out.println("Analisis Sirkulasi Udara = " + AnalisisSirUdara());
		String SU = "Terbuka";
		if (getSirkulasiUdara().equals(SU))
			System.out.println("Sesuai");
		else if ("Tertutup".equals(getSirkulasiUdara()))
			System.out.println("Tidak Sesuai");
		else
			System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisPencahayaan() {
		System.out.println("Analisis Pencahayaan = " + AnalisisPencahayaan());
		int NP = getNilaiPencahayaan();
		if ((NP >= 250) && (NP<=350))
			System.out.println("Cahaya Sesuai");
		else if ((NP >= 1) && (NP <= 249))
			System.out.println("Cahaya Tidak Sesuai");
		else
			System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisKelmabapan() {
		System.out.println("Analisis Kelembapan = " + AnalisisKelmabapan());
		int K = getNilaiKelembapan();
		if ((K >= 70) && (K <= 80))
			System.out.println("Lembab Sesuai");
		else if ((K >= 1) && (K <= 69))
			System.out.println("Lembab Tidak Sesuai");
		else
			System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisSuhu() {
		System.out.println("Analisis Suhu = " + AnalisisSuhu());
		int S = getNilaiSuhu();
		if ((S >= 25) && (S <= 	35))
			System.out.println("Suhu Sesuai");
		else if ((S >= 1) && (S <= 24))
			System.out.println("Suhu Tidak Sesuai");
		else
			System.out.println("Input Salah");
		return null;
	}
}
