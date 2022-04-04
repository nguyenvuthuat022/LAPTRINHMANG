package BaiDichSo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ChuongTrinhChinh {
	
	public static void main(String[] args) throws IOException {
		ServerSocket socketServer = new ServerSocket(9999);
		System.out.println(" Nghe....9999 port");
		
		int id = 0;
		while (true) {
			Socket s = socketServer.accept();
			id ++;
			LuongLamViec luongTask = new LuongLamViec(s, id);
			luongTask.start();
		}

	}


}
