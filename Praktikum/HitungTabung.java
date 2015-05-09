import java.util.Scanner;
public class HitungTabung {
	public static void main(final String [] args){
		Scanner Input = new Scanner(System.in);
		int Pilihan = 9;

		do {
			System.out.println("Aplikasi Penghitung Volume dan Luas Permukaan");
			System.out.println("1. Menghitung Volume");
			System.out.println("2. Menghitung Luas Permukaan");
			System.out.println("0. Keluar");
			System.out.println("Masukkan Pilihannya : ");
			Pilihan = Input.nextInt();
			
			switch(Pilihan){
			case 1 : Volume(); break;
			case 2 : LuasPermukaan(); break;
			}
		}
		while(Pilihan !=0);
	}

	private static void Volume() {
		Tabung T = new Tabung ();
		Scanner Input = new Scanner(System.in);
		System.out.println("Masukkan Jari-Jari : " + T.getJari());
		int Jari = Input.nextInt();
		System.out.println("Masukkan Tinggi : " + T.getTinggi());
		int Tinggi = Input.nextInt();
	}
	private static void LuasPermukaan() {
		Tabung T = new Tabung ();
		Scanner Input = new Scanner(System.in);
		System.out.println("Masukkan Jari-Jari : " + T.getJari());
		int Jari = Input.nextInt();
		System.out.println("Masukkan Tinggi : " + T.getTinggi());
		int Tinggi = Input.nextInt();
		
	}
}