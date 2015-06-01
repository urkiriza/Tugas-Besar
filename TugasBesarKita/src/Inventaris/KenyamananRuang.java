package Inventaris;

abstract public class KenyamananRuang extends Sistem{

	public KenyamananRuang(){
		super();
	}
	
	@Override
	String AnalisisKebisingan() {
		System.out.println("Analisis Kebisingan = " + AnalisisKebisingan());
		String K = "Tidak Bising";
		if ("Tidak Bising".equals(K))
			System.out.println("Kondisi Sesuai");
		else if ("Bising".equals(K))
			System.out.println("Kondisi Tidak Sesuai");
		else
			System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisBau() {
		System.out.println("Analisis Bau = " + AnalisisBau());
		String B = "Tidak Bau";
		if ("Tidak Bau".equals(B))
			System.out.println("Kondisi Sesuai");
		else if ("Bau".equals(B))
			System.out.println("Kondisi Tidak Sesuai");
		else
			System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisKebocoran() {
		System.out.println("Analisis Kebocoran = " + AnalisisKebocoran());
		String C = "Tidak Ada";
		if ("Tidak Ada".equals(C))
			System.out.println("Kondisi Sesuai");
		else if ("Ada".equals(C))
			System.out.println("Kondisi Tidak Sesuai");
		else
			System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisKerusakan() {
		System.out.println("Analisis Kerusakan = " + AnalisisKerusakan());
		String R = "TidaK Ada";
		if ("Tidak Ada".equals(R))
			System.out.println("Kondisi Sesuai");
		else if ("Ada".equals(R))
			System.out.println("Kondisi Tidak Sesuai");
		else 
			System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisKeausan() {
	System.out.println("Analisis Keausan =" + AnalisisKeausan());
	String A = "Tidak Ada";
	if ("Tidak Ada".equals(A))
		System.out.println("Kondisi Sesuai");
	else if("ada".equals(A))
		System.out.println("Kondisi Tidak sesuai");
	else
		System.out.println("Input Salah");
		return null;
	}
}
