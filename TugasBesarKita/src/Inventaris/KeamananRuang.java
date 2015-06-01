package Inventaris;

abstract public class KeamananRuang extends Sistem{

	public KeamananRuang(){
		super();
	}
	
	@Override
	String AnalisisKekokohan() {
		System.out.println("Kekokohan = " + AnalisisKekokohan());
		String KK = "Kokoh";
		if ("Kokoh".equals(KK))
			System.out.println("Kondisi Sesuai");
		else if("ada".equals(KK))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisKunciPintu() {
		System.out.println("Analisis Kunci = " + AnalisisKunciPintu());
		String KP = "Ada";
		if("Ada".equals(KP))
			System.out.println("Kondisi Sesuai");
		else if("Tidak Ada".equals(KP))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisKunciJendela() {
		System.out.println("Analisis Jendela = " + AnalisisKunciJendela());
		String KJ = "Ada";
		if ("Ada".equals(KJ))
			System.out.println("Kondisi Sesuai");
		else if("Tidak Ada".equals(KJ))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisKeamananRuang() {
		System.out.println("Analisis Keamanan Ruangan = " + AnalisisKeamananRuang());
		String KR = "Aman";
		if ("Aman".equals(KR))
			System.out.println("Kondisi Sesuai");
		else if("Tidak Aman".equals(KR))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
		return null;
	}
}
