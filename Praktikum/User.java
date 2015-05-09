
public class User {
	private String ID;
	private String Nama;
	protected String Alamat;
	
	public User(String ID, String Nama){
		this.ID = ID;
		this.Nama = Nama;
	}
	void setData(String ID, String Nama){
		this.ID = ID;
		this.Nama = Nama;
	}
	void setData(String ID , String Nama, String Alamat){
		this.ID = ID;
		this.Nama = Nama;
		this.Alamat = Alamat;
	}
	
	String getID(){
		return ID;
	}
	String getNama(){
		return Nama;
	}
	void setID(String ID){
		this.ID = ID;
	}
	void setNama(String Nama){
		this.Nama = Nama;
	}
}