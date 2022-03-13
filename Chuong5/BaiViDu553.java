package Chuong5;

import java.io.*;
public class BaiViDu553 {

//	public static void main(String[] args) throws IOException{
//		String str; 
//		FileWriter fw;
//		BufferedReader br = new BufferedReader( new InputStreamReader(System.in)); 
//		 try 
//		{ 
//			 fw = new FileWriter("D:\\LUUDA-Eclipse\\File\\src\\VD553-Unicode"); 
//		} 
//		catch(IOException exc) 
//		{ 
//			System.out.println("Khong the mo file."); return ; 
//		} 
//		 	System.out.println("Nhap ('stop' de ket thuc chuong trinh)."); 
//		 do 
//		{ 
//			 System.out.print(": "); 
//			 str = br.readLine(); 
//			 if(str.compareTo("stop") == 0) break; 
//			 str = str + "\r\n"; 
//			 fw.write(str); 
//		} 
//		while(str.compareTo("stop") != 0); 
//		fw.close(); 
//
//	}

	//ghi zô file rồi hiển thị lên console
	public static void main(String args[]) throws Exception 
	{ 
		FileReader fr = new FileReader("D:\\\\LUUDA-Eclipse\\\\File\\\\src\\\\VD553-Unicode"); 
		BufferedReader br = new BufferedReader(fr); 
		String s; 
	while((s = br.readLine()) != null) 
	{ 
		System.out.println(s); 
	} 
	fr.close(); 
	}
}
