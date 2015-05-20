import java.util.Scanner;
public class HitungTabung {
	private static Scanner input;
	private static Scanner input2;
	private static Scanner input3;
	public static void main(final String [] args){
		input2 = new Scanner(System.in);
		int Pilihan;


		do {
			System.out.println("Aplikasi Penghitung Volume dan Luas Permukaan");
			System.out.println("1. Menghitung Volume");
			System.out.println("2. Menghitung Luas Permukaan");
			System.out.println("0. Keluar");
			System.out.println("Masukkan Pilihannya : ");
			Pilihan = input2.nextInt();
			
			switch(Pilihan){
			case 1 : Volume(); break;
			case 2 : LuasPermukaan(); break;
			}
		}
		while(Pilihan !=0);
	}
	

	private static void Volume() {
		Tabung T = new Tabung ();
		input = new Scanner(System.in);
		System.out.println("Masukkan Jari-Jari : " + T.getJari());
		input.nextInt();
		System.out.println("Masukkan Tinggi : " + T.getTinggi());
		input.nextInt();
		System.out.println(T.getVolume());
	}
	private static void LuasPermukaan() {
		Tabung T = new Tabung ();
		input3 = new Scanner(System.in);
		System.out.println("Masukkan Jari-Jari : " + T.getJari());
		int Jari = input3.nextInt();
		System.out.println("Masukkan Tinggi : " + T.getTinggi());
		input3.nextInt();
		System.out.println(T.getLuasPermukaan());
		
	}
}