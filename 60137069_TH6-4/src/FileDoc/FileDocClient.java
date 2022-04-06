package FileDoc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
public class FileDocClient {

	public static void main(String[] args) {
		try {
			Socket soc = new Socket("Localhost",8888);
			System.out.print("Connected!!\n");
			//Lấy luồng nhập
			InputStream in = soc.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffRead = new BufferedReader(inReader);
			
			OutputStream osToClient = soc.getOutputStream();
			OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
			BufferedWriter buffW = new BufferedWriter(write2Client);
			//Giao tiếp theo giao thức thiết kế
			
			//Lấy chuỗi từ bàn phím
			Scanner banPhim = new Scanner(System.in);
			while(true)
			{	
				//Yêu cầu từ server
				String chuoiNhan = buffRead.readLine();
				System.out.println("Server:"+chuoiNhan);
				
				//Client nhập số
				System.out.println("\nClient:");
				String chuoiGui = banPhim.nextLine();
				//Gửi đi nếu chuỗi không phải "10"
				buffW.write(chuoiGui+"\n");
				buffW.flush();
				//Nhạn về
				chuoiNhan = buffRead.readLine();
				//In ra màn hình Client để xem
				System.out.println("Server:"+chuoiNhan);
				if (chuoiGui.equals("0")) break;
			}
			soc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
