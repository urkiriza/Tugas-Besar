package Inventaris;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Saving  {
	public Object save(){
		
		RekapRuang RR= new RekapRuang();
		try
	      {
	         FileOutputStream fileOut =
	         new FileOutputStream("/tmp/employee.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(RR);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in /tmp/employee.ser");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }

		return save();
	}
	public Object Read(){
		RekapRuang RR= new RekapRuang();
	      try
	      {
	         FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         RR = (RekapRuang) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	         return i;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("RekapRuang class not found");
	         c.printStackTrace();
	         return c;
	      }
	      RR.Ruangan();

	      return Read();
	}
}
