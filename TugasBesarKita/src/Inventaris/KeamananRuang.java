package Inventaris;

abstract public class KeamananRuang extends Sistem implements Masukkan{

	public KeamananRuang(){
		super();
	}
	
	@Override
	String AnalisisKekokohan() {
		System.out.println("Kekokohan = " + AnalisisKekokohan());
		String KK = "Kokoh";
		if (getKekokohan().equals(KK))
			System.out.println("Kondisi Sesuai");
		else if("Tidak Kokoh".equals(getKekokohan()))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisKunciPintu() {
		System.out.println("Analisis Kunci = " + AnalisisKunciPintu());
		String KP = "Ada";
		if(getKunciPintu().equals(KP))
			System.out.println("Kondisi Sesuai");
		else if("Tidak Ada".equals(getKunciPintu()))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisKunciJendela() {
		System.out.println("Analisis Jendela = " + AnalisisKunciJendela());
		String KJ = "Ada";
		if (getKunciJendela().equals(KJ))
			System.out.println("Kondisi Sesuai");
		else if("Tidak Ada".equals(getKunciJendela()))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisKeamananRuang() {
		System.out.println("Analisis Keamanan Ruangan = " + AnalisisKeamananRuang());
		String KR = "Aman";
		if (getTingkatBahaya().equals(KR))
			System.out.println("Kondisi Sesuai");
		else if("Tidak Aman".equals(getTingkatBahaya()))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
		return null;
	}
}
