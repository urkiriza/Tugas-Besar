package TugasBesarKita;

public class Honda extends Mobil {
	public void Show(){
		double BesarSilinder = 5.4;
		String BahanBakar = "Pertamax";
		String Kategori = "Sedan";
		
		Mobil M = new Mobil();
		
		M.InputData("Civic","Merah", "Elite", 4);
		M.ShowData();
		
		System.out.println("Silinder : " + BesarSilinder);
		System.out.println("Jenis Bahan Bakar : " + BahanBakar);
		System.out.println("Jenis Kategori : " + Kategori);
	}
}
