
public class Tabung {
	protected int Jari;
	protected int Tinggi;
	protected double LuasPermukaan, Volume;
	
	public Tabung (){
		this.Jari = Jari;
		this.Tinggi = Tinggi;
		this.LuasPermukaan = LuasPermukaan;
		this.Volume = Volume;
	}

	int getJari(){
		return Jari;
	}
	
	int getTinggi(){
		return Tinggi;
	}
	
	double getLuasPermukaan(){
		return LuasPermukaan;
	}
	
	double getVolume(){
		return Volume;
	}
	
	void setJari(int Jari){
		this.Jari = Jari;
	}
	
	void setTinggi(int Tinggi){
		this.Tinggi = Tinggi;
	}
	
	void setLuasPermukaan(double LuasPermukaan){
		LuasPermukaan = 2* 3.14f * Jari * (Jari + Tinggi);
		this.LuasPermukaan = LuasPermukaan;
	}
	
	void setVolume(double Volume){
		Volume = 3.14f * (Jari * Jari) * Tinggi;
		this.Volume = Volume;
	}
}