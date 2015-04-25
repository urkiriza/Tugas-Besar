package PBO_II;
import java.util.Scanner;
public class LingkunganRKelas {
	public static void main(final String [] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input Kondisi Lantai : ");
		String KL = scan.nextLine();
		if ("Bersih".equals(KL))
			System.out.println("Lantai Bersih");
		else if("Kotor".equals(KL))
			System.out.println("Lantai Kotor\t");
		
		System.out.println("Input Kondisi Dinding : ");
		String KD = scan.nextLine();
		if ("Bersih".equals(KD))
			System.out.println("Dinding Bersih");
		else if ("Kotor".equals(KD))
			System.out.println("Dinding Kotor");
		else 
			System.out.println("Input Salah");
		
		System.out.println("Input Kondisi Atap : ");
		String KA = scan.nextLine();
		if ("Bersih".equals(KA))
			System.out.println("Atap Bersih");
		else if ("Kotor".equals(KA))
			System.out.println("Atap Kotor\t");
		else 
			System.out.println("Input Salah");
		
		System.out.println("Input Kondisi Pintu : ");
		String KP = scan.nextLine();
		if ("Bersih".equals(KP))
			System.out.println("Pintu Bersih");
		else if ("Kotor".equals(KP))
			System.out.println("Pintu Kotor \t");
		else 
			System.out.println("Input Salah");
		
		System.out.println("Input Kondisi Jendela : ");
		String KJ = scan.nextLine();
		if ("Bersih".equals(KJ))
			System.out.println("Jendela Bersih");
		else if ("Kotor".equals(KJ))
			System.out.println("Jendela Kotor \t");
		else 
			System.out.println("Input Salah");
	}
}