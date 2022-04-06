package FileDoc;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class FlieDocChuongTrinhChinh {

	public static void main(String[] args) {
		ServerSocket socketServer = new ServerSocket(9696);
		System.out.print("I'm waiting on 9696 port...");
		//
		int id=0;
		while(true) {
			Socket s = socketServer.accept();
			id++;
			FileDocLuongLamViec LuongTask = new FileDocLuongLamViec(s,id);
			LuongTask.start();
		}
	}

	}


