package FileDoc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class FileDocLuongLamViec {
	Socket socketClient;
	int id=-1;

	public void GuiFile(String tenFile) throws IOException {
		//
		FileReader fr = new FileReader(tenFile);
		BufferedReader buffRead = new BufferedReader(fr);
		//Lấy về luồng xuất (để gửi về client)
		OutputStream osToClient = socketClient.getOutputStream();
		OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
		BufferedWriter buffW = new BufferedWriter(write2Client);
		//đọc file (từng dòng)
		String line;
		while((line = buffRead.readLine()) != null) {
			//gửi về
			buffW.write(line+"\n");
			buffW.flush();
		}
		fr.close();
	}
	
	
	
	public FileDocLuongLamViec(Socket socketClient, int id) {
		super();
		this.socketClient = socketClient;
		this.id = id;
	}



	@Override
	public void run(){
		try {
				InputStream in = socketClient.getInputStream();
				InputStreamReader inRead = new InputStreamReader(in);
				BufferedReader buffRead = new BufferedReader(inRead);
				
				OutputStream osToClient = socketClient.getOutputStream();
				OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
				BufferedWriter buffW = new BufferedWriter(write2Client);
				
				//========Giao tiếp theo giao thức thiết kế=====
				while(true) {
					//Gửi yêu cầu cho client
					buffW.write("Nhập số từ 1 đến 10 là: "+"\n");
					buffW.flush();
					
					//Nhận dữ liệu
					String chuoiNhan= buffRead.readLine();
					
					//Gửi trả
					if(chuoiNhan.equals("1"))
					{
						GuiFile("1.txt");
						buffW.flush();
					}
					else if(chuoiNhan.equals("2"))
					{
						GuiFile("2.txt");
						buffW.flush();
					}
					else if(chuoiNhan.equals("3"))
					{
						GuiFile("3.txt");
						buffW.flush();
					}
					else if(chuoiNhan.equals("4"))
					{
						GuiFile("4.txt");
						buffW.flush();
					}
					else if(chuoiNhan.equals("5"))
					{
						GuiFile("5.txt");
						buffW.flush();
					}
					else if(chuoiNhan.equals("6"))
					{
						GuiFile("6.txt");
						buffW.flush();
					}
					else if(chuoiNhan.equals("7"))
					{
						GuiFile("7.txt");
						buffW.flush();
					}
					else if(chuoiNhan.equals("8"))
					{
						GuiFile("8.txt");
						buffW.flush();
					}
					else if(chuoiNhan.equals("9"))
					{
						GuiFile("9.txt");
						buffW.flush();
					}
					else if(chuoiNhan.equals("10"))
					{
						GuiFile("10.txt");
						buffW.flush();
					}
					else if (chuoiNhan.equals("0")) 
						{
							buffW.write("Kết thúc"+"\n");
							buffW.flush();
							break;
						}
				}
				//Đóng
				socketClient.close();		 
		}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
	}

}
