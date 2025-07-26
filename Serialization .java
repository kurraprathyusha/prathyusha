//-----------------------------------------------------------------------------------------------------serialization------------------------------------------------------------------------
package	collection.package1;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {

	public static void main(String[] args) {
		try {
		Studentr s=new Studentr(14,"shiva");
		FileOutputStream f = new FileOutputStream("C:\\Users\\Kurra varsha\\OneDrive\\Documents\\Desktop\\pp\\ppp.txt");
		ObjectOutputStream o=new ObjectOutputStream(f);
		o.writeObject(s);
		o.close();
		f.close();
		}catch(IOException e)//object to byte code =>serizable
		{
			e.printStackTrace();
		}
	}
}
class Studentr implements Serializable
{
	int id;
	String name;
	public Studentr(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Studentr [id=" + id + ", name=" + name + "]";
	}
	}
//----------------------------------------------------------------------------------------------------deSerialization -------------------------------------------------------------------

package collection.package1;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;//byte code to object=>deserizable
public DeSerialization {
	public static void main(String[] args) {
		try {
		FileInputStream f=new FileInputStream("C:\\Users\\Kurra varsha\\OneDrive\\Documents\\Desktop\\pp\\ppp.txt");
		ObjectInputStream o=new ObjectInputStream(f);
		Studentr s2=(Studentr)o.readObject();
		System.out.println(s2);
		o.close();
		f.close();
		}catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
		}
		
	}
}

















