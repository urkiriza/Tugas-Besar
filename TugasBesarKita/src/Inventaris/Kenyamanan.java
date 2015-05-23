package Inventaris;

public class Kenyamanan extends Declaration{

	public Kenyamanan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String Kebisingan(){
		String K = "Tidak Bising";
		if ("Tidak Bising".equals(K))
			System.out.println("Kondisi Sesuai");
		else if ("Bising".equals(K))
			System.out.println("Kondisi Tidak Sesuai");
		else
			System.out.println("Input Salah");
		return K;
	}
	public String Kebauan(){
		String B = "Tidak Bau";
		if ("Tidak Bau".equals(B))
			System.out.println("Kondisi Sesuai");
		else if ("Bau".equals(B))
			System.out.println("Kondisi Tidak Sesuai");
		else
			System.out.println("Input Salah");
		return B;
	}
	public String Kebocoran(){
		String C = "Tidak Ada";
		if ("Tidak Ada".equals(C))
			System.out.println("Kondisi Sesuai");
		else if ("Ada".equals(C))
			System.out.println("Kondisi Tidak Sesuai");
		else
			System.out.println("Input Salah");
		return C;
	}
	public String Kerusakan(){
		String R = "TidaK Ada";
		if ("Tidak Ada".equals(R))
			System.out.println("Kondisi Sesuai");
		else if ("Ada".equals(R))
			System.out.println("Kondisi Tidak Sesuai");
		else 
			System.out.println("Input Salah");
		return R;
	}
	public String Keausan(){
		String A = "Tidak Ada";
		if ("Tidak Ada".equals(A))
			System.out.println("Kondisi Sesuai");
		else if("ada".equals(A))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
		return A;
	}
}