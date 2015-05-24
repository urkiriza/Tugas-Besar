package Inventaris;

public class Keamanan extends Declaration {
	
	public Keamanan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String Kekokohan(){
		Kekokohan = getKekokohan();
		String KK = "Kokoh";
		if ("Kokoh".equals(KK))
			System.out.println("Kondisi Sesuai");
		else if("ada".equals(KK))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
		return Kekokohan();
	}
	public String KunciPintudanJendela(){
		KunciPintu = getKunciPintu();
		String KP = "Ada";
		if ("Ada".equals(KP))
			System.out.println("Kondisi Sesuai");
		else if("Tidak Ada".equals(KP))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
		
		KunciJendela = getKunciJendela();
		String KJ = "Ada";
		if ("Ada".equals(KJ))
			System.out.println("Kondisi Sesuai");
		else if("Tidak Ada".equals(KJ))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
		return KunciPintudanJendela();
	}
	public String Security(){
		TingkatBahaya = getTingkatBahaya();
		String TB = "Aman";
		if ("Aman".equals(TB))
			System.out.println("Kondisi Sesuai");
		else if("Tidak Aman".equals(TB))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah");
		return Security();
	}
}