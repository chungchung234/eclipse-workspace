package TCPServer.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerThread extends Thread{
	Socket socket;
	
	List<Socket> list = new ArrayList<>();
	
	public ServerThread(Socket socket, List<Socket> list) {
		this.socket = socket;
		this.list = list;
	}
	
	@Override
	public void run() {
		super.run();

		try {
			while(true) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String str= reader.readLine();
				if(str != null) {
					System.out.println("client로부터 받은 메세지 :" +str);
				}
				PrintWriter writer;
				for(Socket sc : list) {
					if(sc != socket) {
						writer = new PrintWriter(socket.getOutputStream());
						writer.println(str);
						writer.flush();						
					

					}
				}
				//성신(send)

				Thread.sleep(300);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}
	
}
