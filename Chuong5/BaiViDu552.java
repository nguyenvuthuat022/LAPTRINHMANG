package Chuong5;

import java.io.*;
public class BaiViDu552 {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true); 
		int i = 10;
		double d = 123.67; 
		double r = i+d; 
		pw.println("Using a PrintWriter."); 
		pw.println(i); 
		pw.println(d); 
		pw.println(i + " + " + d + " = " + r); 

	}

}
