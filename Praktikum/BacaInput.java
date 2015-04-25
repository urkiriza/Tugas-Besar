import java.util.Scanner;  
public class BacaInput {
	 private static Scanner masuk;
	  
	    public static void main(String args[]){  
	        @SuppressWarnings("resource")
			Scanner masuk = new Scanner( System.in );  
	        System.out.print( "\t\t\t\tSIGN UP ACCOUNT\n" );
	 
	        System.out.print( "\nNama Lengkap\t: " );  
	        String nama = masuk.nextLine();  
	        
	        System.out.print("Nama Paggilan\t: ");
	        String panggilan = masuk.nextLine();
	        
	        System.out.print("Email\t\t: ");
	        String email = masuk.nextLine();
	        
	        System.out.print("Password\t: ");
	        String password = masuk.nextLine();
	        
	        System.out.print( "Usia Anda\t:  " );  
	        int umur = masuk.nextInt();  
	          
	        System.out.println("\n\t\tHello, " +panggilan+"!!\n");  
	        System.out.println("\t\tNama Lengkap Anda\t:" +nama ); 
	        System.out.println("\t\tUsia Anda\t\t: " +umur);
	        System.out.println("\t\tEmail Anda\t\t:" +email);
	        System.out.println("\t\tPassword Anda\t\t: "+password);
	    }

		public static Scanner getMasuk() {
			return masuk;
		}

		public static void setMasuk(Scanner masuk) {
			BacaInput.masuk = masuk;
		}  
	}  

