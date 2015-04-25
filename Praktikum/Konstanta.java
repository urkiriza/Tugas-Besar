package Praktikum;

public class Konstanta {
	public static final double CM_PER_INCH = 19.09;
	
	public static void main(final String [] args){
		double Lebar = 9;
		double Tinggi = 19;
		System.out.println("Ukuran kertas dalam cm = " + Lebar * CM_PER_INCH + " cm " + " x " + Tinggi * CM_PER_INCH + " cm");
		
		convertToCM(3.2);
	}
	static void convertToCM(double inputInch){
		System.out.println(inputInch + " cm " + " = " + inputInch * CM_PER_INCH + " cm");
	}
}
// Konstanta adalah variable yang nilainya tetap dan tidak bisa di rubah lagi.