import java.io.*;
import java.util.Scanner;
public class InputKarakter {
	
	public static void main(String[] args){
	  char ch,oi;
		
		    try{
		     System.out.print("Nama nye:");
		     InputStreamReader stream = new InputStreamReader(System.in);
		     BufferedReader reader = new BufferedReader(stream);
		     ch = (char) reader.read();
		     
		     System.out.print("Email nye : ");
		     InputStreamReader rere = new InputStreamReader(System.in);
		     BufferedReader illy = new BufferedReader(rere);
		     oi = (char) illy.read();
		      
		     System.out.println("Nama : \'"+ch+"\'");
		     System.out.println("Email : \'"+oi+"\'");
		    }catch(IOException e){
		     e.printStackTrace(System.err);
		     //bisa juga dengan menggunakkan
		     //System.err.println(e.getMessage());
		    }
		   }
		  }