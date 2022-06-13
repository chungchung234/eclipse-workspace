package TCPServer.Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class MainClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket clientSocket = null;
		//문지기 소캣
		ServerSocket serSocket = new ServerSocket(9000);
		//버전확인, binding, listen
		//문지기 소캣으로 하나만 존재하며 이 소캣을 통해서 통신
		ArrayList<Socket> list = new ArrayList<Socket>();
		
		
		
		while(true) {
			System.out.println("접속 대기중...");
			clientSocket = serSocket.accept();
			list.add(clientSocket);
			
			
			//접속 clien 확인
			System.out.println("Client IP : "+clientSocket.getInetAddress()+
					"Port : "+clientSocket.getPort());
			
			
			
		}
//		while(true) {
//					BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//		String str= reader.readLine();
//		
//		System.out.println("client로부터 받은 메세지 :" +str);
//		
//		//성신(send)
//		PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
//		writer.println(str);
//		writer.flush();
//		}
		//수신(recv)

		
		//clientSocket.close();
	//	serSocket.close();
		
	}

}
