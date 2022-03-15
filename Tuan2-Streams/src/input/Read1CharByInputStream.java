package input;

import java.io.IOException;
import java.io.InputStream;

public class Read1CharByInputStream {

	public static void main(String[] args) throws IOException {
		//tạo đối tượng của lớp inputstream
				InputStream is ;
				// gắn với luồng nhập chuẩn
				is = System.in;
				//đọc 1 kí tự từ bản phím
				  System.out.print ("Xin mời nhập kí tự: ");
				  int kt = is.read();
				  System.out.print("ki tự bạn vừa nhập là : " + (char)kt);
	}
}
