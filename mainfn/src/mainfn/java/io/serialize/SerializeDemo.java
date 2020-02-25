package mainfn.java.io.serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


//序列化分很多种，大多语言也都有自己的序列化方式，并且大多都有JSON序列化的解决方案，这个就是只保存属性的序列化。
//序列化是用来持久化对象，方便传输、保存。
//而java的字节码.class是给虚拟机解释执行的！两个毫无关系。 序列化由程序解析使用，字节码直接由虚拟机解释

class Employee implements java.io.Serializable{
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
