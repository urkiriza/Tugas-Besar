package Inventaris;

public class Keluarannya extends Masukkan{
	Declaration DD = new Declaration();
	Masukkan input = new Masukkan();
	public Masukkan outputIdentitas(){
		System.out.println("Nama ruangan : "+DD.getNamaRuang());
		return input;
	}
	public Keluarannya() {
		super();
		// TODO Auto-generated constructor stub
	}

}
