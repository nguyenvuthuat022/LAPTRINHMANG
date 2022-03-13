package Chuong5;

import java.io.*;
public class BaiViDu531 {
 
	public static void main(String args[]) throws IOException 
	{ 
		// đọc dữ liệu từ console
		byte data[] = new byte[100]; 
		System.out.print("Enter some characters:"); 
		System.in.read(data); 
		System.out.print("You entered: ");
		for(int i=0; i < data.length; i++) 
		System.out.print((char) data[i]); 
	} 
}


