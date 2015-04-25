package PBO_II;
import java.util.Scanner;
public class KebersihanRKelas {
	public static void main(final String [] args){
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Input Sirkulasi Udara : ");
		String SU = scan.nextLine();
		if ("Terbuka".equals(SU))
			System.out.println("Sirkulasi Udara Lancar");
		else if ("Tertutup".equals(SU))
			System.out.println("Sirkulasi Udara Tertutup\t");
		else
			System.out.println("Input Salah");
		
		System.out.println("Input Nilai Pencahayaan : ");
		int NP = scan.nextInt();
		if ((NP >= 250) && (NP<=350))
			System.out.println("Cahaya Normal");
		else if ((NP >= 1) && (NP <= 249))
			System.out.println("Cahaya Gelap\t");
		else
			System.out.println("Input Salah");
		
		System.out.println("Input Kelembapan (%)");
		int K = scan.nextInt();
		if ((K >= 70) && (K <= 80))
			System.out.println("Lembab Sesuai");
		else if ((K >= 1) && (K <= 69))
			System.out.println("Lembab Kurang\t");
		else
			System.out.println("Input Salah");
		
		System.out.println("Input Suhu (celcius)");
		int S = scan.nextInt();
		if ((S >= 25) && (S <= 	35))
			System.out.println("Suhu Normal");
		else if ((S >= 1) && (S <= 24))
			System.out.println("Suhu Terlalu Rendah\t");
		else
			System.out.println("Input Salah");
	}
}