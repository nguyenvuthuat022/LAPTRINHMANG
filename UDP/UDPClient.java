package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Scanner;


public class UDPClient {

	public static void main(String[] args) throws IOException{
		String hostABC = "localhost";
	    // tao socket tren cong 
		DatagramSocket socket = new DatagramSocket();
		int dem=0;
		while (true) {			
		System.out.print("UDP Client: ");
		Scanner bp = new Scanner(System.in);
		String theLine = bp.nextLine();
		byte[] buff = theLine.getBytes(); //chuyen mang byte
		//dong goi vao datagram
		DatagramPacket datagramPacket = new DatagramPacket(buff, buff.length);
		InetAddress addressABC = InetAddress.getByName(hostABC);
		datagramPacket.setAddress(addressABC);
		datagramPacket.setPort(9);
		//gui di
		socket.send(datagramPacket);
		if ( dem<100) dem ++;
		else {break;}
		}	
	}
}

