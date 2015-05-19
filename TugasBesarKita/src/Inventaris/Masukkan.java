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
		String Fak = in.nextLine();
		DD.setFakultas(Fak);
		System.out.println("Masukkan Panjang Ruangan : ");
		int PR = in.nextInt();
		DD.setPanjangRuang(PR);
		System.out.println("Masukkan Lebar Ruangan : ");
		int LR = in.nextInt();
		DD.setLebarRuang(LR);
		
		

	}
	
}
