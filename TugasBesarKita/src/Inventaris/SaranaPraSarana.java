package Inventaris;

abstract public class SaranaPraSarana extends Sistem{

	public SaranaPraSarana(){
		super();
	}
	
	@Override
	String AnalisisListrik() {
		
		System.out.println("Jumlah StopKontak = " + getJumlahStopKontak());
		if (getJumlahStopKontak() == 4)
			System.out.println("Jumlah Sesuai");
		else if (getJumlahStopKontak() <= 4)
			System.out.println("Jumlah Kurang");
		else 
			System.out.println("Input Salah");
		
		System.out.println("Kondisi StopKontak = " + getKondisiStopKontak());
		if (getKondisiStopKontak() == "Baik")
			System.out.println("Sesuai");
		else if (getKondisiStopKontak() == "Rusak")
			System.out.println("Kondisi Tidak Sesuai");
		else
			System.out.println("Input Salah");
		
		System.out.println("Posisi StopKontak = " + getPosisiStopKontak());
		if ((getPosisiStopKontak() == "Dipojok Ruang") || (getPosisiStopKontak() == "Dekat Dosen"))
			System.out.println("Kondisi Sesuai");
		else if ((getPosisiStopKontak() != "Dipojok Ruang") || (getPosisiStopKontak() != "Dekat Dosen"))
		System.out.println("Kondisi Tidak Sesuai");
		else 
			System.out.println("Input Salah");
		return AnalisisListrik();
	}

	@Override
	String AnalisisProyektor() {
		System.out.println("Jumlah Kabel Proyektor = " + getJumlahKabelProyektor());
		if (getJumlahKabelProyektor() >= 1)
			System.out.println("Kondisi Sesuai");
		else if (getJumlahKabelProyektor() <= 1)
			System.out.println("Kondisi Tidak Sesuai");
		else 
			System.out.println("Input Salah");
		
		System.out.println("Kondisi Kabel Proyektor = " + getKondisiKableProyektor());
		if (getKondisiKableProyektor() == "Berfungsi")
			System.out.println("Kondisi Sesuai");
		else if (getKondisiKableProyektor() == "Tidak Berfungsi")
			System.out.println("Kondisi Tidak Sesuai");
		else 
			System.out.println("Input Salah");

		System.out.println("Posisi Kabel Proyektor = " + getPosisiKabelProyektor());
		if (getPosisiKabelProyektor() == "Dekat Dosen")
			System.out.println("Kondisi Sesuai");
		else if (getPosisiKabelProyektor() == "Jauh Dari Dosen")
			System.out.println("Kondisi Tidak Sesuai");
		else 
			System.out.println("Input Salah");
		
		return AnalisisProyektor();
	}

	@Override
	String AnalisisLampu() {
		System.out.println("Jumlah Lamput = " + getJumlahLampu());
		if (getJumlahLampu() >= 18)
			System.out.println("Kondisi Sesuai");
		else if (getJumlahLampu() <= 18)
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");
		
		System.out.println("Kondisi Lampu = " + getKondisiLampu());
		if (getKondisiLampu() == "Baik")
			System.out.println("Kondisi Sesuai");
		else if (getKondisiLampu() == "Rusak")
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");
		
		System.out.println("Posisi Lampu = " + getPosisiLampu());
		if (getPosisiLampu() == "Atap Ruangan")
			System.out.println("Kondisi Sesuai");
		else if (getKondisiLampu() == "Di Lantai")
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");
		
		return AnalisisLampu();
	}

	@Override
	String AnalisisKipasAngin() {
		System.out.println("Jumlah Kipas Angin = " + getJumlahKipasAngin());
		if (getJumlahKipasAngin() >= 1)
			System.out.println("Kondisi Sesuai");
		else if (getJumlahKipasAngin() <= 1)
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");

		System.out.println("Kondisi Kipas Angin = " + getKondisiKipasAngin());
		if (getKondisiKipasAngin() == "Baik")
			System.out.println("Kondisi Sesuai");
		else if (getKondisiKipasAngin() == "Rusak")
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");
		
		System.out.println("Posisi Kipas Angin = " + getPosisiKipasAngin());
		if (getPosisiKipasAngin() == "Atap Ruangan")
			System.out.println("Kondisi Sesuai");
		else if (getPosisiKipasAngin() == "Di Lantai")
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");
		
		return AnalisisKipasAngin();
	}

	@Override
	String AnalisisAC() {
		System.out.println("Jumlah AC = " + getJumlahAC());
		if (getJumlahAC() >= 1)
			System.out.println("Kondisi Sesuai");
		else if (getJumlahAC() <=1)
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");

		System.out.println("Kondisi AC = " + getKondisiAC());
		if (getKondisiAC() == "Baik")
			System.out.println("Kondisi Sesuai");
		else if (getKondisiAC() == "Rusak")
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");
		
		System.out.println("Posisi AC = " + getPosisiAC());
		if ((getPosisiAC() == "Dibelakang" || (getPosisiAC() == "Disamping")))
			System.out.println("Kondisi Sesuai");
		else if ((getPosisiAC() != "Dibelakang" || (getPosisiAC() != "Disamping")))
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");
		
		return AnalisisAC();
	}

	@Override
	String AnalisisInternet() {
		if (getSSID() == "UMMHotspot")
			System.out.println("Kondisi Sesuai");
		else if (getSSID() == "Rektorat")
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");
		return AnalisisInternet();
	}

	@Override
	String AnalisisCCTV() {
		System.out.println("Jumlah CCTV = " + getJumlahCCTV());
		if (getJumlahCCTV() == 2)
			System.out.println("Kondisi Sesuai");
		else if (getJumlahCCTV() <= 2)
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");
		
		System.out.println("Kondisi CCTV = " + getKondisiCCTV());
		if (getKondisiCCTV() == "Baik")
			System.out.println("Kondisi Sesuai");
		else if (getKondisiCCTV() == "Rusak")
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");
		
		System.out.println("Posisi CCTV = " + getPosisiCCTV());
		if ((getPosisiCCTV() == "Depan") && (getPosisiCCTV() == "Belakang"))
			System.out.println("Kondisi Sesuai");
		else if ((getPosisiCCTV() != "Depan") && (getPosisiCCTV() != "Belakang"))
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");
		
		return AnalisisCCTV();
	}	
}
