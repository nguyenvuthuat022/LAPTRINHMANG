package UDP;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
	public static void main(String[] args) throws IOException {
		//lang nghe cong so 9
		DatagramSocket server = new DatagramSocket(9);
		
		byte[] buffer = new byte[1000];
		DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
		while (true) {
		//nhan ve , dua vao packet udp
		server.receive(packet);
		String s = new String(packet.getData(), 0, packet.getLength());
		System.out.print(packet.getAddress() + " at port " + packet.getPort() + " says " + s);
	}
}
}
