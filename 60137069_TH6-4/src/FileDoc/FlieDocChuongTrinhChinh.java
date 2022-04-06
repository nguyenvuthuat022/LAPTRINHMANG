package FileDoc;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class FlieDocChuongTrinhChinh {

	public static void main(String[] args) throws IOException {
		ServerSocket socketServer = new ServerSocket(8888);
		System.out.print("I'm waiting on 8888 port...");
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


