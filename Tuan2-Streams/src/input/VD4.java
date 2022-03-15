package input;
import java.io.DataOutputStream; 
import java.io.FileOutputStream;
import java.io.IOException; 
import java.io.OutputStream;
public class VD4 {
	
	public static void main(String[] args) throws IOException {
		int id = 1;
		String name = "Nguyen Vu Thuat";
		OutputStream file = new FileOutputStream("D:\\LUUDA-Eclipse\\Tuan2-Streams\\File\\VD4.txt");
		DataOutputStream data = new DataOutputStream(file);
		data.writeInt(id);
		data.writeUTF(name);
		data.flush();
		data.close();
		System.out.println("Succcess...");

	}

}
