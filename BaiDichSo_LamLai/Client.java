package BaiDichSo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Socket soc;
		try {
			soc = new Socket("localhost", 9999);
			System.out.print("Connected Thành Công!\n");
		// Lấy luồng nhập, xuất
			InputStream in = soc.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffRead = new BufferedReader(inReader);
			OutputStream osToClient = soc.getOutputStream();
			OutputStreamWriter write2client = new OutputStreamWriter(osToClient);
			BufferedWriter buffWrite = new BufferedWriter(write2client);
		// GIAO TIẾP THEO giao thức thiết kế
	
		Scanner banPhim = new Scanner(System.in);
		while(true)
		{
			System.out.print("\nClient:");
			String chuoiGui= banPhim.nextLine();
		// Gửi đi, nếu chuỗi không phải là Bye
			buffWrite.write(chuoiGui+"\n");
			buffWrite. flush();
		
		// Nhận về
			String chuoiNhan = buffRead.readLine();
			// In ra màn hình client để xem
			System.out.print("Server:"+ chuoiNhan);
		if (chuoiGui.equals("10")) break;
		}
		soc.close();
		}catch (Exception e) {
			System.out.println("Đóng!");
		}

	}

}
