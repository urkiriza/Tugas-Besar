
public class Tabung {
	private int r;
	private int t;
	private double phi = 3.14;
	
	public Tabung (int r, int t){
		this.r = r;
		this.t = t;
	}
	public double Volume(){
		return phi*r*r*t;
	}
	public double LuasPermukaan(){
		return 2*phi*r*(r+t);
	}
}