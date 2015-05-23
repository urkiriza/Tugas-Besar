package Inventaris;

public class Lingkungan extends Declaration {
	
	public Lingkungan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String KondisiLantai(){
		KondisiLantai = getKondisiLantai();
		String KL = "Bersih";
		if("Bersih".equals(KL))
			System.out.println("Sesuai");
		else if("Kotor".equals(KL))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
		return KL;
	}
	
	public String KondisiDinding(){
		KondisiDinding = getKondisiDinding();
		String KD = "Bersih";
		if("Bersih".equals(KD))
			System.out.println("Sesuai");
		else if("Kotor".equals(KD))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
		return KD;
	}
	
	public String KondisiAtap(){
		KondisiAtap = getKondisiAtap();
		String KA = "Bersih";
		if("Bersih".equals(KA))
			System.out.println("Sesuai");
		else if("Kotor".equals(KA))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
		return KA;
	}
	
	public String KondisiPintu(){
		KondisiPintu = getKondisiPintu();
		String KP = "Bersih";
		if("Bersih".equals(KP))
			System.out.println("Sesuai");
		else if("Kotor".equals(KP))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
		return KP;
	}
	
	public String KondisiJendela(){
		KondisiJendela = getKondisiJendela();
		String KJ = "Bersih";
		if("Bersih".equals(KJ))
			System.out.println("Sesuai");
		else if("Kotor".equals(KJ))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
		return KJ;
	}	
}