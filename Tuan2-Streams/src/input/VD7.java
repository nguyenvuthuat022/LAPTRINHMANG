package input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class VD7 {

	public static void main(String args[]) throws Exception {
		Reader fr = new FileReader("D:\\LUUDA-Eclipse\\Tuan2-Streams\\File\\VD7.txt");
		BufferedReader br = new BufferedReader(fr);
		int i;
		while ((i = br.read()) != -1) {
		System.out.print((char) i);
		}
		br.close(); fr.close();
		}

}
