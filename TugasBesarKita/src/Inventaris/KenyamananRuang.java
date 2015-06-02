package Inventaris;

abstract public class KenyamananRuang extends Sistem implements Masukkan{

	public KenyamananRuang(){
		super();
	}
	
	@Override
	String AnalisisKebisingan() {
		System.out.println("Analisis Kebisingan = " + AnalisisKebisingan());
		String K = "Tidak Bising";
		if (getKebisingan().equals(K))
			System.out.println("Kondisi Sesuai");
		else if ("Bising".equals(getKebisingan()))
			System.out.println("Kondisi Tidak Sesuai");
		else
			System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisBau() {
		System.out.println("Analisis Bau = " + AnalisisBau());
		String B = "Tidak Bau";
		if (getKebauan().equals(B))
			System.out.println("Kondisi Sesuai");
		else if ("Bau".equals(getKebauan()))
			System.out.println("Kondisi Tidak Sesuai");
		else
			System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisKebocoran() {
		System.out.println("Analisis Kebocoran = " + AnalisisKebocoran());
		String C = "Tidak Ada";
		if (getKebocoran().equals(C))
			System.out.println("Kondisi Sesuai");
		else if ("Ada".equals(getKebocoran()))
			System.out.println("Kondisi Tidak Sesuai");
		else
			System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisKerusakan() {
		System.out.println("Analisis Kerusakan = " + AnalisisKerusakan());
		String R = "TidaK Ada";
		if (getKerusakan().equals(R))
			System.out.println("Kondisi Sesuai");
		else if ("Ada".equals(getKerusakan()))
			System.out.println("Kondisi Tidak Sesuai");
		else 
			System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisKeausan() {
	System.out.println("Analisis Keausan =" + AnalisisKeausan());
	String A = "Tidak Ada";
	if (getKeausan().equals(A))
		System.out.println("Kondisi Sesuai");
	else if("ada".equals(getKeausan()))
		System.out.println("Kondisi Tidak sesuai");
	else
		System.out.println("Input Salah");
		return null;
	}
}
