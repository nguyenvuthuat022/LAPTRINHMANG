package input;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DocFileNhiPhan {

	public static void main(String[] args) throws IOException {
		        // Tạo 1 đối tượng InputStream
				InputStream is;
				//Gắn vào File
				FileInputStream Fin = new FileInputStream("D:\\LUUDA-Eclipse\\Tuan2-Streams\\File\\Ghifilenhiphan");
				//Gắn os vào Fout
				is=Fin;
				//Tạo và gắn voà DataOutputStream
				DataInputStream Din = new DataInputStream(Fin);
				//đọc dữ liệu
				int a = Din.readInt();
				double b = Din.readDouble();
				String chuoi = Din.readUTF();
				
				Din.close();
				is.close();
				Fin.close();
				System.out.print("Đọc xong file. Dữ liệu là:  \n");
				System.out.println(a);
				System.out.println(b);
				System.out.println(chuoi);
	}


}
