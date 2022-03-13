package Chuong5;

import java.io.*;
public class BaiViDu551 {

//	public static void main(String[] args) throws IOException {
//		char c; 
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//		System.out.println("Nhap chuoi ky tu, gioi han dau cham."); 
//		 // read characters 
//		do 
//		{ 
//		c = (char) br.read(); 
//		System.out.println(c); 
//		} while(c != '.'); 
//
//	}
	
	public static void main(String args[]) throws IOException 
	{ 
	// create a BufferedReader using System.in 
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	String str; 
	System.out.println("Nhap chuoi.");
	System.out.println("Nhap 'stop' ket thuc chuong trinh.");
	do 
	{ 
	str = br.readLine(); 
	System.out.println(str); 
	} while(!str.equals("stop")); 
	}

}
