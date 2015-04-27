package Inventaris;
import java.util.Scanner;

public class TestCode {
	private Scanner input;
	public void setDeclaration(){

		Declaration[]arrdec;
		arrdec = new Declaration[1];
		arrdec [0] = new Declaration();
		input = new Scanner (System.in);
		input.nextInt();
		
		System.out.println("Identitas Ruang Kelas");
		System.out.println("Nama Ruang = ");
		arrdec[0].setNamaRuang(input.nextLine());
		System.out.println("Lokasi Ruang = ");
		arrdec[0].setLokasiRuang(input.nextLine());
		System.out.println("Program Studi = ");
		arrdec[0].setProgramStudi(input.nextLine());
		System.out.println("Fakultas = ");
		arrdec[0].setFakultas(input.nextLine());
		
		System.out.println("Kondisi Ruang Kelas");
		System.out.println("Panjang Ruang = ");
		arrdec[0].setPanjangRuang(input.nextInt());
		System.out.println("Lebar Ruang = ");
		arrdec[0].setLebarRuang(input.nextInt());
		System.out.println("Luas Ruang = ");
		arrdec[0].setLuasRuang(input.nextDouble());
		System.out.println("Bentuk Ruang = ");
		arrdec[0].setBentukRuang(input.nextLine());
		System.out.println("Jumlah Kursi = ");
		arrdec[0].setJumlahKursi(input.nextInt());
		System.out.println("Rasio Luas = ");
		arrdec[0].setRasioLuas(input.nextDouble());
		System.out.println("Jumlah Pintu = ");
		arrdec[0].setJumlahPintu(input.nextInt());
		System.out.println("Jumlah Jendela = ");
		arrdec[0].setJumlahJendela(input.nextInt());
		
		System.out.println("Jumlah, Kondisi, dan Posisi Sarana ");
		System.out.println("Jumlah Stop Kontak = ");
		arrdec[0].setJumlahStopKontak(input.nextInt());
		System.out.println("Kondisi Stop Kontak = ");
		arrdec[0].setKondisiStopKontak(input.nextLine());
		System.out.println("Posisi Stop Kontak = ");
		arrdec[0].setPosisiStopKontak(input.nextLine());
		System.out.println("Jumlah Kabel LCD = ");
		arrdec[0].setJumlahKabelProyektor(input.nextInt());
		System.out.println("Kondisi Kabel LCD = ");
		arrdec[0].setKondisiKableProyektor(input.nextLine());
		System.out.println("Posisi Kabel LCD = ");
		arrdec[0].setPosisiKabelProyektor(input.nextLine());
		System.out.println("Jumlah Lampu = ");
		arrdec[0].setJumlahLampu(input.nextInt());
		System.out.println("Kondisi Lampu = ");
		arrdec[0].setKondisiLampu(input.nextLine());
		System.out.println("Posisi Lampu= ");
		arrdec[0].setPosisiLampu(input.nextLine());
		System.out.println("Jumlah Kipas Angin= ");
		arrdec[0].setJumlahKipasAngin(input.nextInt());
		System.out.println("Kondisi Kipas Angin = ");
		arrdec[0].setKondisiKipasAngin(input.nextLine());
		System.out.println("Posisi Kipas Angin= ");
		arrdec[0].setPosisiKipasAngin(input.nextLine());
		System.out.println("Jumlah AC = ");
		arrdec[0].setJumlahAC(input.nextInt());
		System.out.println("Kondisi AC = ");
		arrdec[0].setKondisiAC(input.nextLine());
		System.out.println("Posisi AC= ");
		arrdec[0].setPosisiAC(input.nextLine());
		System.out.println("Pilih SSID = ");
		arrdec[0].setSSID(input.nextLine());
		System.out.println("Input Bandwith = ");
		arrdec[0].setBandwith(input.nextDouble());
		System.out.println("Jumlah CCTV = ");
		arrdec[0].setJumlahCCTV(input.nextInt());
		System.out.println("Kondisi CCTV = ");
		arrdec[0].setKondisiCCTV(input.nextLine());
		System.out.println("Posisi CCTV = ");
		arrdec[0].setPosisiCCTV(input.nextLine());
		
		System.out.println("Lingkungan Ruang Kelas");
		System.out.println("Kondisi Lantai = ");
		arrdec[0].setKondisiLantai(input.nextLine());
		System.out.println("Kondisi Dinding = ");
		arrdec[0].setKondisiDinding(input.nextLine());
		System.out.println("Kondisi Atap = ");
		arrdec[0].setKondisiAtap(input.nextLine());
		System.out.println("Kondisi Pintu= ");
		arrdec[0].setKondisiPintu(input.nextLine()); 
		System.out.println("Kondisi Jendela = ");
		arrdec[0].setKondisiJendela(input.nextLine());
		
		System.out.println("Kebersihan Ruang Kelas ");
		System.out.println("Sirkulasi Udara = ");
		arrdec[0].setSirkulasiUdara(input.nextLine());
		System.out.println("Nilai Pencahayaan = ");
		arrdec[0].setNilaiPencahayaan(input.nextInt());
		System.out.println("Nila Kelembapan = ");
		arrdec[0].setNilaiKelembapan(input.nextInt());
		System.out.println("Input Suhu = ");
		arrdec[0].setNilaiSuhu(input.nextInt());
		
		System.out.println("Kenyamanan Ruang Kelas");
		System.out.println("Kebisingan = ");
		arrdec[0].setKebisingan(input.nextLine());
		System.out.println("Kebauan = ");
		arrdec[0].setKebauan(input.nextLine());
		System.out.println("Kebocoran = ");
		arrdec[0].setKebocoran(input.nextLine());
		System.out.println("Kerusakan = ");
		arrdec[0].setKerusakan(input.nextLine());
		System.out.println("Keausan = ");
		arrdec[0].setKeausan(input.nextLine());
		
		System.out.println("Keamanan Ruang Kelas");
		System.out.println("Kekokohan = ");
		arrdec[0].setKekokohan(input.nextLine());
		System.out.println("Kunci Pintu = ");
		arrdec[0].setKunciPintu(input.nextLine());
		System.out.println("Kunci Jendela = ");
		arrdec[0].setKunciJendela(input.nextLine());
		System.out.println("Bahaya = ");
		arrdec[0].setTingkatBahaya(input.nextLine());
		
		
	}
}