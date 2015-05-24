package Inventaris;

public class SaranaPrasarana extends Declaration{
	Declaration DD = new Declaration();	
	
	public SaranaPrasarana() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int Kelistrikkan(){
		if (DD.getJumlahStopKontak() == 4)
			System.out.println("Jumlah Sesuai");
		else if (DD.getJumlahStopKontak() <= 4)
			System.out.println("Jumlah Kurang");
		else 
			System.out.println("Input Salah");
		
		if (DD.getKondisiStopKontak() == "Baik")
			System.out.println("Sesuai");
		else if (DD.getKondisiStopKontak() == "Rusak")
			System.out.println("Kondisi Tidak Sesuai");
		else
			System.out.println("Input Salah");
		
		if ((DD.getPosisiStopKontak() == "Dipojok Ruang") && (DD.getPosisiStopKontak() == "Dekat Dosen"))
			System.out.println("Kondisi Sesuai");
		else if ((DD.getPosisiStopKontak() != "Dipojok Ruang") && (DD.getPosisiStopKontak() != "Dekat Dosen"))
		System.out.println("Kondisi Tidak Sesuai");
		else 
			System.out.println("Input Salah");
		
		return Kelistrikkan();
	}
	
	public int LayarProyektor(){
		if (DD.getJumlahKabelProyektor() >= 1)
			System.out.println("Kondisi Sesuai");
		else if (DD.getJumlahKabelProyektor() <= 1)
			System.out.println("Kondisi Tidak Sesuai");
		else 
			System.out.println("Input Salah");
		
		if (DD.getKondisiKableProyektor() == "Berfungsi")
			System.out.println("Kondisi Sesuai");
		else if (DD.getKondisiKableProyektor() == "Tidak Berfungsi")
			System.out.println("Kondisi Tidak Sesuai");
		else 
			System.out.println("Input Salah");

		if (DD.getPosisiKabelProyektor() == "Dekat Dosen")
			System.out.println("Kondisi Sesuai");
		else if (DD.getPosisiKabelProyektor() == "Jauh Dari Dosen")
			System.out.println("Kondisi Tidak Sesuai");
		else 
			System.out.println("Input Salah");
		return LayarProyektor();
	}
	
	public int Lampu(){
		if (DD.getJumlahLampu() >= 18)
			System.out.println("Kondisi Sesuai");
		else if (DD.getJumlahLampu() <= 18)
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");
		
		if (DD.getKondisiLampu() == "Baik")
			System.out.println("Kondisi Sesuai");
		else if (DD.getKondisiLampu() == "Rusak")
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");
		
		if (DD.getPosisiLampu() == "Atap Ruangan")
			System.out.println("Kondisi Sesuai");
		else if (DD.getKondisiLampu() == "Di Lantai")
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");
		return Lampu();
	}
	
	public int KipasAngin(){
		if (DD.getJumlahKipasAngin() >= 1)
			System.out.println("Kondisi Sesuai");
		else if (DD.getJumlahKipasAngin() <= 1)
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");

		if (DD.getKondisiKipasAngin() == "Baik")
			System.out.println("Kondisi Sesuai");
		else if (DD.getKondisiKipasAngin() == "Rusak")
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");

		if (DD.getPosisiKipasAngin() == "Atap Ruangan")
			System.out.println("Kondisi Sesuai");
		else if (DD.getPosisiKipasAngin() == "Di Lantai")
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");
		return KipasAngin();
	}
	
	public int AC(){
		if (DD.getJumlahAC() >= 1)
			System.out.println("Kondisi Sesuai");
		else if (DD.getJumlahAC() <=1)
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");

		if (DD.getKondisiAC() == "Baik")
			System.out.println("Kondisi Sesuai");
		else if (DD.getKondisiAC() == "Rusak")
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");
		
		if ((DD.getPosisiAC() == "Dibelakang" || (DD.getPosisiAC() == "Disamping")))
			System.out.println("Kondisi Sesuai");
		else if ((DD.getPosisiAC() != "Dibelakang" || (DD.getPosisiAC() != "Disamping")))
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");
		return AC();
	}
	
	public String Internet(){
		if (DD.getSSID() == "UMMHotspot")
			System.out.println("Kondisi Sesuai");
		else if (DD.getSSID() == "Rektorat")
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");
		return Internet();
		
	}
	
	public int CCTV(){
		if (DD.getJumlahCCTV() == 2)
			System.out.println("Kondisi Sesuai");
		else if (DD.getJumlahCCTV() <= 2)
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");
		
		if (DD.getKondisiCCTV() == "Baik")
			System.out.println("Kondisi Sesuai");
		else if (DD.getKondisiCCTV() == "Rusak")
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");
		
		if ((DD.getPosisiCCTV() == "Depan") && (DD.getPosisiCCTV() == "Belakang"))
			System.out.println("Kondisi Sesuai");
		else if ((DD.getPosisiCCTV() != "Depan") && (DD.getPosisiCCTV() != "Belakang"))
			System.out.println("Kondisi TidaK Sesuai");
		else 
			System.out.println("Input Salah");
		return CCTV();
	}
}
