package Inventaris;

public class KondisiRuangKelas extends Declaration {
	
	public KondisiRuangKelas() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double LuasRuang(){
			setLuasRuang(getPanjangRuang() * getLebarRuang());
		return LuasRuang();
	}
	
	public String BentukRuang(){
		setBentukRuang(getBentukRuang());
		String PJ = "Persegi Panjang";
		if ((getPanjangRuang()) != (getLuasRuang())){
			System.out.println(PJ);}
		else if((getPanjangRuang())==(getLuasRuang())){
			System.out.println("Tidak persegi panjang");
			System.out.println("Tidak Sesuai");
			}
		else {
			System.out.println("Bentuk Ruangan Absurd");
			}
		return PJ;
	}
	
	public double RasioLuas(){
		setRasioLuas(getLuasRuang() / getJumlahKursi());
		if (getRasioLuas() >= 0.5){
			System.out.println("Sesuai");
		}
		else if(getRasioLuas() <= 0.5){
			System.out.println("Input Salah");
		}
		return RasioLuas();
	}
	
	public int JumlahPintudanJendela(){
		setJumlahPintu(getJumlahPintu());
		if (getJumlahPintu() >= 2){
			System.out.println("Sesuai");
		}
		else if (getJumlahPintu() <= 1){
			System.out.println("Tidak Sesuai");
		}
		setJumlahJendela(getJumlahJendela());
		if (getJumlahJendela() >= 1){
			System.out.println("Sesuai");
		}
		else if(getJumlahJendela() <= 1){
			System.out.println("Tidak Sesuai");
		}
		return JumlahPintudanJendela();
	}
}