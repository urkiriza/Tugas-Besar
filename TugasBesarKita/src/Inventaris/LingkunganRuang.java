package Inventaris;

abstract public class LingkunganRuang extends Sistem implements Masukkan{

	public LingkunganRuang(){
		super();
	}
	
	@Override
	String AnalisisKondisiLantai() {
		System.out.println("Analisis Kondisi Lantai = " + AnalisisKondisiLantai());
		String KL = "Bersih";
		if(getKondisiLantai().equals(KL))
			System.out.println("Sesuai");
		else if("Kotor".equals(getKondisiLantai()))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisKondisiDinding() {
	System.out.println("Analisis Kondisi DInding = " + AnalisisKondisiDinding());
	String KD = "Bersih";
	if(getKondisiDinding().equals(KD))
		System.out.println("Sesuai");
	else if("Kotor".equals(getKondisiDinding()))
		System.out.println("Tidak Sesuai");
	else 
		System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisKondisiAtap() {
		System.out.println("Analisis Kondisi Atap = " + AnalisisKondisiAtap());
		String KA = "Bersih";
		if(getKondisiAtap().equals(KA))
			System.out.println("Sesuai");
		else if("Kotor".equals(getKondisiAtap()))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisKondisiPintu() {
	System.out.println("Analisis Kondisi Pintu = " + AnalisisKondisiPintu());
	String KP = "Bersih";
	if(getKondisiPintu().equals(KP))
		System.out.println("Sesuai");
	else if("Kotor".equals(getKondisiPintu()))
		System.out.println("Tidak Sesuai");
	else 
		System.out.println("Input Salah");
		return null;
	}

	@Override
	String AnalisisKondisiJendela() {
		System.out.println("Analisis Kondisi Jendela = " + AnalisisKondisiJendela());
		String KJ = "Bersih";
		if(getKondisiJendela().equals(KJ))
			System.out.println("Sesuai");
		else if("Kotor".equals(getKondisiJendela()))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
		return null;
	}	
}
