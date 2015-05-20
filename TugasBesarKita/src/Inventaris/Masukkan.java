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
		System.out.println("Masukkan Jumlah Kursi : ");
		int JK = in.nextInt();
		DD.setJumlahKursi(JK);
		System.out.println("Masukkan Jumlah pintu : ");
		int JP = in.nextInt();
		DD.setJumlahPintu(JP);
		System.out.println("Masukkan Jumlah Jendela : ");
		int JJ = in.nextInt();
		DD.setJumlahJendela(JJ);
		System.out.println("Masukkan Jumlah Stop Kontak : ");
		int JSK = in.nextInt();
		DD.setJumlahStopKontak(JSK);
		System.out.println("Masukkan Kondisi Stop kontak : ");
		String KSK = in.nextLine();
		DD.setKondisiStopKontak(KSK);
		System.out.println("Masukkan Posisi Stop Kontak : ");
		String PSK = in.nextLine();//nggak ada kamsut apa2 kok singkatan doang
		DD.setPosisiStopKontak(PSK);
		System.out.println("Masukkan Jumlah Kabel Proyektor : ");
		int JKP = in.nextInt();
		DD.setJumlahKabelProyektor(JKP);
		System.out.println("Masukkan Kondisi Kabel Proyektor : ");
		String KKP = in.nextLine();
		DD.setKondisiKableProyektor(KKP);
		System.out.println("Masukkan Posisi Kabel Proyektor : ");
		String PKP = in.nextLine();
		DD.setPosisiKabelProyektor(PKP);
		System.out.println("Masukkan Jumlah Lampu : ");
		int JL = in.nextInt();
		DD.setJumlahLampu(JL);
		System.out.println("Masukkan Kondisi Lampu : ");
		String KL = in.nextLine();
		DD.setKondisiLampu(KL);
		System.out.println("Masukkan Posisi Lampu : ");
		String PL = in.nextLine();
		DD.setPosisiLampu(PL);
		System.out.println("Masukkan Jumlah Kipas Angin : ");
		int JKA = in.nextInt();
		DD.setJumlahKipasAngin(JKA);
		
	}
	
}
