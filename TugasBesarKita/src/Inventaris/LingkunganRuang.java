package Inventaris;

abstract public class LingkunganRuang extends Sistem{

	public LingkunganRuang(){
		super();
	}
	
	@Override
	String AnalisisKondisiLantai() {
		System.out.println("Analisis Kondisi Lantai = " + AnalisisKondisiLantai());
		String KL = "Bersih";
		if("Bersih".equals(KL))
			System.out.println("Sesuai");
		else if("Kotor".equals(KL))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisKondisiDinding() {
	System.out.println("Analisis Kondisi DInding = " + AnalisisKondisiDinding());
	String KD = "Bersih";
	if("Bersih".equals(KD))
		System.out.println("Sesuai");
	else if("Kotor".equals(KD))
		System.out.println("Tidak Sesuai");
	else 
		System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisKondisiAtap() {
		System.out.println("Analisis Kondisi Atap = " + AnalisisKondisiAtap());
		String KA = "Bersih";
		if("Bersih".equals(KA))
			System.out.println("Sesuai");
		else if("Kotor".equals(KA))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisKondisiPintu() {
	System.out.println("Analisis Kondisi Pintu = " + AnalisisKondisiPintu());
	String KP = "Bersih";
	if("Bersih".equals(KP))
		System.out.println("Sesuai");
	else if("Kotor".equals(KP))
		System.out.println("Tidak Sesuai");
	else 
		System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisKondisiJendela() {
		System.out.println("Analisis Kondisi Jendela = " + AnalisisKondisiJendela());
		String KJ = "Bersih";
		if("Bersih".equals(KJ))
			System.out.println("Sesuai");
		else if("Kotor".equals(KJ))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
		return null;
	}	
}
