package sub2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/*
 * ��¥ : 2020/11/24
 * �̸� : ���ϸ�
 * ���� : TCP ������� ���α׷��� ���� p529
 */
public class TcpClient {

	public static void main(String[] args) throws IOException {
		
		Socket socket = new Socket();
		
		System.out.println("���� ��û...");
		
		socket.connect(new InetSocketAddress("127.0.0.1",5001)); //localhost �־ ��
		
		System.out.println("���� ����!!!");

		//������ �����ϱ�
		OutputStream os = socket.getOutputStream();
		String message = "Hello Server";
		
		byte[] msgByte = message.getBytes();
		os.write(msgByte);
		os.flush();
		
		
		if(!socket.isClosed()) {
			socket.close();
		}
		
		System.out.println("TcpClient ����...");
		
		
	}
}
