package Inventaris;
import java.util.Scanner;
public class Masukkan {
	Scanner in = new Scanner(System.in);
	
	public Masukkan(){
		Declaration DD = new Declaration();
		System.out.print("Masukkan Nama Ruangan : ");
		String Nama = in.nextLine();
		DD.setNamaRuang(Nama);
		System.out.println("Masukkan Lokasi Ruangan : ");
		String Lokasi = in.nextLine();
		DD.setLokasiRuang(Lokasi);
		System.out.println("Masukkan Program Studi : ");
		String ProDi = in.nextLine();
		DD.setProgramStudi(ProDi);
		System.out.println("Masukkan Fakultas : ");
		
		

	}
	
}
