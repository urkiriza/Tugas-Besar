import java.util.Scanner;


public class Login {
	public static void main(final String[] args) {
		String username="Qika";
		String password="rizqika19";
		String a, b;
		
		System.out.println("Sign in");
		Scanner masuk = new Scanner(System.in);
		System.out.println("email/username");
		a=masuk.nextLine();
		System.out.println("password");
		b=masuk.nextLine();
		
		if(a.equals(username) && b.equals(password));
		System.out.println("Congratulation, you're logged in");
		
	
	}
}


masuk = new Scanner( System.in );  
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


System.out.println("Karakter yang anda masukkan : \'"+ch+"\'");
System.out.println("\n\t\tHello, " +panggilan+"!!\n");  
System.out.println("\t\tNama Lengkap Anda\t:" +nama ); 
System.out.println("\t\tUsia Anda\t\t: " +umur);
System.out.println("\t\tEmail Anda\t\t:" +email);
System.out.println("\t\tPassword Anda\t\t: "+password);
}
catch(IOException e){
e.printStackTrace(System.err);
//bisa juga dengan menggunakkan
//System.err.println(e.getMessage());
}
}
}


