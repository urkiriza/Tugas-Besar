import java.util.Scanner;


public class Lingkaran {

	public static void main(final String [] args){
		Konstruk kon = new Konstruk();
			
		int jari_jari;
		float PI = 3.14F;
		Scanner lws = new Scanner(System.in);
		System.out.println("Masukkan Jari-jari = ");
		jari_jari = lws.nextInt() ;
		float luas = PI*jari_jari;
		float keliling = 2*PI*jari_jari;
		System.out.println("Luas Lingkaran = "+luas); 
		
	}
	}