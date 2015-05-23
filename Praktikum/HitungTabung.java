import java.util.Scanner;
public class HitungTabung {
	
	public static void main (final String [] args){
		Scanner Input = new Scanner (System.in);
		int pilihan= 3;
		do {
			System.out.println ("Cara Menghitung Volume & Luas Permukaan Tabung");
			System.out.println ("1. Menghitung Volume Tabung");
			System.out.println ("2. Menghitung Luas Permukaan Tabung");
			System.out.println ("0. EXIT");
			System.out.println ("Masukkan Pilihan Anda : ");
			System.out.println ("Tekan '0' untuk EXIT");
			pilihan=Input.nextInt();
			switch (pilihan){
			case 1 : Volume();
			break;
			case 2: LuasPermukaan();
			break;
			}
			}while (pilihan !=0);
	}
	
		
		private static void Volume() {
			Tabung t = new Tabung(9, 19);
			System.out.println("Volume : phi * r * r * t = " + t.Volume());
		}


		private static void LuasPermukaan() {
			Tabung t = new Tabung(9, 19);
			System.out.println("Luas Permukaan : 2 * phi * r * (r + t) = " + t.LuasPermukaan());
				
	}
}