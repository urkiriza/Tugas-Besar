package Inventaris;

public class Kenyamanan {

	public void Kebisingan(){
		String K = "Tidak Bising";
		if ("Tidak Bising".equals(K))
			System.out.println("Kondisi Sesuai");
		else if ("Bising".equals(K))
			System.out.println("Kondisi Tidak Sesuai");
		else
			System.out.println("Input Salah");
	}
	public void Kebauan(){
		String B = "Tidak Bau";
		if ("Tidak Bau".equals(B))
			System.out.println("Kondisi Sesuai");
		else if ("Bau".equals(B))
			System.out.println("Kondisi Tidak Sesuai");
		else
			System.out.println("Input Salah");
	}
	public void Kebocoran(){
		String C = "Tidak Ada";
		if ("Tidak Ada".equals(C))
			System.out.println("Kondisi Sesuai");
		else if ("Ada".equals(C))
			System.out.println("Kondisi Tidak Sesuai");
		else
			System.out.println("Input Salah");
	}
	public void Kerusakan(){
		String R = "TidaK Ada";
		if ("Tidak Ada".equals(R))
			System.out.println("Kondisi Sesuai");
		else if ("Ada".equals(R))
			System.out.println("Kondisi Tidak Sesuai");
		else 
			System.out.println("Input Salah");
	}
	public void Keausan(){
		String A = "Tidak Ada";
		if ("Tidak Ada".equals(A))
			System.out.println("Kondisi Sesuai");
		else if("ada".equals(A))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
	}
}