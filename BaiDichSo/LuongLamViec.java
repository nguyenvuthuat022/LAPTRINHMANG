package BaiDichSo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class LuongLamViec extends Thread{
	Socket socketClient;
	int id = -1;
	

	public LuongLamViec(Socket socketClient, int id) {
		super();
		this.socketClient = socketClient;
		this.id = id;
	}
	@Override
	public void run (){
		try {
			// Mở cổng và bắt đầu nghe
				ServerSocket socketServer = new ServerSocket(9999);
				System.out.println("I'm listening on 9999 port....");
			while (true)
			{ 
				Socket socketclient = socketServer.accept();
				OutputStream osToClient = socketclient.getOutputStream();
				OutputStreamWriter write2client = new OutputStreamWriter(osToClient);
				BufferedWriter buffwrite = new BufferedWriter(write2client);
				InputStream in = socketclient.getInputStream();
				InputStreamReader inReader = new InputStreamReader(in);
				BufferedReader buffRead = new BufferedReader(inReader);
			//========= GIAO TIẾP THEO giao thức thiết kế =======
			while (true)
			{			
				String chuoiNhan = buffRead.readLine();
				String chuoiGui = chuoiNhan;
				buffwrite.write(chuoiGui+"\n");
				buffwrite. flush();
				String returned = null;
	            if(chuoiGui.equals("1")){
	                returned = "ONE";
	            }
	            else{
	                if(chuoiGui.equals("2")){
	                    returned = "TWO";        }
	                else{
	                    if(chuoiGui.equals("3"))    {
	                        returned = "THREE";    }
	                }
	            }
	           
			if (chuoiGui.equals("Bye")) break;
			}
				socketclient.close();
			}
			} catch (IOException e) {
				e.printStackTrace();
			}

	}

}
