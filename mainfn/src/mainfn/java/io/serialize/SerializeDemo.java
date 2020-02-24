package mainfn.java.io.serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Employee implements java.io.Serializable
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public String name;
   public String address;
   public transient int SSN;
   public int number;
   
   public void mailCheck()
   {
      System.out.println("Mailing a check to " + name
                           + " " + address);
   }
}

public class SerializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Employee e = new Employee();
	      e.name = "Reyan Ali";
	      e.address = "Phokka Kuan, Ambehta Peer";
	      e.SSN = 11122333;
	      e.number = 101;
	      try
	      {
	         FileOutputStream fileOut =
	         new FileOutputStream("/Users/lihuadong/Documents/Temp/employee.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in /lihuadong/Documents/Temp/employee.ser");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
	}

}
