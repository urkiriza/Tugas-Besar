package PBO_II;
import java.util.Scanner;
public class KenyamananRKelas {
	public static void main(final String [] args){
		Scanner scan = new Scanner (System.in);
		//onok if else if else
		System.out.println("Input Kebisingan : ");
		String K = scan.nextLine();
		if ("Tidak Bising".equals(K))
			System.out.println("Kondisi Sesuai");
		else if ("Bising".equals(K))
			System.out.println("Kondisi Tidak Sesuai");
		else
			System.out.println("Input Salah\t");
		
		System.out.println("Input Bau Ruangan : ");
		String B = scan.nextLine();
		if ("Tidak Bau".equals(B))
			System.out.println("Ruangan Harum");
		else if ("Bau".equals(B))
			System.out.println("Ruangan Bau");
		else
			System.out.println("Input Salah\t");
		
		System.out.println("Input Kebocoran : ");
		String C = scan.nextLine();
		if ("Tidak Ada".equals(C))
			System.out.println("Kondisi Baik");
		else if ("Ada".equals(C))
			System.out.println("Kondisi Buruk");
		else
			System.out.println("Input Salah\t");
		
		System.out.println("Input Kerusakan : ");
		String R = scan.nextLine();
		if ("Tidak Ada".equals(R))
			System.out.println("Tidak Ada Yang Rusak");
		else if ("Ada".equals(R))
			System.out.println("Sebagian Yang Rusak");
		else 
			System.out.println("Input Salah\t");
		
		System.out.println("Input Keausan : ");
		String A = scan.nextLine();
		if ("Tidak Ada".equals(A))
			System.out.println("Kondisi Sesuai");
		else if("ada".equals(A))
			System.out.println("Kondisi Tidak sesuai");
		else
			System.out.println("Input Salah\t");
	}
}