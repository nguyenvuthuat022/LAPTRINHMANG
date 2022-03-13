package Chuong5;

import java.io.*;
public class BaiViDuCopyFile {

	public static void main(String[] args) throws IOException {
		int i; 
		FileInputStream fin; 
		FileOutputStream fout; 
		try
		{ 
		// open input file 
		try
		{ 
			fin = new FileInputStream("D:\\LUUDA-Eclipse\\File\\src\\Copy1"); 
		} 
		catch(FileNotFoundException exc) 
		{ 
			System.out.println("Input File Not Found"); 
			return; 
		} 
		// open output file 
		try 
		{ 
			fout = new FileOutputStream("D:\\LUUDA-Eclipse\\File\\src\\Copy2"); 
		} 
		catch(FileNotFoundException exc) 
		{ 
			System.out.println("Error Opening Output File"); 
			return;
		} 
		} 
		catch(ArrayIndexOutOfBoundsException exc) 
		{ 
			System.out.println("Usage: CopyFile From To"); 
			return; 
		} 
		// Copy File 
		try
		{ 
		do
		{
			i = fin.read(); 
		if(i != -1) fout.write(i);
		} 
		while(i != -1); 
		} 
		catch(IOException exc) 
		{ 
			System.out.println("File Error"); 
		} 
		
		fin.close(); 
		fout.close(); 
	}
}
