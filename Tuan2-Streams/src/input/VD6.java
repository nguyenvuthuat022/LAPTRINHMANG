package input;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.Buffer;

public class VD6 {

	public static void main(String[] args) throws Exception {
		FileWriter writer = new FileWriter("D:\\LUUDA-Eclipse\\Tuan2-Streams\\File\\VD6.txt");
		BufferedWriter buffer = new BufferedWriter(writer);
		buffer.write("Peter is going to India");
		buffer.close();
		System.out.println("Success...");
		}

}
