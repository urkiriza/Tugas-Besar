package Praktikum;
import java.util.Scanner;
public class Admin {
	public static void main(String [] args){
	
	Book [] arrb;
	arrb = new Book [1];
	 arrb [0] = new Book();
	 Scanner scan = new Scanner (System.in);
	 
	 public void [] insertBook(){
		System.out.println("Masukkan Judul Buku : ");
		arrb[0].setJudul(scan.nextLine());
		System.out.println("Masukkan Nama Penulis : ");
		arrb[0].setPenulis(scan.nextLine());
		System.out.println("Masukkan Jumlah Halaman : ");
		arrb[0].setJumlahHalaman(scan.nextInt());
		}
	public void [] showBook(){
		System.out.println("Judul " + arrb[0].getJudul() + "/n Penulis " + arrb[0].getPenulis() + "Jumlah Halaman " + arrb[0].getJumlahHalaman());
		}
	}
}
