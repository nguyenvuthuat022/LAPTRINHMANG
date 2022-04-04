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
				while(true) {
					//Nhận dữ liệu
					String chuoiNhan= buffRead.readLine();
							
					//Gửi trả
					if(chuoiNhan.equals("0"))
					{
						buffwrite.write("Zero"+"\n");
						buffwrite.flush();
					}
					else if(chuoiNhan.equals("1"))
					{
						buffwrite.write("One"+"\n");
						buffwrite.flush();
					}
					else if(chuoiNhan.equals("2"))
					{
						buffwrite.write("Two"+"\n");
						buffwrite.flush();
					}
					else if(chuoiNhan.equals("3"))
					{
						buffwrite.write("Three"+"\n");
						buffwrite.flush();
					}
					else if(chuoiNhan.equals("4"))
					{
						buffwrite.write("Four"+"\n");
						buffwrite.flush();
					}
					else if(chuoiNhan.equals("5"))
					{
						buffwrite.write("Five"+"\n");
						buffwrite.flush();
					}
					else if(chuoiNhan.equals("6"))
					{
						buffwrite.write("Six"+"\n");
						buffwrite.flush();
					}
					else if(chuoiNhan.equals("7"))
					{
						buffwrite.write("Seven"+"\n");
						buffwrite.flush();
					}
					else if(chuoiNhan.equals("8"))
					{
						buffwrite.write("Eight"+"\n");
						buffwrite.flush();
					}
					else if(chuoiNhan.equals("9"))
					{
						buffwrite.write("Nine"+"\n");
						buffwrite.flush();
					}
					else if (chuoiNhan.equals("10")) 
						{
						buffwrite.write("ten"+"\n");
						buffwrite.flush();
							break;
						}
				}
			  }
			} catch (IOException e) {
				e.printStackTrace();
			}

	}
	                
}
