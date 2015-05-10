package Inventaris;
import java.util.Scanner;
public class Masukkan extends Declaration{
	Scanner in = new Scanner(System.in);
	
	public Masukkan(){
		System.out.print("Masukkan Nama Ruangan : ");
		String Nama = in.nextLine();
		this.NamaRuang = Nama;
		System.out.println("Masukkan Lokasi Ruangan : ");
		String Lokasi = in.nextLine();
		this.LokasiRuang = Lokasi;
	}
	
}
