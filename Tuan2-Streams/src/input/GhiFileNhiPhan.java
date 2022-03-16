package input;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class GhiFileNhiPhan {

	public static void main(String[] args) throws IOException {
		// Tạo 1 đối tượng OutPutStream
		OutputStream os;
		//Gắn vào File
		FileOutputStream Fout = new FileOutputStream("D:\\LUUDA-Eclipse\\Tuan2-Streams\\File\\Ghifilenhiphan");
		//Gắn os vào Fout
		os=Fout;
		//Tạo và gắn voà DataOutputStream
		DataOutputStream Dout = new DataOutputStream(Fout);
		//Ghi dữ liệu
		Dout.writeInt(1230);
		Dout.writeDouble(4.25);
		Dout.writeUTF("Lớp 60 CNTT");
		
		Dout.close();
		os.close();
		Fout.close();
		System.out.print("Hoàn thành!!!!");
	}

}
