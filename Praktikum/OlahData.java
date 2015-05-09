
public class OlahData {
	public static void main (final String [] args){
		User U = new User ("019", "Kiriza");
			System.out.println("Nama User Sebelum Diganti : " + U.getNama());
			U.setNama("Uraguchi");
			System.out.println("Nama User Setelah Diganti : " + U.getNama());
			
			U.setData("019", "Kiriza");
			U.setData("019", "Kiriza", "Malang");
			System.out.println("Nama User : " + U.getNama());
	}
}